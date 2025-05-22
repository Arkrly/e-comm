package com.web2_Ecomm.product_service.repository;

import com.web2_Ecomm.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
