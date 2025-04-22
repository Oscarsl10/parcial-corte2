package com.corhuila.parcial.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mesa")
public class Mesa extends ABaseEntity{

    @Column(name = "num_mesas")
    private Integer num_mesas;

    public Integer getNum_mesas() {
        return num_mesas;
    }

    public void setNum_mesas(Integer num_mesas) {
        this.num_mesas = num_mesas;
    }
}
