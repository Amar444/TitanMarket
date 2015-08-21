/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package titanmarket;

/**
 *
 * @author Amar Tursic
 */
public class tableList {
    public static int aantalItems;
    public int id;
    public int dag;
    public int maand;
    public int jaar;
    public String itemName;
    public String boughtOrSold;
    int amount;
    public int price;

    //Constructor
    tableList(int dag, int maand, int jaar, String itemName, String boughtOrSold, int amount, int price){
        this.id = aantalItems++;
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
        this.itemName = itemName;
        this.boughtOrSold = boughtOrSold;
        this.amount = amount;
        this.price = price;
    }
    
    
}
