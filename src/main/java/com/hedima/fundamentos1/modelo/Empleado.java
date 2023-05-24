package com.hedima.fundamentos1.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // genera el mapeo entre la tabla y la clase
@Table(name = "empleados")

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    @Column(nullable = false,length =60)
    private String nombre;
    @Column(nullable = false)
    private int edad;
    @Column(nullable = false,length =40)
    private String puesto;
}
