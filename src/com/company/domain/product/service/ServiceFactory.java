package com.company.domain.product.service;

import com.company.domain.product.service.flow.FlowServiceFactory;
import com.company.domain.product.service.product.ProductServiceFactory;
import com.company.domain.product.service.readjustment.ReadjustmentServiceFactory;

public class ServiceFactory {

    public ServiceInterface make(ServiceEnum service) {
        switch (service) {
            case PRODUCT:
                ProductServiceFactory productFactory = new ProductServiceFactory();
                return productFactory.make();
            case FLOW:
                FlowServiceFactory flowFactory = new FlowServiceFactory();
                return flowFactory.make();
            case READJUSTMENT:
                ReadjustmentServiceFactory readjustmentFactory = new ReadjustmentServiceFactory();
                return readjustmentFactory.make();
        }
        return null;
    }
}
