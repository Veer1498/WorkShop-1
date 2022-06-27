package workshop1;
import java.io.*;
import java.lang.*;

public class Gambler {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Created Class Gambler and taken variables stake and bet with values.
		 * The currency is in Dollars ($)
		 * Created an IF Condition for probability.
		 * If random more than 1 it add up to stake, less than 1 it subtracts form stake.
		 * Created a FOR loop to check for a N number of Days.
		 * Created 2 variables gain and loss to add or sub stake value for iteration.
		 * Created a WHILE loop and inserted all If Condition in That.
		 * Created another IF condition to break the stake value at either gain or loss a 50%.
		 * 
		 * 
		 */
		double stake = 100;
		double bet = 1;
		for (int day=1; day<=20;day++) {
			int  gain = (int)(stake + (stake/2));
			int  loss = (int)(stake - (stake/2));
			while(stake != 0) {
				double random =  Math.floor((Math.random()*10)%2);
				if (random<1) {
					stake = stake + bet;
					if (stake == (gain) || stake == loss) {
						break;
					}
				}
				else {
					stake = stake - bet;
					if (stake == (gain) || stake == loss) {
						break;
					}
				}
			}
			System.out.println("The stake Value after "+day+" Day = $ "+stake);
		}
	}

}
