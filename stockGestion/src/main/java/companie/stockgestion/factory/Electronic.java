/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companie.stockgestion.factory;

/**
 *
 * @author juliettead
 */
public class Electronic extends Product {
    private final String Processor;
    private final float weight;
    private final String mark;

    protected Electronic(String Processor, float weight,
            String mark, String name, String origin, float price) {
        super(name, origin, price);
        this.Processor = Processor;
        this.weight = weight;
        this.mark = mark;
    }

    public String getProcessor() {
        return Processor;
    }

    public float getWeight() {
        return weight;
    }

    public String getMark() {
        return mark;
    }
}
