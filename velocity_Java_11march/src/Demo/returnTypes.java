package Demo;

import java.util.Scanner;

public class returnTypes {

	int add(int a,int b) 
	{
		int res=a+b;
		return res;
	}
	int sub(int a,int b) 
	{
		int res=a-b;
		return res;
	}
	float mul(int a,int b) 
	{
		int res=a*b;
		return res;
	}
	float div(int a,int b) 
	{
		float res=(float)a/b;  //need to do casting to get op in float 
		return res;
	}
	
	
	
	public static void main(String[] args) {
		
		returnTypes rt=new returnTypes();

		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
		
        String str=sc.nextLine();             //string input from user
        System.out.println(str);
        
		
		int add=rt.add(a,b);
		System.out.println("Addition is : "+add);
		int s=rt.sub(a,b);
		System.out.println("Substraction is : "+s);
		float m=rt.mul(a,b);
		System.out.println("multiplication is : "+m);		
		float d=rt.div(a,b);
		System.out.println("division is : "+d);
	}
}
//   Scanner methods to take input from user

//  nextBoolean()	Reads a boolean value from the user
//  nextByte()  	Reads a byte value from the user
//  nextDouble()	Reads a double value from the user
//  nextFloat()	    Reads a float value from the user
//  nextInt()	    Reads a int value from the user
//  nextLine()	    Reads a String value from the user
//  nextLong()	    Reads a long value from the user
//  nextShort()	    Reads a short value from the user
