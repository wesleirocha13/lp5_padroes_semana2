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
public class ServiceComplaint {
    
    public String create() {
        return "Reclamação criada";
    }

    public String cancel() {
        return "Reclamação cancelada";
    }
    
    public String finish() {
        return "Reclamação finalizada";
    }
}
