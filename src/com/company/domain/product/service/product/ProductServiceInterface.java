package com.company.domain.product.service.product;

import com.company.domain.product.entity.Product;
import com.company.domain.product.service.ServiceInterface;

import java.util.ArrayList;

public interface ProductServiceInterface extends ServiceInterface {

    public Product insert(Product product);

    public Product update(Product product);

    public ArrayList<Product> findByName(String nome);

    public boolean delete(int idProduct);
}
