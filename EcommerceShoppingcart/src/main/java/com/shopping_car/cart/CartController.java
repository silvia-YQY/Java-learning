package com.shopping_car.cart;

import com.shopping_car.cart.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class CartController {

    /**
     *
     * @return
     */
    @GetMapping("./carts/")
    public ResponseEntity<ListCartResponse> Listcart(){
        return new ResponseEntity<>(new ListCartResponse(), HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @GetMapping("./carts/{cartId}")
    public ResponseEntity<GetCartResponse> Getcart(){
        return new ResponseEntity<>(new GetCartResponse(), HttpStatus.OK);
    }

    /**
     *
     * @param name
     * @param UpdateCartRequest
     * @return
     */
    @PutMapping("./carts/{cartId")
    public ResponseEntity<UpdateCartResponse> updateProducts(@PathVariable String name, @RequestBody UpdateCartRequest UpdateCartRequest){
        return new ResponseEntity<>(new UpdateCartResponse(), HttpStatus.OK);
    }
}
