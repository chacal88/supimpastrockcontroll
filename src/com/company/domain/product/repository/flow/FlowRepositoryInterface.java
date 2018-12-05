package com.company.domain.product.repository.flow;

import com.company.domain.product.entity.Product;

public interface FlowRepositoryInterface {

    public boolean entry(Product product);

    public boolean output(Product product);
}
