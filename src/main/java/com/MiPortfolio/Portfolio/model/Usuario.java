package com.MiPortfolio.Portfolio.model;

import com.sun.istack.NotNull;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //mapea la entidad
@Table(name = "usuario") //crea y nombra la tabla usuario
@AllArgsConstructor //constructor con argumentos
@NoArgsConstructor //constructor vacío
@Data //gatters y setters

public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long Id;
    
    private String usuario;
    private String contrasenia;
    private String role;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idPersona")
    private Persona persona;
    
}
