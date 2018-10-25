package com.shopping_car.cart.model;

import com.shopping_car.product.model.*;

public class Cart {
    private String id;
    private String name;
    private Product products;

    public Cart(String id, String name, Product products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public Cart() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }
}
