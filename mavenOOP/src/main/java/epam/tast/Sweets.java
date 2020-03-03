package epam.tast;

public class Sweets {
	int cost,wt,n;
	Sweets(int weight,int cost, int n)
	{
		this.cost=cost;
		this.wt=wt;
		this.n=n;
	}
	public String toString() 
	{
		return("Cost: "+this.cost+" Weight: "+this.wt+" Number: "+this.n);
	}
}