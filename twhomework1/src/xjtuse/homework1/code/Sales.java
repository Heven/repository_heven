package xjtuse.homework1.code;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: nex
 * Date: 5/18/12
 * Time: 5:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Sales {
    ArrayList<Sale> salesList;

    Sales(){
        this.salesList=new ArrayList<Sale>();
        Sale A = new Sale('A', 3, 130);
        Sale B = new Sale('B',2,45);
        salesList.add(A);
        salesList.add(B);
    }

    public void addSale(char name,int numbers,int price){

        Sale s = new Sale(name,numbers,price);
        salesList.add(s);

    }
    public void addSale(Sale s)
    {
        salesList.add(s);
    }

    public Sale getSale(char name){
        if(salesList==null) return null;
        for(int i=0;i<salesList.size();i++){
            if(salesList.get(i).getItemName()==name)
                return salesList.get(i);
        }
        return null;

    }

}
