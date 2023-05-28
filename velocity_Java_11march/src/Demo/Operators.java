package Demo;

public class Operators {

	public static void main(String[] args) {
		
		int x=20;
		int y=3;
		int z=10;
		int a=3;
		
		
		System.out.println("Addition is: "+(x+y));    //arithmetic operators
		System.out.println("substraction is: "+(x-y));
		System.out.println("multiplication is: "+(x*y));
		System.out.println("division  is: "+(x/y));
		System.out.println("modulus  is: "+(x%y));
		
		System.out.println(x>y&&z<x);  //T&&T           //logical and 
		System.out.println(z>x&&z<x);  //F&&T
		System.out.println(x<y||x>z);  //F||T          //logical or
		System.out.println(x<y||z>x);  //F||F
		
		System.out.println(x>=y&&y==a);           //relational
		System.out.println(y==a);  
		
		//bitwise and & bitwise or |
		int p=5;int q=7;           
		//   5=> 0 1 0 1
		//   7=> 0 1 1 1
		//     &-----------
		//       0 1 0 1
		
		System.out.println("bitwise and "+(p&q));
		System.out.println("bitwise or "+(p|q));
	
		
		//unary operator-performs on single variable
		int c=10;
		c++;                       //means c=c+1; i.e value stored in variable
		System.out.println(c);   //11
		++c;                    //no use here so increment in next statement
		System.out.println(c);    //12
		System.out.println(c++);  //12  use and then increase caz it is inside sysout
		System.out.println(c);    //13
		System.out.println(++c);  //14 increase then use or display
	  
		
		c--;
		System.out.println(c);   //9
		--c;
		System.out.println(c);   //8
		System.out.println(c--);  //8  -use then increment
		System.out.println(c);    //7
		System.out.println(--c);  //6
		
		int m=10;
		m++;                    //11
		System.out.println(m--);  //11  print then decrement
		//m=10                    
		System.out.println(--m);  //9   decrement then print
	
		//ternary operator
		int s=10;int t=20; int w=30;
		
		int op=(s>t?1:0);  //if condition before ? is true then op is 1st after the ?
		System.out.println(op);   //false so 2nd i.e. ==>0
		
		boolean opp=((w>t)&&(t>s)?true:false);       //true i.e ===>1
		System.out.println(opp);
		String str=((w>t)&&(t>s)?"yes":"no");       //true i.e ===>1
		System.out.println(str);
		
		
		//shift operator  << left   >> right
		int ab=10;
		System.out.println(ab<<2);   //10*2^2 =40   //bitwise shift==>formula==> var*(2^shift bits)
		System.out.println(ab<<3);   //10*2^3=80
		System.out.println(ab<<4);  //160
	
		int abc=10;
		
		System.out.println(abc>>2);   //10/2^2=>2.5=>2        //formula=var/(2^shift bits)
		System.out.println(abc>>3);
	
		
		//imp operators -- unary ,logical
	}
}
