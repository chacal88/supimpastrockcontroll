package com.company.domain.product.service.flow;

import com.company.domain.product.entity.Product;
import com.company.domain.product.repository.flow.FlowRepositoryInterface;

public class FlowService implements FlowServiceInterface {

    private FlowRepositoryInterface flowRepository;

    public FlowService(FlowRepositoryInterface flowRepository) {
        this.flowRepository = flowRepository;
    }

    @Override
    public boolean entry(Product product) {
        return false;
    }

    @Override
    public boolean output(Product product) {
        return false;
    }

}
