package com.shopping_car.product;

import com.shopping_car.product.model.*;
import com.shopping_car.product.validator.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

public class ProductController {

    // 依赖注入
    private CreateProductRequestValidator createProductRequestValidator;

    public ProductController(CreateProductRequestValidator createProductRequestValidator) {
        this.createProductRequestValidator = createProductRequestValidator;
    }

    /**
     * list products
     * @return
     */
    @GetMapping("./products")
    public ResponseEntity<ListProductResponse> listProducts(){
        return new ResponseEntity<>(new ListProductResponse(), HttpStatus.OK);
    }


    /**
     * get product
     * @return
     */
    @GetMapping("./products/{productId}")
    public ResponseEntity<GetProductResponse> getProducts(@PathVariable String productId){
        return new ResponseEntity<>(new GetProductResponse(), HttpStatus.OK);
    }


    /**
     * create product
     * @param CreateProductRequest
     * @return
     */
    @PostMapping("./products")
    public ResponseEntity<CreateProductResponse> creatProducts(@RequestBody CreateProductRequest CreateProductRequest){

        // 校验
        boolean  validate = createProductRequestValidator .validate(CreateProductRequest);

        // 实现返回
        return new ResponseEntity<>(new CreateProductResponse(), HttpStatus.CREATED);
    }

    /**
     * 已经定义好了输入和输出的格式！
     * 同时也定义好了期望的输入内容和相对应的执行结果。
     * 相当于controller就是一个黑箱，请求路由时直接输入指定内容，由每一个相对应的类操作，再返回指定结果
     *
     * 在此，也可以写单元测试，即使没有实现，但是起始状态测试时不能通过，只是用来帮助我们明确功能
     * 开发就装换成写代码让测试通过  ---》 符合功能的逻辑要求  ---》 这就是测试驱动开发。TDD。
     */

    /**
     *
     * @param productId
     * @param updateProductRequset
     * @return
     */
    @PutMapping("./products/{productId}")
    public ResponseEntity<UpdateProductResponse> updateProducts(@PathVariable String productId, @RequestBody UpdateProductRequest updateProductRequset){
        return new ResponseEntity<>(new UpdateProductResponse(), HttpStatus.OK);
    }

}
