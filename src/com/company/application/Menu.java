package com.company.application;

import com.company.domain.product.service.ServiceEnum;
import com.company.domain.product.service.ServiceFactory;
import com.company.domain.product.service.ServiceInterface;
import javax.swing.JOptionPane;
public class Menu {

    private ServiceInterface productService;
    private ServiceInterface flowService;
    private ServiceInterface readjustmentService;

    public Menu() {
        ServiceFactory serviceFactory = new ServiceFactory();
        this.productService = serviceFactory.make(ServiceEnum.PRODUCT);
        this.flowService = serviceFactory.make(ServiceEnum.FLOW);
        this.readjustmentService = serviceFactory.make(ServiceEnum.READJUSTMENT);
    }

    public void execute(){

        //implementar o medu

        Integer.parseInt(JOptionPane.showInputDialog(" XYZ COMERCIO DE PRODUTOS LTDA.\r\n" +
                "SISTEMA DE CONTROLE DE ESTOQUE\r\n\n" +
                "MENU PRINCIPAL\r\n\n" +
                "1 - CADASTRO DE PRODUTOS\r\n" +
                "2 - MOVIMENTAÇÃO\r\n" +
                "3 - REAJUSTE DE PREÇOS\r\n" +
                "4 - RELATÓRIOS\r\n" +
                "0 - FINALIZAR\r\n"));
    }
}
