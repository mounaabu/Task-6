package Dessert;
public class Sundae extends IceCream{
private int cost;
private String topping;
private int toppingcost;

public Sundae(String IceCreamname,int IceCreamcost, String topping, int toppingcost) {
	super(IceCreamname,IceCreamcost);
   
    this.topping=topping;
    this.toppingcost=toppingcost;
}
     public int getCost() {
    	 this.cost=this.toppingcost + super.getCost();
       return cost;

    }
     public String getTopping() {
 		return topping;
    }
}