package Demo;
   


//yt-code with durgesh

public class exception_handling {

	
	  
	public static void main(String[] args) {
		
		  try {
		  int num1=40;             //Integer.parseInt(args[0]);
		  int num2=0;                        //Integer.parseInt(args[1]);
		  float result=num1/num2;
		  System.out.println("The division is:"+ result);
		  }
		  catch (ArithmeticException e) 
		  {
			  System.out.println("Arithmetic Exception caught");
			  System.out.println(e.getMessage());
		  }
		  catch (Exception e) 
		  {
			  System.out.println("Exception caught");
			  System.out.println(e.getMessage());
		  }
		
	}
	
	
}
