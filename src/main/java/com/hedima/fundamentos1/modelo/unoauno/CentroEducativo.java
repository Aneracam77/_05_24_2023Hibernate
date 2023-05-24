package com.hedima.fundamentos1.modelo.unoauno;

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
    //Tenemos que ponerlo cuando el from nos lo pida la informacion
    @OneToOne(mappedBy = "ce", cascade = CascadeType.ALL,fetch = FetchType.EAGER)//El nombre del centro concertado de la pestaña Concertado
    private Concertado c;

}
/*package com.hedima.fundamentos1.modelo.unoauno;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "centros_educativos")
public class CentroEducativos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCentro;
    @Column(length = 30, nullable = false)
    private String nombreCentro;
    @Column(length = 80, nullable = false)
    private String direccion;
    private int plazas;
}*/