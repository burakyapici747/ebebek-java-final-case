package model;

import java.util.UUID;

public class Product {
    protected UUID id;
    protected Double unitPrice;
    protected Double discountRate;
    protected Integer amountOfStock;
    protected String name;
    protected ProductGroup productGroup;
    protected Brand brand;

    public Product(UUID id,
                   Double unitPrice,
                   Double discountRate,
                   Integer amountOfStock,
                   String name,
                   ProductGroup productGroup,
                   Brand brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.name = name;
        this.productGroup = productGroup;
        this.brand = brand;
    }

    public UUID getId() {
        return id;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public Integer getAmountOfStock() {
        return amountOfStock;
    }

    public String getName() {
        return name;
    }

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public Brand getBrand() {
        return brand;
    }
}
