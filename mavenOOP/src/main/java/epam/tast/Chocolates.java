package epam.tast;

public class Chocolates extends Sweets {
	String chocoflav;
	Chocolates(int wt, int cost, int n, String chocoflav)
	{
		super(wt,cost,n);
		this.chocoflav=chocoflav;
	}
	public  String toString() {
		return("Cost: "+this.cost+" Wt: "+this.wt+" Number: "+this.n);
		}
}