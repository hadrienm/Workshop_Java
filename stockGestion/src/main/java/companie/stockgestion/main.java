/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companie.stockgestion;

import companie.stockgestion.factory.Fruit;
import companie.stockgestion.factory.Electronic;
import companie.stockgestion.factory.Factory;
import companie.stockgestion.factory.listProductGestion.ListProductGestion;

/**
 *
 * @author juliettead
 */
public class main {
    public static void main(String[] args) {
        ListProductGestion listproGestion = new ListProductGestion();
        Factory factory = new Factory();
        Electronic computeur = factory.createProduct("Intel 8th",
                3.0f, "Lenovo", "t480", "China", 980.5f);
        Fruit banana = factory.createProduct("yellow", "banana",
                "French", 2.0f);
        listproGestion.addProductToList(banana);
        listproGestion.addProductToList(computeur);
        listproGestion.displayList();
        listproGestion.deleteProductToList(computeur);
        factory.updateNameProduct(banana, "Banane");
        listproGestion.displayList();
    }
}
