package com.company.domain.product.repository.product;

import com.company.infrastructure.raf.RafWriteEnum;
import com.company.infrastructure.raf.RafWriter;
import com.company.infrastructure.raf.RafWriterFactory;

public class ProductRepositoryFactory {

    public ProductRepositoryInterface make() {

        RafWriterFactory rafWriterFactory = new RafWriterFactory();
        RafWriter rafWriter = rafWriterFactory.make(RafWriteEnum.PRODUCT);

        return new ProductRepository(rafWriter);

    }
}
