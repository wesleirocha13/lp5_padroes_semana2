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
public class ServiceDevolution implements IService{
    public String create() {
        return "Devolução criada";
    }

    public String cancel() {
        return "Devolução cancelada";
    }
    
    public String finish() {
        return "Devolução finalizada";
    }
}
