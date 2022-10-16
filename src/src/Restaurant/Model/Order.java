package Restaurant.Model;

import Restaurant.Model.Food;

public class Order{
    private String priceIn;
    private String priceOut;
    private Food[] foods;
    public Order(String priceIn, String priceOut){
        this.priceIn = priceIn;
        this.priceOut = priceOut;
    }
public String getPriceIn(){
    return priceIn;
}
public void setPriceIn(){
    this.priceIn = priceIn;

}
public String getPriceOut(){
        return priceOut;
    }
public void setPriceOut(){
        this.priceOut = priceOut;
}
@Override
    public String toString(){
        return "Order{"+
                "priceIn='" + priceIn+ '\''+
                ", priceOut='" + priceOut + '\''+
                '}';
}
}
