package BankImplementation;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Bank {
    public static void main(String[] args) {
        HashMap<Integer,String> customer = new HashMap<Integer,String>();
        HashMap<Integer,Integer> balance = new HashMap<Integer,Integer>();
        Scanner in = new Scanner(System.in);
       
        
       
        int id=100;
        
        
        while(true){
        	System.out.println("*************************************************************************");
        	 System.out.println("Please choose an option from  below");
             System.out.println("Press 1 to AddAccount");
             System.out.println("Press 2 to CheckBalance");
             System.out.println("Press 3 to Withdraw");
             System.out.println("Press 4 to AddBalance");
             
            int choice = in.nextInt();
            switch(choice){
                case 1:
                {
                     	System.out.println("Please enter your name");
                     	
                     	String aname = in.next() + in.nextLine(); 
                     	customer.put(id, aname);
                     	System.out.println("                             Hello " + aname);
                	System.out.println("                                 Your unique id is " + id);
                	
                	
                	balance.put(id, 1000);
                	
                	
                	System.out.println("                                 The balance is :" + balance.get(id));
                	id++;
                	break;
                }
                    
                case 2:
                {
                	System.out.println("Please enter your unique ID ");
                	int userId=in.nextInt();
                	
                		if(customer.containsKey(userId))
                		{
                		     System.out.println("                         Welcome " + customer.get(userId));	
                			System.out.println("                          Your balance is :" + balance.get(userId));
                		}
                		else
                			System.out.println("ID not found");
                	
                	break;
                }
                    
                case 3: 
                {
                	System.out.println("Please enter your unique ID ");
                	int userId=in.nextInt();
                	if(customer.containsKey(userId))
                	System.out.println("Please enter the amount to withdraw");
                	
                	int value=in.nextInt();
                	try {
                	int newbalance=(balance.get(userId)-value);
                	  System.out.println("                                  The balance after withdraw is :" +newbalance);
                	
            			balance.put(userId, newbalance);
                	}catch(Exception e)
                	{
                		System.out.println("excemption caught");
                	}
            			break;
                }
                    
                case 4: {
                	
                	System.out.println("Please enter your unique ID ");
                	int userId=in.nextInt();
                	if(customer.containsKey(userId))
                	{
                		System.out.println("                                Please enter the balance to add");
                		int bal=in.nextInt();
                		int newbal=balance.get(userId)+bal;
                		
                		balance.put(userId, newbal);
                	}
                	 break;
                		
                }
                
                   
                default:
                    System.out.println("Wrong input");
            }
        }
        
        
        
    }


}