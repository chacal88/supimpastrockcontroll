package com.company.domain.product.service.flow;

import com.company.domain.product.repository.flow.FlowRepositoryFactory;
import com.company.domain.product.repository.flow.FlowRepositoryInterface;
import com.company.domain.product.repository.product.ProductRepository;
import com.company.domain.product.repository.product.ProductRepositoryInterface;
import com.company.infrastructure.raf.RafWriteEnum;
import com.company.infrastructure.raf.RafWriterFactory;

public class FlowServiceFactory {

    public FlowServiceInterface make() {

        FlowRepositoryFactory flowRepositoryFactory = new FlowRepositoryFactory();
        FlowRepositoryInterface flowRepository = flowRepositoryFactory.make();

        return new FlowService(flowRepository);

    }
}
