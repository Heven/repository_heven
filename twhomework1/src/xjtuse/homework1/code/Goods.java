package xjtuse.homework1.code;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: nex
 * Date: 5/18/12
 * Time: 5:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class Goods {
    ArrayList<Good> goodsList;
    Goods(){
        this.goodsList= new ArrayList<Good>();
        Good A = new Good('A', 50);
        Good B = new Good('B',30);
        Good C = new Good('C',20);
        Good D = new Good('D',15);
        goodsList.add(A);
        goodsList.add(B);
        goodsList.add(C);
        goodsList.add(D);
    }

    public void addGood(char name,int price){
        Good g = new Good(name, price);
        goodsList.add(g);
    }
    public void addGood(Good g){
        goodsList.add(g);
    }

    public void deletGood(char name){
        if(goodsList==null) return;
        Good g;
        for(int i=0;i<goodsList.size();i++){
            if(goodsList.get(i).getName()==name)
            {
                g= goodsList.get(i);
                goodsList.remove(g);
                return;
            }
        }
        //goodsList.remove(g);
    }

    public Good getGood(char name){
        if(goodsList==null) return null;
        for(int i=0;i<goodsList.size();i++){
            if(goodsList.get(i).goodName==name){
                //System.out.println(name);
                return goodsList.get(i);

            }
        }
        return null;

    }


}
