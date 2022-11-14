package Banking;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		BankAccount obj1=new BankAccount("ANJALI","4547754352");
		obj1.showMenu();
	}
}
class BankAccount{
	 String accno;  
	 String name; 
	 long balance;
	 long previousTransaction;
	    BankAccount(String cname,String acNo)
	    {
	    	name=cname;
	    	accno=acNo;
	    }
	    public void showAccount() {  
	        System.out.println("\n Name of account holder: " + name);  
	        System.out.println("\n Account no.           : " + accno);
	        {
	        System.out.println("\n"  );
	        getPreviousTransaction();
	        }
	        System.out.println("\n Balance               : " + balance);  
	    }  
	    void deposit(int amount) {
	    	if(amount!=0) {
	    		balance=balance+amount;
	    		 previousTransaction=amount;
	    		 System.out.println(" Thank You "+name+" Amount Deposited Successfully"); 
	             
	    	}
	    }
	    void withdraw(int amount)
	    {
	    	if(balance >= amount) {
	    		balance=balance-amount;
	    		 previousTransaction=-amount;
	    	}
	    	else {
	    		 System.out.println("Your balance is less than " + amount + "\nTransaction failed...!!" );  
	    	}
	    } 
	    void getPreviousTransaction()
	    {
	    	System.out.println(" Previous Transaction is");
	    	if(previousTransaction>0) {
	    		System.out.println( previousTransaction+" Deposited");
	    	}
	    	else if(previousTransaction<0) {
	    		System.out.println ( Math.abs(previousTransaction)+" Withdrawn");
	    	}
	    	else {
	    		System.out.println(" No transaction occured");
	    	}
	    }
	    void showMenu() {
	    	  char choice='\0';
	    	  Scanner sc=new Scanner(System.in);
	    	  System.out.println("WELCOME "+name);
	    	  System.out.println("YOUR ACCOUNT NUMBER IS "+accno);
	    	  System.out.println("\n");
	    	  System.out.println("\n ***Banking System Application***");  
	            System.out.println(" A. Balance \n B. Previous Transaction\n C. Deposit the amount \n D. Withdraw the amount \n E. Account Details \n F. Exit ");
	    	  do {  
	    		  System.out.println("\n  ");
	    		    System.out.println("*********************** ");
		            System.out.println("  Enter your choice: ");
		            System.out.println("*********************** ");
		            choice = sc.next().charAt(0);
		            switch(choice) {
		            case 'A':  
                        System.out.println("Balance = "+balance);
                        break;  
                    case 'B':  
                       getPreviousTransaction();
                        break;  
                    case 'C':  
                       System.out.println(" Enter Amount to Deposit :");
                       int amount=sc.nextInt();
                       deposit(amount);
                                break;  
                             
                    case 'D':  
                        System.out.print(" Enter Amount to Withdraw : ");  
                         int amount2=sc.nextInt();
                         withdraw(amount2);
                                break;  
                          
                    case 'E':
                    	System.out.println(" Account Details are :");
                    	showAccount();
                    	
                    case 'F':  
                    	 System.out.println(" Thank You "+name); 
                         System.out.println(" Visit Again "); 
                        break; 
                        default:
                        	 System.out.println(" Invalid Option.!.!.Please try Again"); 
                        	 break;
		            }
	    	  }while(choice!=5);
	    	  
	    }
}
	    
	    	 