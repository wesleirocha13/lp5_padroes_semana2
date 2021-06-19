/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.factory;
import factorymethod.model.IService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *factorymethod.model.ServiceOrder@4516af24
 * factorymethod.model.ServiceOrder@4516af24
 * @author Weslei
 */
public class EcommerceServiceFactoryTest {
        
    @Test
    public void returnExceptionForExistentService() {        
        try {
            IService service = EcommerceServiceFactory.getService("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ação inexistente", e.getMessage());
        }        
    }
    
    @Test
    public void returnExceptionForInvalidService() {        
        try {
            IService service = EcommerceServiceFactory.getService("Complaint");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ação inválida", e.getMessage());
        }        
    }
    
}
