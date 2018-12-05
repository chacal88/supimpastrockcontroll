package com.company.domain.product.service.flow;

import com.company.domain.product.entity.Product;
import com.company.domain.product.service.ServiceInterface;

public interface FlowServiceInterface extends ServiceInterface {

    public boolean entry(Product product);

    public boolean output(Product product);
}
