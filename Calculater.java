package Mini_Project;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Calculater {
	
	public static void main(String[] args) {
		
		/*
		  
		 Select one of this below options:
		 
		   1. Addition
		   2. Substraction
		   3. Multiplication
		   4. Division
		   
		   user -> Entered 1
		   
		    Enter First Number:
		    Enter Second Number:
		    
		    Addition is 
		  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int user_input;
		int num_1;
		int num_2;
		int result;
		boolean done = true;
		do {
		
		System.out.println("Select one  of the Below Options : ");
		System.out.println();
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplcation");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		user_input = sc.nextInt();
		
		
		switch(user_input) {
		
		case 1: 
			 
		    System.out.print("Enter the First Number : ");
		    num_1 = sc.nextInt();
		
		    System.out.print("Enter the Second Number : ");
		    num_2 = sc.nextInt();
		
		    result = num_1 + num_2;
		
		    System.out.println("The Addition is : " + result);
		
		    break;
		
		case 2:
			
			System.out.print("Enter the First Number : ");
			num_1 = sc.nextInt();
			
			System.out.print("Enter the Second Number : ");
			num_2 = sc.nextInt();
			
			result = num_1 - num_2;
			
			System.out.println("The Substraction is : " + result);
			
			break;
			
		case 3:
			
			System.out.print("Enter the First Number : ");
			num_1 = sc.nextInt();
			
			System.out.print("Enter the Second Number : ");
			num_2 = sc.nextInt();
			
			result = num_1 * num_2;
			
			System.out.println("The Multiplicaton is : " + result);
			
			break;
			
		case 4: 
			
			System.out.print("Enter the First Number : ");
			num_1 = sc.nextInt();
			
			System.out.print("Enter the Second Number : ");
			num_2 = sc.nextInt();
			
			result = num_1 / num_2;
			
			System.out.println("The Division is : " + result);
			
			break;
			
		case 5: 
			
			System.out.println("Thank You For Using Calculator!!!!");
			System.out.println("Byee byee!!!");
			
			done = false;
			
			break;
			
		
		default : System.out.println("Invalid Input");
		
		}
		
		}while(done);
		
		
	}

}
