package com.company.domain.product.service.readjustment;

import com.company.domain.product.entity.Product;
import com.company.domain.product.service.ServiceInterface;

import java.util.ArrayList;

interface ReadjustmentServiceInterface extends ServiceInterface {

    public boolean readjustment(ArrayList<Product> list);
}
