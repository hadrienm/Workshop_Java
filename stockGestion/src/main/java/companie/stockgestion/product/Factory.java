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
public class Factory {
    public Factory() {
    }
    
    protected Electronic createProduct(String processor,
            float weight, String mark, String name, String origin,
            float price) {
        Electronic electronic = new Electronic(processor,
                weight, mark, name, origin, price);
        return electronic;
    }
    
    protected Fruit createProduct(String color, String name,
            String origin, float price) {
        Fruit fruit = new Fruit(color, name, origin, price);
        return fruit;
    }
    
    protected void updateNameProduct(Product product, String name) {
        product.setName(name);    
    }
    
    protected void updatePriceProduct(Product product, float price) {
        product.setPrice(price);    
    }
}
