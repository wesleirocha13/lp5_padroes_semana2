/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.model;
import factorymethod.factory.EcommerceServiceFactory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class ServiceOrderTest {
    
    /**
     * Test of create method, of class ServiceOrder.
     */
    @Test
    public void createOrder() {
        IService service = EcommerceServiceFactory.getService("Order");
        assertEquals("Pedido efetuado", service.create());
    }

    /**
     * Test of cancel method, of class ServiceOrder.
     */
    @Test
    public void cancelOrder() {
        IService service = EcommerceServiceFactory.getService("Order");
        assertEquals("Pedido cancelado", service.cancel());
    }

    /**
     * Test of finish method, of class ServiceOrder.
     */
    @Test
    public void finishOrder() {
        IService service = EcommerceServiceFactory.getService("Order");
        assertEquals("Pedido finalizado", service.finish());
    }
    
}
