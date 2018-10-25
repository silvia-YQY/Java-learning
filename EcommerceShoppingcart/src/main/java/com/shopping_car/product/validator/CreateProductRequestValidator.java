package com.shopping_car.product.validator;

import com.shopping_car.product.model.CreateProductRequest;
import org.springframework.stereotype.Component;

// 校验组件
@Component
public class CreateProductRequestValidator {
    public boolean validate(CreateProductRequest createProductRequest){
        if(createProductRequest.getPrice() < 0){
            return false;
        }

        if(createProductRequest.getName().length() <= 0){
            return false;
        }
        return true;
    }
}
