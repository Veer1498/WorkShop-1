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
		 * 
		 */
		int stake = 100;
		int bet = 1;
		int random = (int) Math.floor((Math.random()*2)+1);
		System.out.println(random);
		boolean winOrLoss = false;
		if (random>1) {
			stake = stake + bet;
		}
		else {
			stake = stake - bet;
		}
		System.out.println("The stake Value after 1 Game = $ "+stake);
	}

}
