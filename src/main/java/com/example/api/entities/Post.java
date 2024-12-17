package com.example.api.entities;

import jakarta.persistence.*;
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
@Table(name = "posts")
@Audited
public class Post extends Base {
    @Column
    private String titulo;
    @Column
    private String descripcion;
    @Column
    private String categoria;
    @Column
    private Integer duracion;
    @Column
    private Double presupuesto;
    @OneToOne
    @JoinColumn(name = "id_usuario",
            referencedColumnName = "id")
    private Usuario usuario;
    @OneToMany(mappedBy = "post")
    private Set<Comentario> postComentarios;
    @ManyToMany
    @JoinTable(
            name = "post_imagen",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "imagen_id")
    )
    private Set<Imagen> postImagenes;
}
