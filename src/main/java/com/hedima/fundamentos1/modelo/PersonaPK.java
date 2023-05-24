package com.hedima.fundamentos1;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PersonaPK implements Serializable {

    // Solo los campos que forman la PK
    @Column(name="telefono")
    private Long telefono;
    @Column(name="nif")
    private String nif;



}