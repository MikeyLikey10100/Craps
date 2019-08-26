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

				if (diceSum == 12 || diceSum == 2)
					{
						System.out.println("You lose Sucker.");
					}
				else if(diceSum == 7 || diceSum == 11 )
					{
						System.out.println("You automaticlly win, WOW!");
					}
			
			
				else 
					{
						
						int point = diceSum;
						System.out.println("your points is " + diceSum);
						
					}
			}
}
