package Dessert;
public class Cookie extends DessertItem {
private int ppd; //ppd: price per dozen
private int number;
private int cost;

public Cookie(String name, int number, int ppd) {
		super(name);
        this.number = number;
		this.ppd= ppd;
		}

		public int getnumber() {
			return number;
		}

		public int getppd() {
			return ppd;
		}

		public int getCost() {
			this.cost = (this.number / 12 * this.ppd);
			return cost;
			
			
		}

		}
