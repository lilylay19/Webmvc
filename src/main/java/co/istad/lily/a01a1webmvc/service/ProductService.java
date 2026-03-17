package co.istad.lily.a01a1webmvc.service;

import co.istad.lily.a01a1webmvc.dto.CreateProductRequest;
import co.istad.lily.a01a1webmvc.dto.ProductResponse;

import java.util.concurrent.ThreadLocalRandom;

public interface ProductService {
    ProductResponse createNewProduct(CreateProductRequest createProductRequest);

}
