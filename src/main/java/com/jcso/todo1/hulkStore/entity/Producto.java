package com.jcso.todo1.hulkStore.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "productos")
@Data
public class Producto implements Serializable {

    private static final long serialVersionUID = -235904457026479075L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    private Long cantidad;

    @PrePersist
    public void prePersist() {
        this.createAt = new Date();
    }
}
