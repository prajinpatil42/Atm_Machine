package oops;
import java.util.HashMap;
import java.util.Map;

public class AtmoperationImplements implements AtmOperationInterface{
ATM2 atm=new ATM2();

	Map<Double,String> ministmt = new HashMap<>();

	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is: "+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500== 0) {
			if(withdrawAmount<= atm.getBalance()) {
				ministmt.put(withdrawAmount," Amount withdrown");
				System.out.println(" collect the cash "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
				
			}else {
				System.out.println("Insufficient Balance !!");
			}	
		}else {
			System.out.println("Please enter the amount in Multipal of 500 ");
		}
		

		
	}

	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		ministmt.put(depositAmount," Amount Deposited");
		System.out.println(depositAmount+" Deposited successfully !!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void ViewMiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String> m:ministmt.entrySet() ) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
