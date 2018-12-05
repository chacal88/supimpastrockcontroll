package com.company.domain.product.service.product;

import com.company.domain.product.repository.flow.FlowRepositoryFactory;
import com.company.domain.product.repository.flow.FlowRepositoryInterface;
import com.company.domain.product.repository.product.ProductRepository;
import com.company.domain.product.repository.product.ProductRepositoryFactory;
import com.company.domain.product.repository.product.ProductRepositoryInterface;
import com.company.domain.product.service.flow.FlowService;
import com.company.domain.product.service.flow.FlowServiceInterface;

public class ProductServiceFactory {

    public ProductServiceInterface make() {

        ProductRepositoryFactory productRepositoryFactory = new ProductRepositoryFactory();
        ProductRepositoryInterface productRepository = productRepositoryFactory.make();

        return new ProductService(productRepository);

    }
}
