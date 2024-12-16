package com.example.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "usuarios")
@Audited
public class Usuario extends Base{
    @Column
    private String nombre;

    @Column
    private String email;

    @Column
    private String redSocial;

    @OneToOne
    @JoinColumn(name = "id_foto_perfil",
            referencedColumnName = "id")
    private Imagen fotoPerfil;
}
