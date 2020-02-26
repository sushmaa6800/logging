package interest;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Interest_logging {

	private static final Logger LOGGER=LogManager.getLogger(Interest_logging.class);
	public static void main(String args[])
	{
		Interest i=new Interest();
		Scanner s =new Scanner(System.in);
		LOGGER.info("Enter the principal , rate of interest and time ");
		int principal=s.nextInt();
		double rate=s.nextDouble();
		double time =s.nextDouble();
		double sim_inter =i.simple_interest(principal,rate,time);
		double com_inter=i.comp_interest(principal, rate, time);
		LOGGER.info("Simple interest : "+sim_inter+"\ncompound_interest : "+com_inter);
		s.close();
	}
}
