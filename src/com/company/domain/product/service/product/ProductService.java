package com.company.domain.product.service.product;

import com.company.domain.product.entity.Product;
import com.company.domain.product.repository.product.ProductRepositoryInterface;

import java.util.ArrayList;

public class ProductService implements ProductServiceInterface {

    private ProductRepositoryInterface productRepository;

    public ProductService(ProductRepositoryInterface productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product insert(Product product) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public ArrayList<Product> findByName(String nome) {
        return null;
    }

    @Override
    public boolean delete(int idProduct) {
        return false;
    }

}
