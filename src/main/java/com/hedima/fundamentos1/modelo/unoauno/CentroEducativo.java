package com.hedima.fundamentos1.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "centros_educativos")

@Entity
public class CentroEducativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idCentro;
    @Column(length =30, nullable = false)
    private String nombreCentro;
    @Column(length =80, nullable = false)
    private String direccion;
    private int plazas;

}
