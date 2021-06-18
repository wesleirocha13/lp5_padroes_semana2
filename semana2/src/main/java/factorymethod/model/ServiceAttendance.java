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
public class ServiceAttendance implements IService{
    
    public String create() {
        return "Atendimento criado";
    }

    public String cancel() {
        return "Atendimento cancelado";
    }
    
    public String finish() {
        return "Atendimento finalizado";
    }
}
