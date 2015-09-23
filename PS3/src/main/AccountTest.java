package main;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountTest {

	@Test
	public void test() {
		Account tester = new Account(1122, 20000.0 ,.045);
		
		 assertTrue("withdrawing 2500 gives you 17500", tester.withdraw(2500) ==  17500);
		 assertTrue("depositing 3000 gives you 20500 ", tester.deposit(3000) == 20500);
		 assertFalse("InsufficientFundsTest",tester.withdraw(500000)==479500);
		 System.out.println("The balance is: $ \n" + tester.getBalance());
	     System.out.println ("The monthly interest  is: $ \n" + (tester.getAnnualInterestRate()/ 12));
	     System.out.println ("The account was created: \n" +  tester.getDateCreated());

	}

    
     

		
	}


