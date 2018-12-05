package com.company.domain.product.service.readjustment;

import com.company.domain.product.entity.Product;
import com.company.domain.product.repository.product.ProductRepositoryInterface;

import java.util.ArrayList;

public class ReadjustmentService implements ReadjustmentServiceInterface {


    private ProductRepositoryInterface productRepository;

    public ReadjustmentService(ProductRepositoryInterface productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public boolean readjustment(ArrayList<Product> list) {
        return false;
    }

}
