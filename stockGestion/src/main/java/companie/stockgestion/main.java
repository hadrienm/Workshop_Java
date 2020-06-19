/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companie.stockgestion;

import companie.stockgestion.product.Fruit;
import companie.stockgestion.product.Electronic;

/**
 *
 * @author juliettead
 */

public class main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        ListProductGestion listproGestion = new ListProductGestion();
        Electronic computeur = controller.commandProduct("Intel 8th",
                3.0f, "Lenovo", "t480", "China", 980.5f);
        Fruit banana = controller.commandProduct("yellow", "banana",
                "French", 2.0f);
        listproGestion.addProductToList(banana);
        listproGestion.addProductToList(computeur);
        listproGestion.displayList();
        listproGestion.deleteProductToList(computeur);
        controller.updateName(banana, "Banane");
        listproGestion.displayList(); 
    }
}
