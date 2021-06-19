/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Weslei
 */
public class Category implements Cloneable {

    private String name;
    private String description;

    public Category(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + name + '\'' +
                ", descrição=" + description +
                '}';
    }
    
}
