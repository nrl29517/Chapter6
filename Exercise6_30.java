import java.util.Random;
public class Exercise6_30 {
	
	static Random dice = new Random();
	
	public static int roll()
	{
		return (dice.nextInt(6) + 1);
	}
	
	public static void game()
	{
		int roll1 = roll();
		int roll2 = roll();
		int sum = roll1 + roll2;
		System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);
		if (sum == 2 || sum == 3 || sum == 12 )
		{
		
			System.out.println("You lose");
		} else if (sum == 7 || sum == 11 )
		{
			System.out.println("You win");
		}
		else
		{
			int point = sum;
			System.out.println("Point is " + point);
			sum = 0;
			while(sum != point && sum != 7)
			{
				roll1 = roll();
				roll2 = roll();
				sum = roll1 + roll2;
				
			}
			System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);
			if (sum == point)
			{
				System.out.println("You win");
			}else if (sum == 7)
			{
				System.out.println("You lose");
			}
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		game();
		
	}

}
