package model;

import java.util.UUID;

public class Notebook extends Product{
    private Double RAM;
    private Double memoryInGB;
    private MemoryType memoryType;
    private Double screenSizeInInch;

    public Notebook(UUID id,
                    Double unitPrice,
                    Double discountRate,
                    Integer amountOfStock,
                    String name,
                    ProductGroup productGroup,
                    Brand brand,
                    Double RAM,
                    Double memoryInGB,
                    MemoryType memoryType,
                    Double screenSizeInInch) {
        super(id, unitPrice, discountRate, amountOfStock, name, productGroup, brand);
        this.RAM = RAM;
        this.memoryInGB = memoryInGB;
        this.memoryType = memoryType;
        this.screenSizeInInch = screenSizeInInch;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "RAM=" + RAM +
                ", memoryInGB=" + memoryInGB +
                ", memoryType=" + memoryType +
                ", screenSizeInInch=" + screenSizeInInch +
                ", id=" + id +
                ", unitPrice=" + unitPrice +
                ", discountRate=" + discountRate +
                ", amountOfStock=" + amountOfStock +
                ", name='" + name + '\'' +
                ", productGroup=" + productGroup +
                ", brand=" + brand +
                "} " + super.toString();
    }
}
