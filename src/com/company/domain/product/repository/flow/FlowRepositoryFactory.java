package com.company.domain.product.repository.flow;

import com.company.infrastructure.raf.RafWriteEnum;
import com.company.infrastructure.raf.RafWriterFactory;

public class FlowRepositoryFactory {

    public FlowRepositoryInterface make() {

        RafWriterFactory rafWriterFactory = new RafWriterFactory();

        return new FlowRepository(rafWriterFactory.make(RafWriteEnum.FLOW));
    }
}
