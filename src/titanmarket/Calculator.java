/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package titanmarket;

/**
 *
 * @author Amar Tursic
 */
public class Calculator {
    
    public String itemNameCalc;
    public int amountCalc;
    public int priceCalc;  
    
    
    //Constructor
    Calculator(String itemName, int amountCalc, int priceCalc){
        this.itemNameCalc = itemName;
        this.amountCalc = amountCalc;
        this.priceCalc = priceCalc;
    }

    public String getItemNameCalc() {
        return itemNameCalc;
    }

    public void setItemNameCalc(String itemNameCalc) {
        this.itemNameCalc = itemNameCalc;
    }

    public int getAmountCalc() {
        return amountCalc;
    }

    public void setAmountCalc(int amountCalc) {
        this.amountCalc = amountCalc;
    }

    public int getPriceCalc() {
        return priceCalc;
    }

    public void setPriceCalc(int priceCalc) {
        this.priceCalc = priceCalc;
    }
    
    
    
}


