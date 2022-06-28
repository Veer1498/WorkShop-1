package workshop1;
import java.util.Scanner;
import java.io.*;

public class Gambler {
	/**
	 * Problem Gambler 
	 * 
	 * @param args
	 */
	public static double isLucky,isUnLucky;
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
		 * Created new variables month,monthDays and  a new String monthName
		 * All monthDays were assigned to months.
		 * Created a Switch case for selecting each monthDays and monthName.
		 * In FOR loop the days were proportional to monthDays.
		 * Created other new variables lucky,nLucky,LuckDay,UnLuckDay.
		 * Created two public Variables isLucky,isUnLucky.
		 * Created another IF condition for storing max or min value of stake won.
		 * Printing the max gain or max loss of the whole Month
		 * 
		 */
		System.out.println("Welcome to the Gambler Simulation");
		System.out.println("");
		double stake = 100;
		int bet = 1;
		int monthDays=0;
		double lucky=0;
		double unLucky=stake;
		int luckDay =0;
		int unLuckDay=0;
		int day;
		String monthName= new String();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Month. Ex:For January enter = 1");
		int month = scanner.nextInt();
		System.out.println("");
		int jan = 31,feb = 28,mar = 31, apr = 30,may = 31,jun= 30;
		int jul = 31, aug = 31, sep = 30, oct = 31, nov = 30, dec = 31;
			switch(month) {
			case 1 : 
				monthDays = jan;
				monthName = "JANUARY";
				break;
			case 2 : 
				monthDays = feb;
				monthName = "FEBRUARY";
				break;
			case 3 : 
				monthDays = mar;
				monthName = "MARCH";
				break;
			case 4 : 
				monthDays = apr;
				monthName = "APRIL";
				break;
			case 5 : 
				monthDays = may;
				monthName = "MAY";
				break;
			case 6 : 
				monthDays = jun;
				monthName = "JUNE";
				break;
			case 7 : 
				monthDays = jul;
				monthName = "JULY";
				break;
			case 8 : 
				monthDays = aug;
				monthName = "AUGUST";
				break;
			case 9 : 
				monthDays = sep;
				monthName = "SEPTEMBER";
				break;
			case 10 : 
				monthDays = oct;
				monthName = "OCTOBER";
				break;
			case 11 : 
				monthDays = nov;
				monthName = "NOVEMBER";
				break;
			case 12 : 
				monthDays = dec;
				monthName = "DECEMBER";
				break;
			}
			System.out.println("The Month of " + monthName);
			System.out.println("");
			
		for (day=1; day<=monthDays;day++) {
			int  gain = (int)(stake + (stake/2));
			int  loss = (int)(stake - (stake/2));
			while(stake != 0) {
				double random =  Math.floor((Math.random()*10)%2);
				if (random<1) {
					stake += bet;
					if (stake == (gain) || stake == loss) {
						if(stake>lucky) {
							lucky = stake;
							if(isLucky<lucky) {
							isLucky = lucky;
							luckDay = day;
							}
							isLucky = lucky;
							break;
						  }
						if(stake<unLucky) {
							unLucky = stake;
							if(isUnLucky>unLucky) {
							isUnLucky = unLucky;
							unLuckDay = day;
							}
							isUnLucky = unLucky;
							break;
						 }
						break;
					}
				}
				else {
					stake -= bet;
					if (stake == (gain) || stake == loss) {
						if(stake>lucky) {
							lucky = stake;
							if(isLucky<lucky) {
							isLucky = lucky;
							luckDay = day;
							}
							isLucky = lucky;
							break;
						}
						if(stake!=0 && stake<unLucky) {
							unLucky = stake;
							if (isUnLucky>unLucky) {
							isUnLucky = unLucky;
							unLuckDay = day;
							}
							isUnLucky = unLucky;
							break;
						}
						break;
					}
				}
			}
			System.out.println("The stake Value after "+day+" Day = $ "+stake);
		}
		System.out.println("");
		System.out.println("The Luckiest Day is "+luckDay+" Amount is "+isLucky);
		System.out.println("The UnLuckiest Day is "+unLuckDay+" Amount is "+isUnLucky);			
	}
}
