package oops; 

import java.util.*;

public class MainClass{
	public static void main(String[] args) {
		AtmOperationInterface op=new AtmoperationImplements();
		
		
		int atmnumber=12345;
		int atmpin=123;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine");
		System.out.println("Enter ATM number:");
		int atmNumber=sc.nextInt();
		System.out.println("Enter pin:");
		int pin=sc.nextInt();
		if((atmnumber==atmNumber)&&(atmpin== pin)) {
			while(true) {
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
				System.out.println("Enter choice:");
				int choice=sc.nextInt();
				if(choice == 1) {
					op.viewBalance();
					
					
				}else if(choice == 2) {
					System.out.println("Enter amount to withdraw");
					double withdrawAmount=sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}else if(choice == 3) {
					System.out.println("Enter Amout to Deposit:");
					double deposiAmount=sc.nextDouble();
					op.depositAmount(deposiAmount);
				}else if(choice == 4) {
					op.ViewMiniStatement();
					
				}else if(choice == 5) {
					System.out.println("Collect your ATM Card\n Thank Tou for using ATM machine !");
					System.exit(0);
					
				}else {
					System.out.println("Please Enter Correct choice");
					
				}
				
			}
		}else {
			System.out.println("Incorrect Atm Number or Pin");
			System.exit(0);
			
		}
		
		
		
	
		
		
}
	
}
 
