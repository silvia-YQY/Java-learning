package com.shopping_car.product.model;
import java.util.*;

public class ListProductResponse {
    private List<Product> product;

    public ListProductResponse() {
    }

    public ListProductResponse(List<Product> product) {
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
