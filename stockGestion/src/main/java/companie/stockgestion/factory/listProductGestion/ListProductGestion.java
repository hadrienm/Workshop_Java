/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companie.stockgestion.factory.listProductGestion;

import companie.stockgestion.factory.Electronic;
import companie.stockgestion.factory.Fruit;
import companie.stockgestion.factory.Product;
import java.util.ArrayList;

/**
 *
 * @author juliettead
 */
public final class ListProductGestion {
    private ArrayList<Product> productList = new ArrayList<>();
    public ListProductGestion() {
    }
    
    public ListProductGestion(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public void displayList() {
        productList.forEach(Product -> {
            if (Product instanceof Electronic) {
                Electronic electronic = (Electronic)Product;
                System.out.println(electronic.getName() + ", "
                + electronic.getOrigin() + ", "
                + electronic.getPrice() + "€, "
                + electronic.getMark() + ", "
                + electronic.getWeight() + "kg, "
                + electronic.getProcessor());
            } else if (Product instanceof Fruit) {
                Fruit fruit = (Fruit)Product;
                System.out.println(fruit.getName() + ", "
                + fruit.getOrigin() + ", "
                + fruit.getPrice() + "€, "
                + fruit.getColor());
            }
        });
    }

    public void addProductToList(Product product) {
        this.productList.add(product);
    }
    
    public void deleteProductToList(Product product) {
        this.productList.remove(product);
    }
    
    public ArrayList<Product> getProductList() {
        return productList;
    }
    
}
