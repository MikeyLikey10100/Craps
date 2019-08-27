import java.util.Scanner;
public class Craps
	{
		
		public static void main(String[] args)
		{
		// TODO Auto-generated method stub
		
				
				int randomNumber1 = (int) (Math.random() *6 + 1);
				int randomNumber2 = (int) (Math.random() *6 + 1);

			
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello there, What is your name?");
				String name = userInput.nextLine(); 
				System.out.println("Hello " + name + " ready to play craps?");
				
				System.out.println("Click enter to roll");
				String roll = userInput.nextLine(); 
				 
				int dice1 = randomNumber1;
				int dice2 = randomNumber2; 
				int diceSum = dice1 + dice2;
			
				boolean dice = false;
				boolean firstRoll = true; 
				boolean roll2 = false; 

				if (diceSum == 12 || diceSum == 2)
					{
						System.out.println(" You rolled a: " + diceSum + "You lose Sucker.");
						firstRoll = false;
					}
				else if(diceSum == 7 || diceSum == 11 )
					{
						System.out.println("You rolled: " + diceSum + " You automaticlly win, WOW!");
						firstRoll = false;
					}
			
			
				else
					{
						System.out.println("your points is " + diceSum + ". Roll again");
						roll2 = true;
				
					
					}
				while (roll2)
					{
						int randomNumber3 = (int) (Math.random() *6 + 1);
						int randomNumber4 = (int) (Math.random() *6 + 1);
						String rollA= userInput.nextLine(); 
						int diceA = randomNumber3; 
						int diceB = randomNumber4; 
						int diceSumA = diceA + diceB;
						int userPoint = diceSum;
						
						if (diceSumA == userPoint)
							{
								System.out.println(" You rolled a: " + diceSumA + " You Win. Amazing!");
								roll2 = false;
							}
						if (diceSumA == 7)	
							{
								System.out.println("You rolled: " + diceSumA + ". YOU LOSE SUCKER.");
								roll2 = false;
							}
						else 
							{
								System.out.println("Your point is " + userPoint + " You rolled: " + diceA + " and " + diceB + " For a total of " + diceSumA + " Please roll again.");
							}
					}
			}
}
