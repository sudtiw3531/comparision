package Demo;

import java.util.Scanner;

public class Calculator_MiniProject {
	static Scanner sc = new Scanner(System.in);

	
	  public void addition() { 
		  System.out.println("Enter two numbers: "); 
		  //sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int add=a+b;
	  System.out.println("The addition is: "+add); }
	  
	  public void substraction() 
	  { System.out.println("Enter two numbers: ");
	  
	  int a=sc.nextInt();
	  int b=sc.nextInt(); 
	  int sub=a-b; 
	  System.out.println("The substraction is: "+sub); 
	  }
	 
	  public void multiplication() 
	  { System.out.println("Enter two numbers: ");
	  
	  int a=sc.nextInt();
	  int b=sc.nextInt(); 
	  int mul=a*b; 
	  System.out.println("The multiplication is: "+mul); 
	  }
	  public void division() 
	  { System.out.println("Enter two numbers: ");
	  
	  float a=sc.nextInt();
	  float b=sc.nextInt(); 
	  float div=a/b; 
	  System.out.println("The division is: "+div); 
	  }
	  public void modulus() 
	  { System.out.println("Enter two numbers: ");
	  
	  int a=sc.nextInt();
	  int b=sc.nextInt(); 
	  int mod=a%b; 
	  System.out.println("The modulus is: "+mod); 
	  }

	  public void square() 
	  { 
	  System.out.println("Enter a number: ");
	  int a=sc.nextInt();
	  int square=a*a; 
	  System.out.println("The square is: "+square); 
	  } 
	  public void cube() 
	  { 
	  System.out.println("Enter a number: ");
	  int a=sc.nextInt();
	  int cube=a*a*a; 
	  System.out.println("The cube is: "+cube); 
	  }
	  
	  
	public void average() {
		System.out.println("Total count of number to find the average of: ");
		float n = sc.nextInt();
		float sum = 0;
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			sum = sum + sc.nextInt();
		}
		float average = sum / n;
		System.out.println("Average of n given numbers is " + average);
	}

	public void factors() {
		System.out.println("Enter the num to find factors: ");
		int input = sc.nextInt();
		System.out.print("The factors are: ");
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	 public void evenOdd() 
	  { 
	  System.out.println("Enter a number: ");
	  int n=sc.nextInt();
	  if(n%2==0)System.out.println("its even number");
	  else System.out.println("its odd number");
	
	  }
	 
    public static void operation() {
    	Calculator_MiniProject cal = new Calculator_MiniProject();
    	int operation = sc.nextInt();
		switch (operation) {
		
		  case 1: 
			  cal.addition();
			  break;
			 
		  case 3: 
			  cal.multiplication(); 
			  break;
		  case 4: 
			  cal.division(); 
			  break;
		  case 5: 
			  cal.modulus(); 
			  break;
		  case 6: 
			  cal.square(); 
			  break;
		  case 7: 
			  cal.cube(); 
			  break;
	      case 8:
	    	  cal.average();
			break;
		  case 9:
			  cal.factors();
			break;
		  case 10: 
			  cal.evenOdd(); 
			  break;
		default:
			System.out.println("Invalid operation");
		}
      }
	  

	public static void main(String[] args) {

		System.out.println("Enter operation to be performed: ");
		System.out.println("1 : For addition"+'\n'+ "2 : For substraction"+'\n' +"3 : For multiplication"+'\n'+"4 : For division"+'\n'+"5 : For modulus"+'\n'+"6 : For square"+'\n'+"7 : For cube"+'\n'+"8 : For average"+'\n'+"9 : For factors"+'\n'+"10 : For even/odd"+'\n');
	    operation();
	
	}
}
