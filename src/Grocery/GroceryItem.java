package Grocery;

import java.util.ArrayList;

public class GroceryItem {
    private String itemName;
    private int itemQuantity;

    public GroceryItem(String itemName, int itemQuantity) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "itemName='" + itemName + '\'' +
                ", itemQuantity=" + itemQuantity +
                '}';
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
