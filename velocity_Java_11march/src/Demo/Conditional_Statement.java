package Demo;

public class Conditional_Statement {

	public static void main(String[] args) {
		
	//if 
	int age=60;	
    if(age>=60) 
    {
    	System.out.println("Rate of interest for FD is 7.0%");
    }
    
    // if-else
    if(age>=18) 
    {
    	System.out.println("Can Vote");
    }
    else 
    {
    	System.out.println("Cannot vote");
    }
	
    //if-else ladder
    //can be used if some condition has hierarchy
	int marks=70;
    if(marks>=80) {
    	System.out.println("Grade A");
    }else if(marks>=70&&marks<80) {
    	System.out.println("Grades B");
    }else if(marks>=60&&marks<70) {
    	System.out.println("Grades c");
    }else {
    	System.out.println("Fail");
    }
    //hw
    
    //nested if
    //can be used if multiple condition applied for one scenario
    //eg 1.if age>18 and haemoglobin>12 --->can donate blood
    //eg 2.
    String nationality="Indian";
    if(age>=18) {
    	System.out.println("1st condt. ok");
        }if(nationality.equals("Indian")) {
             	System.out.println("Can vote");
          }
    
    //equalsIgnoreCase=>method-->not case sensitive for comparing strings
    //equals=>method-->to compare string
    
    
    //Switch case
    // if we want to select one option from many .eg- if we wnt smthing from menu
    //h.w calculator using switch case    
        
    
    
    
	}
	
}
