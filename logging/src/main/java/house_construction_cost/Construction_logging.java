package house_construction_cost;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction_logging {
	private static final Logger LOGGER=LogManager.getLogger(Construction_logging.class);
	
	public static void main(String args[])
	{
		construction_cost obj_cost=new construction_cost();
		Scanner s=new Scanner(System.in);
		LOGGER.info("enter material standard, area, automation status");
		char standard=s.next().charAt(0);
		int house_area=s.nextInt();
		char automation = s.next().charAt(0);
		double house_cost=obj_cost.cost(standard,house_area,automation);
		LOGGER.info("house construction cost : "+house_cost);
		s.close();
	}

}
