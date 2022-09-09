import java.util.Random;
import java.util.Scanner;

public class game {

	public static void main (String []args) {
		
		Random random = new Random();
		String answer;
		Scanner in = new Scanner(System.in);
		
		
		//muuttujat

		int i;
		int userMoney = 0;
		
		System.out.println("Add money, how much?");
		answer = in.nextLine();
		userMoney = userMoney + Integer.parseInt(answer);
		
		
			
		do {			
		int noppa1 = random.nextInt(10)+1;
		int noppa2 = random.nextInt(10)+1;
		int noppa3 = random.nextInt(10)+1;
			
			System.out.println(noppa1);
			System.out.println(noppa2);
			System.out.println(noppa3);
			
			userMoney--;
			
			if (noppa1 == 7 && noppa2 ==7 && noppa3 == 7) {
			System.out.println("Hellyeah, you win! +10"); 
		userMoney = userMoney+10;
		System.out.println("You have "+ userMoney +" of money."); 
		System.out.println("Throw again? (y/n)");
		answer = in.nextLine();
		
			}
			
			if (noppa1 == 7 && noppa2 == 7 || noppa2 == 7 && noppa3 == 7 || noppa3 == 7 && noppa1 == 7) {
		System.out.println("Congratulations, you win! +5"); 
		userMoney = userMoney+5;
		System.out.println("You have "+ userMoney +" of money.");
		System.out.println("Play again, press enter (exit by x)");
		answer = in.nextLine();
		 
		}
			

			if (noppa1 == 7 || noppa2 == 7 || noppa3 ==7) {
		System.out.println("Congratulations, you win!");
		userMoney = userMoney +3;
		System.out.println("You have "+ userMoney +" of money.");
		System.out.println("Play again, press enter (exit by x)");
		answer = in.nextLine();
		
		}
			
		if (userMoney == 0) {
				System.out.println("You ran out of money!");
				break;
			}
			
		else {
		System.out.println("Sadly, you lose."); 
		System.out.println("You have "+ userMoney +" of money.");
		System.out.println("Play again, press enter (exit by x)");
		answer = in.nextLine();
		
				}
			
			
		}	while (answer.equals(""));	

						
			System.out.println("Thank you for playing!");
//	}
	}
}
