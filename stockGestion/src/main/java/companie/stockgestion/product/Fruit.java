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
public class Fruit extends Product{
    private final String color;

    protected Fruit(String color, String name,
            String origin, float price) {
        super(name, origin, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
