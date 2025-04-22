package com.corhuila.parcial.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "fecha_hora")
public class Fecha_hora extends ABaseEntity{

    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_hora;

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }
}
