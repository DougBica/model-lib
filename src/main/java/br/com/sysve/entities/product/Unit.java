package br.com.sysve.entities.product;


import br.com.sysve.entities.BasicEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "unit")
public class Unit extends BasicEntity {

    private String description;

    protected Unit(){}

    public Unit(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
