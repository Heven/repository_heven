package xjtuse.homework1.code;

/**
 * Created with IntelliJ IDEA.
 * User: nex
 * Date: 5/18/12
 * Time: 5:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Sale {
    char itemName;
    int itemPrice;
    int itemNumbers;

    Sale(char name,int numbers,int price){
        this.itemName=name;
        this.itemNumbers=numbers;
        this.itemPrice=price;
    }

    public int getItemPrice(){
        return itemPrice;
    }

    public int getItemNumbers(){
        return itemNumbers;
    }
    public char getItemName(){
        return itemName;
    }

}
