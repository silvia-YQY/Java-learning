package com.shopping_car.product.model;

public class UpdateProductRequest {
    private String name;
    private String description;
    private long price;

    public UpdateProductRequest(String name, String description, long price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public UpdateProductRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
