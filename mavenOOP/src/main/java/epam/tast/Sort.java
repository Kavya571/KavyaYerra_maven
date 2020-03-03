package epam.tast;

import java.util.Comparator;
public class Sort implements Comparator<Chocolates>{
	int choice;
	Sort(int opt)
	{
		this.choice=opt;
	}
	public int compare(Chocolates ch1,Chocolates ch2)
	{
		switch(choice){
			case 1:
				return ch1.cost-ch2.cost;
		case 2:
				return ch1.wt-ch2.wt;
			case 3:
				return ch1.n-ch2.n;
		}
		return 0;
	}

}
