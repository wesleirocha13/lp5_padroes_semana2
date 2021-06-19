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
public class ServiceDevolutionTest {    
    /**
     * Test of create method, of class ServiceDevolution.
     */
    @Test
    public void createDevolution() {
        IService service = EcommerceServiceFactory.getService("Devolution");
        assertEquals("Devolução criada", service.create());
    }

    /**
     * Test of cancel method, of class ServiceDevolution.
     */
    @Test
    public void cancelDevolution() {
        IService service = EcommerceServiceFactory.getService("Devolution");
        assertEquals("Devolução cancelada", service.cancel());
    }

    /**
     * Test of finish method, of class ServiceDevolution.
     */
    @Test
    public void finishDevolution() {
        IService service = EcommerceServiceFactory.getService("Devolution");
        assertEquals("Devolução finalizada", service.finish());
    }
    
}
