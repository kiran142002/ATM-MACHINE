
import java.util.*;
public class ATM_PROJECT {

	public static void main(String[] args) {
		int pin =1234;
		int balance=10000;
		
		int AddAmount = 0;
		int TakeAmount = 0;
		
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter you pin number");
		
		int password = scanner.nextInt();
		
		if(password==pin)
		{
			System.out.println("Enter your name");
			name =scanner.next();
			System.out.println("Welcome"+name);
			
			while (true) {
				System.out.println("Press 1 to check your balance");
				System.out.println("Press 2 to add amount");
				System.out.println("Press 3 to take amount");
				System.out.println("Press 4 to take recipt");
				System.out.println("Press 5 to Exit");
				
				int opt = scanner.nextInt();
				switch(opt)
				{
				case 1:
					System.out.println("your current balance is"+balance);
					break;
				case 2:
					System.out.println("How much amount did you want  to ADD to your account");
					AddAmount=scanner.nextInt();
					System.out.println("Successfully creditor");
					balance = AddAmount  +balance;
					//2000=100+2000
					//2100
				case 3:
					System.out.println("How much amount did you want to take");
					TakeAmount=scanner.nextInt();
					if(TakeAmount>balance)
					{
						System.out.println("Insufficient balance");
						System.out.println("try less than your available balance");
					}
					else
					{
						System.out.println("successfully taken");
						balance =balance - TakeAmount;
						
					}
					break;
				case 4:
					System.out.println("Welcome to All is One Mini ATM");
					System.out.println("Available balance is"+balance);
					System.out.println("Amount deposited "+AddAmount);
					System.out.println("Amount taken "+AddAmount);
					System.out.println("Thank you");
					break;
						default:
							System.out.println("press the number below 5");
							break;
				}
				if(opt ==5)
				{
					System.out.println("Thankyou");
					break;
					
		
				}
			}
			
		}
		else
		{
			System.out.println("wrong pin number");
		}
		

	}


}