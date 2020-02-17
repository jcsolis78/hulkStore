package com.jcso.todo1.hulkStore.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "clientes")
@Data
public class Cliente implements Serializable {

    private static final long serialVersionUID = 9209551646155262777L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    @NotEmpty(message = "no puede estar vacio.")
    private String nombre;

    @Column(nullable=false)
    @NotEmpty(message = "no puede estar vacio.")
    private String apellido;

    @Column(nullable=false, unique=false)
    @NotEmpty(message = "no puede estar vacio.")
    @Email(message = "no es un formato valido.")
    private String email;

    @NotNull(message = "no puede estar vacio.")
    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @JsonIgnoreProperties(value = {"cliente", "hibernateLazyInitializer","handler"}, allowSetters = true)
    @OneToMany(fetch=FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Factura> facturas;
}
