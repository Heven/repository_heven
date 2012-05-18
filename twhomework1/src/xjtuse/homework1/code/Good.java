package xjtuse.homework1.code;

/**
 * Created with IntelliJ IDEA.
 * User: nex
 * Date: 5/18/12
 * Time: 5:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Good {
    char goodName;
    int goodPrice;

    Good(char name,int price){
        this.goodName=name;
        this.goodPrice=price;
    }

    public void setGoodPrice(int i){
        goodPrice =i;
    }

    public char getName(){
        return goodName;
    }
    public int getPrice(){
        return goodPrice;
    }
}
