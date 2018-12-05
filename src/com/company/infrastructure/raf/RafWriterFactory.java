package com.company.infrastructure.raf;

public class RafWriterFactory {

    public RafWriter make(RafWriteEnum fileName) {
        switch (fileName) {
            case PRODUCT:
                return new RafWriter("product");
            case FLOW:
                return new RafWriter("flow");
        }
        return null;
    }
}
