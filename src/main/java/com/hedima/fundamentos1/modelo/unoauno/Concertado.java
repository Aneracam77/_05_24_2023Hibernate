package com.hedima.fundamentos1.modelo.unoauno;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "concertados")
public class Concertado {
    @Id
    private int idCentro;
    private double comision;
    @Column(length = 40)
    private String agrupacion;

    //atributo de la clase centroeducativo
    @OneToOne
    @JoinColumn(name = "id_centro",nullable = false,
    foreignKey = @ForeignKey (name= "fk_empleados_departamentos"))

    private CentroEducativo ce ;
}
