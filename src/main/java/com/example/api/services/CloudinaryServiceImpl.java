package com.example.api.services;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;
import java.util.Objects;

@Service
public class CloudinaryServiceImpl implements CloudinaryService {

    private final Cloudinary cloudinary;

    public CloudinaryServiceImpl() {
        Dotenv dotenv = Dotenv.load(); // Carga las variables de entorno desde .env
        cloudinary = new Cloudinary(
                ObjectUtils.asMap(
                        "cloud_name", dotenv.get("CLOUDINARY_CLOUD_NAME"),
                        "api_key", dotenv.get("CLOUDINARY_API_KEY"),
                        "api_secret", dotenv.get("CLOUDINARY_API_SECRET")
                )
        );
    }

    private File convert(MultipartFile multipartFile) throws IOException{
        File file=new File(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(multipartFile.getBytes());
        fileOutputStream.close();
        return file;
    }

    @Override
    public Map upload(MultipartFile multipartFile) throws IOException {
        File file=convert(multipartFile);
        Map result=cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
        if (!Files.deleteIfExists(file.toPath())){
            throw new IOException("Falla al borrar archivo temporal "+file.getAbsolutePath());
        }
        return result;
    }

    @Override
    public Map delete(String id) throws IOException {
        return cloudinary.uploader().destroy(id,ObjectUtils.emptyMap());
    }
}
