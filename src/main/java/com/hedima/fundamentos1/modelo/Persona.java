package com.hedima.fundamentos1;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="personas")
public class Persona implements Serializable {

    private static final long serialVersionUID = -9014986003273703863L;

    //	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
    @EmbeddedId
    private PersonaPK pk;
    @Column(nullable = false, length =20)
    private String nombre;
    @Column(nullable = false, length =20)
    private String apellido;

    private char sexo;

    private int edad;


    private LocalDate fechaNacimiento;
    private String curriculum;






}