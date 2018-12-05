package com.company.domain.product.repository.flow;

import com.company.domain.product.entity.Product;
import com.company.infrastructure.raf.RafWriter;

public class FlowRepository implements FlowRepositoryInterface {

    private RafWriter rafWriter;

    public FlowRepository(RafWriter rafWriter) {
        this.rafWriter = rafWriter;
    }

    @Override
    public boolean entry(Product product) {

        //this.rafWriter.getArquivo();
        return false;
    }

    @Override
    public boolean output(Product product) {
        return false;
    }
}
