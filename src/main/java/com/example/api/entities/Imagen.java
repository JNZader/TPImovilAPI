package com.example.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "imagenes")
@Audited
public class Imagen extends Base{
    @Column
    private String name;

    @Column
    private String imageUrl;

    @Column
    private String imageId;

    @Column(columnDefinition = "text")
    private String descripcion;

}
