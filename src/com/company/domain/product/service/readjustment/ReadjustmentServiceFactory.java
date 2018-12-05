package com.company.domain.product.service.readjustment;

import com.company.domain.product.repository.product.ProductRepositoryFactory;
import com.company.domain.product.repository.product.ProductRepositoryInterface;
import com.company.domain.product.service.product.ProductService;
import com.company.domain.product.service.product.ProductServiceInterface;

public class ReadjustmentServiceFactory {

    public ReadjustmentServiceInterface make() {

        ProductRepositoryFactory productRepositoryFactory = new ProductRepositoryFactory();
        ProductRepositoryInterface productRepository = productRepositoryFactory.make();
        return new ReadjustmentService(productRepository);

    }
}
