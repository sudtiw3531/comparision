package Demo;

import java.util.*;

public class Encapsulation {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		getter_setter obj=new getter_setter();
		System.out.println("Assign value to private int variable: ");
		int a=sc.nextInt();
		obj.setData(a);
		System.out.println("val="+obj.getData());
		
		
		System.out.println("Assign value to private string variable: ");
		String s=sc.next();
		obj.setStringData(s);
		System.out.println("str="+obj.getStringData());
		
		
	}
	

}
