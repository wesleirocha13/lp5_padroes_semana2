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
public class Product implements Cloneable{

    private String name;
    private String description;
    private Category category;
    private float value;
    
    public Product(String name, String description, Category category, float value) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.value = value;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getValue() {
        return value;
    }
    
    public void setValue(float value) {
        this.value = value;
    }
    
    @Override
    public Product clone() throws CloneNotSupportedException {
        Product productClone = (Product) super.clone();
        productClone.category = (Category) productClone.category.clone();
        return productClone;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome=" + name +
                ", descrição='" + description + '\'' +
                ", categoria=" + category +
                ", valor='" + value + '\'' +
                '}';
    }
     
}
