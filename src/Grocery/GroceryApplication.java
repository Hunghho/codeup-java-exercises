package Grocery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import util.Input;

public class GroceryApplication {
   ArrayList<Poultry> poultryList = new ArrayList<>();
   ArrayList<Produce> producesList = new ArrayList<>();

   public void addPoultry(){
       String itemName = Input.getString("Enter name item");
       int itemQuantity = Input.getInt();
       Poultry itemPoultry = new Poultry(itemName, itemQuantity);
       poultryList.add(itemPoultry);
   }

   public void displayPoultry(){
       System.out.println("Poultry List");
       for(Poultry poultry : poultryList){
           System.out.println("| Item: " + poultry.getItemName() + " | " + "| Qty: " + poultry.getItemQuantity() + " |");
       }
   }

    public void addProduce(){
        String itemName = Input.getString("Enter name item");
        int itemQuantity = Input.getInt();
        Produce itemProduce = new Produce(itemName, itemQuantity);
        producesList.add(itemProduce);
    }

    public void displayProduce(){
        System.out.println("Produce List");
        for(Produce produce : producesList){
            System.out.println("| Item: " + produce.getItemName() + " | " + "| Qty: " + produce.getItemQuantity() + " |" );
        }
    }

    public static void main(String[] args) {
        GroceryApplication newList = new GroceryApplication();
        int userOpt = 0;
        while (userOpt != 4){

            System.out.println("1. Produce");
            System.out.println("2. Poultry");
            System.out.println("3. Done");
            System.out.println("4. Exit");
            userOpt = Input.getInt();

            if(userOpt == 1){
                newList.addProduce();
            } else if (userOpt == 2) {
                newList.addPoultry();
            } else if (userOpt == 3) {
                newList.displayProduce();
                newList.displayPoultry();
            }
        }
    }
}
