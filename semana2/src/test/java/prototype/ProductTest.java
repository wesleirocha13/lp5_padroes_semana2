/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class ProductTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Product product = new Product("Notebook", "Notebook Acer", new Category("Eletrônicos", "Produtos eletrônicos"), 1000);

        Product productClone = product.clone();
        productClone.setName("Celular");
        productClone.setValue(800);
        productClone.getCategory().setName("Eletroportáteis");
        productClone.getCategory().setDescription("Eletrônicos portáteis");

        assertEquals("Produto{nome=Notebook, descrição='Notebook Acer', categoria=Categoria{nome='Eletrônicos', descrição=Produtos eletrônicos}, valor='1000.0'}", product.toString());
        assertEquals("Produto{nome=Celular, descrição='Notebook Acer', categoria=Categoria{nome='Eletroportáteis', descrição=Eletrônicos portáteis}, valor='800.0'}", productClone.toString());
    }
    
}
