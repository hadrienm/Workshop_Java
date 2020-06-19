/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companie.stockgestion.product;

/**
 *
 * @author juliettead
 */
public class Product {
    private String name;
    private final String origin;
    private float price;

    protected Product(String name, String origin, float price) {
        this.name = name;
        this.price = price;
        this.origin = origin;
    }    

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getOrigin() {
        return origin;
    }
    
    protected void setName(String name) {
        this.name = name;
    }
    
    protected void setPrice(float price) {
        this.price = price;
    }
}
