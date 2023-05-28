package Demo;

public class looping_statement {

	public static void main(String[] args) {
	
		//for loop
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
		}
		for(int i=10;i>=0;i--) {
			System.out.println(i);
		}
		
		
		//table using for loop
		
		  for(int i=1;i<=10;i++) { 
			  int num=5; 
			  System.out.println(num+"*"+i+"="+num*i);
		  }
		 
		
		//while loop
		
		  int i=0; 
		  while (i<5) { 
			  System.out.println(i); 
			  i++;
		  }
		  
		  //do while
		   int l=1;    
		    do{    
		        System.out.println(l);    
		    i++;    
		    }while(i<10);    
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
			/*
			 * int j=1; do { System.out.println("hi "+j); if(j==3) { continue; //skips rest
			 * body for j=2 } }
			 * 
			 * if(j==5) { break; //terminates loop for j=5 } }
			 * 
			 * } while (j<10);
			 */
			  
 
		
		//do while
	  
		  //break    statement -->to terminate loop
		  //continue statement --> to skip something
	}

}
