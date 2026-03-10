package co.istad.lily.a01a1webmvc.controller;


import co.istad.lily.a01a1webmvc.dto.CreateProductRequest;
import co.istad.lily.a01a1webmvc.dto.ProductResponse;
import co.istad.lily.a01a1webmvc.dto.UpdateProductRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@Slf4j
public class ProductController {
    @GetMapping
    public List<CreateProductRequest> getProducts(
            @RequestParam(required = false,defaultValue = "0") int pageNumber,
            @RequestParam(required = false, defaultValue = "20") int pageSize,
            @RequestParam(required = false, defaultValue = "") String name
    ){
        log.info("pageName {}, pageSize{}, name {}" , pageNumber,pageSize,name);
        return List.of();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createProduct(
            @RequestBody CreateProductRequest createProductRequest
    ){
       log.info("createProductRequest: {}", createProductRequest);
    }

    @PutMapping("/{code}")
    public void updateProductByCode(
            @PathVariable String code,
            @RequestBody UpdateProductRequest updateProductRequest){
        log.info("updateProductByCode: {}", code);
        log.info("updateProductRequest: {}", updateProductRequest);
    }


    @PatchMapping("/{code}")
    public void patchProductByCode(
            @PathVariable String code,
            @RequestBody UpdateProductRequest updateProductRequest

            ){
        log.info("updateProductByCode: {}", code);
        log.info("updateProductRequest: {}", updateProductRequest);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{code}")
    public void delete(
            @PathVariable String code
    ){
        log.info("code: {}", code);
    }

   @GetMapping("/{code}")
 public ProductResponse getProductByCode(@PathVariable String code){
   log.info("getProductByCode: {}" , code);
   return null;
  }


}
