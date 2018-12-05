package com.company.domain.product.repository.product;

import com.company.domain.product.entity.Product;
import com.company.infrastructure.raf.RafWriter;

import java.util.ArrayList;

public class ProductRepository implements ProductRepositoryInterface {

    private RafWriter rafWriter;

    public ProductRepository(RafWriter rafWriter) {
        this.rafWriter = rafWriter;
    }

    @Override
    public Product insert(Product product) {

        //this.rafWriter.getArquivo()...
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

    @Override
    public boolean readjustment(ArrayList<Product> list) {
        return false;
    }
}
