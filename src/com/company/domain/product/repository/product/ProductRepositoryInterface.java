package com.company.domain.product.repository.product;

import com.company.domain.product.entity.Product;

import java.util.ArrayList;

public interface ProductRepositoryInterface {

    public Product insert(Product product);

    public Product update(Product product);

    public ArrayList<Product> findByName(String nome);

    public boolean delete(int idProduct);

    public boolean readjustment(ArrayList<Product> list);
}
