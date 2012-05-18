package xjtuse.homework1.code;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: nex
 * Date: 5/18/12
 * Time: 5:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class PriceSum {
    Goods goods;
    Sales sales;
    ArrayList<Item> list;

    public PriceSum(){
        goods = new Goods();
        sales = new Sales();
        list= new ArrayList<Item>();
    }

    public void getNumber(String s){
        list= new ArrayList<Item>();
        if(s=="") return;
        for(int i=0;i<s.length();i++){
            if(list==null) {
                Item item = new Item(s.charAt(0));

                list.add(item);
                continue;
            }
            boolean flag = true;
            for(int j=0;j<list.size();j++){

                if(list.get(j).getItemName()==s.charAt(i)){
                    list.get(j).add();
                    flag=false;
                    continue;

                }
            }
            if(flag){
                Item item = new Item(s.charAt(i));
                list.add(item);
            }
        }
    }


    public int price(String s){
        int sum =0;
        if(s=="") return sum;
        getNumber(s);
        Sale sale;
        Good good;
        for(int i=0;i<list.size();i++){
            sale=sales.getSale(list.get(i).getItemName());
            good=goods.getGood(list.get(i).getItemName());
            if(good==null) continue;
            if(sale!=null)
                sum=sum+(list.get(i).getItemNumber()/sale.getItemNumbers())*sale.getItemPrice()+(list.get(i).getItemNumber()%sale.getItemNumbers())*good.getPrice();
            else
                sum=sum+list.get(i).getItemNumber()*good.getPrice();
            System.out.println(sum);
        }

        return sum;
    }

}
class Item{
    char itemName;
    int number;

    Item(char name){
        this.itemName=name;
        this.number=1;
    }

    public void add(){
        number=number+1;
    }

    public char getItemName(){
        return itemName;
    }

    public int getItemNumber(){
        return number;
    }
}
