/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companie.stockgestion;

import companie.stockgestion.product.Electronic;
import companie.stockgestion.product.Fruit;
import companie.stockgestion.product.Factory;
import companie.stockgestion.product.Product;

/**
 *
 * @author juliettead
 */
public class Controller extends Factory {
    protected Electronic commandProduct(String processor, float weight,
            String mark, String name, String origin, float price) {
        return this.createProduct(processor, weight, mark, name,
                origin, price);
    }
    protected Fruit commandProduct(String color, String name,
            String origin, float price) {
        return this.createProduct(color, name, origin, price);
    }
    @Override
    protected void updateNameProduct(Product product, String name) {
        this.updateNameProduct(product, name);
    }
    @Override
    protected void updatePriceProduct(Product product, float price) {
        this.updatePriceProduct(product, price);    
    }
}
