package Dessert;
public class Candy extends DessertItem {
private int ppp; //ppp: price per pound
private double weight;
private int cost;

public Candy(String name, double weight, int ppp) {
        super(name);
        this.weight=weight;
        this.ppp= ppp;
        }

        public double getweight() {
	        return weight;
        }
        
        public int getppp() {
	       return ppp;
        }

        public int getCost() {
        this.cost=(int) Math.round(this. weight * this. ppp);
	       return cost;
	
        }

        }
