package com.shopping_car.cart.model;

import java.util.List;

public class ListCartResponse {
    private List<Cart> ListCart;

    public ListCartResponse(List<Cart> listCart) {
        ListCart = listCart;
    }

    public ListCartResponse() {
    }

    public List<Cart> getListCart() {
        return ListCart;
    }

    public void setListCart(List<Cart> listCart) {
        ListCart = listCart;
    }


}
