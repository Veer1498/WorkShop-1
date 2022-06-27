package workshop1;

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
		 * Created a WHILE loop and inserted all If Condition in That.
		 * Created another IF condition to break the stake value at either 150 or 50.
		 * 
		 * 
		 */
		double stake = 100;
		int bet = 1;
		for (int day=1; day<=20;day++) {
			double  gain = stake + (stake/2);
			double  loss = stake - (stake/2);
			while(stake != 0) {
				int random = (int) Math.floor((Math.random()*2)+1);
				if (random>1) {
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
