/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package titanmarket;

import java.util.List;

public class Item {
    public String itemName;
    public int stockAmount = 0;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    //Constructor
    public Item(String name){
        itemName = name;
    }
    
}
