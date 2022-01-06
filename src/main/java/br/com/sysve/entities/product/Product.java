package br.com.sysve.entities.product;

import br.com.sysve.entities.BasicEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product extends BasicEntity {

    private String name;
    private Long quantity;
    private BigDecimal unitValue;
    private Long barCode;
    private String imagePath;

    protected Product(){}

    public Product(String name, Long quantity, BigDecimal unitValue, Long barCode, String imagePath) {
        this.name = name;
        this.quantity = quantity;
        this.unitValue = unitValue;
        this.barCode = barCode;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public BigDecimal getUnitValue() {
        return unitValue;
    }

    public Long getBarCode() {
        return barCode;
    }

    public String getImagePath() {
        return imagePath;
    }
}
