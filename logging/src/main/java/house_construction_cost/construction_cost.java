package house_construction_cost;

/*In the standards column 'S' implies standard materials
 *                        'A' implies Above standard materials
 *                        'H' implies high standard materials
 *In the automation column 'Y' implies automation is needed
                           'N' implies automation is not needed  
 */

public class construction_cost {
	public double cost(char standard,double area,char automation)
	{
		double house_cost=0;
		if(automation=='N')
		{
		if(standard=='S')
			house_cost=area*1200;
		else if(standard=='A')
			house_cost=area*1500;
		else if(standard=='H')
			house_cost=1800*area;
	}
		else if(standard=='H'&& automation=='Y')
			house_cost=area*2500;
return house_cost;
}
}
