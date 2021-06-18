/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.factory;
import factorymethod.model.IService;

/**
 *
 * @author Weslei
 */
public class EcommerceServiceFactory {
    public static IService obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("semana2.factorymethod.model.Service" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Ação inexistente");
        }
        if (!(objeto instanceof IService)) {
            throw new IllegalArgumentException("Ação inválida");
        }
        return (IService) objeto;
    }
}


