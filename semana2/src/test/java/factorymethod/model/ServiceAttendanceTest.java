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
public class ServiceAttendanceTest {
    /**
     * Test of create method, of class ServiceAttendance.
     */
    @Test
    public void createAttendance() {
        IService service = EcommerceServiceFactory.getService("Attendance");
        assertEquals("Atendimento criado", service.create());
    }

    /**
     * Test of cancel method, of class ServiceAttendance.
     */
    @Test
    public void cancelAttendance() {
        IService service = EcommerceServiceFactory.getService("Attendance");
        assertEquals("Atendimento cancelado", service.cancel());
    }

    /**
     * Test of finish method, of class ServiceAttendance.
     */
    @Test
    public void finishAttendance() {
        IService service = EcommerceServiceFactory.getService("Attendance");
        assertEquals("Atendimento finalizado", service.finish());
    }
    
}
