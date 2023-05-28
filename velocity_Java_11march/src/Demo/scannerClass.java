package Demo;

import java.util.Scanner;

public class scannerClass {
	
  public static void main(String[] args) {
	 
	  
	  Scanner sc =new Scanner(System.in);
	  int a,b;
	  System.out.println("Enter 1 num: ");
	  a=sc.nextInt();
	  System.out.println("Enter 2 num: ");
	  b=sc.nextInt();
	  
	  scannerClass obj=new scannerClass();
	  int res=obj.add(a,b);
	  System.out.println("Addition is: "+res);
}
  int add(int a,int b) {
	 
	  int c=a+b;
	  return c;
  }
}
