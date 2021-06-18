/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.model;

/**
 *
 * @author Weslei
 */
public class ServiceOrder implements IService {
    
    public String create() {
        return "Pedido efetuado";
    }

    public String cancel() {
        return "Pedido cancelado";
    }
    
    public String finish() {
        return "Pedido finalizado";
    }
}
