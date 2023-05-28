package DemoPackages;

public class Prime {
	static int number=599;
    static boolean flag=true;

		public static void main(String[] args){

		
		for(int i=2;i<=number/2;i++){
		    if(number%i==0){
		      flag =false;
		      }
		  }
		if(flag==false)
			System.out.println("Not a prime");
		else
			System.out.println("Its a prime no");

		}
}

