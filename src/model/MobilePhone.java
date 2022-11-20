package model;

import java.util.UUID;

public class MobilePhone extends Product{
    private Integer memory;
    private Double screenSizeInInch;
    private Integer batteryPower;
    private Integer RAM;
    private String color;

    public MobilePhone(UUID id,
                       Double unitPrice,
                       Double discountRate,
                       Integer amountOfStock,
                       String name,
                       ProductGroup productGroup,
                       Brand brand,
                       Integer memory,
                       Double screenSizeInInch,
                       Integer batteryPower,
                       Integer RAM,
                       String color) {
        super(id, unitPrice, discountRate, amountOfStock, name, productGroup, brand);
        this.memory = memory;
        this.screenSizeInInch = screenSizeInInch;
        this.batteryPower = batteryPower;
        this.RAM = RAM;
        this.color = color;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "memory=" + memory +
                ", screenSizeInInch=" + screenSizeInInch +
                ", batteryPower=" + batteryPower +
                ", RAM=" + RAM +
                ", color='" + color + '\'' +
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
