package Demo;
import java.util.*;
    public class collection {
	
	  public static void main(String[] args) {
	        System.out.println("Jai Baram Baba");
	        ArrayList<String> names=new ArrayList<String>();  
	        
	        // list -1.preserves order    2.duplicate allowed     3.indexed collection
	        names.add("ram");
	        names.add("shyam");
	        names.add("arjun");
	        names.add("krishna");
	        
	        //System.out.println(names.size());
	        System.out.println(names);
	        
	        System.out.println(names.get(1));
	        System.out.println(names.get(3));
	        
	        names.add(2, "lakshman");    //adds in specified index and others gets moved to next
	        System.out.println(names);
	        names.set(1, "bhim");         //replaces value on specified index
	        
	        System.out.println(names);
	        
	        System.out.println("======================================");
	      
	        Set<String> colors=new HashSet<String>();
	        
	        // Sets in java   1.doesnt preserves order    2.duplicate not allowed      3.non indexed collection
	        
	        colors.add("red");
	        colors.add("white");
	        colors.add("yellow");
	        colors.add("blue");
	        colors.add("black");
	        System.out.println(colors);
	        colors.add("red");            //no duplicate allowed
	        System.out.println(colors);
	        
	        
	        names.addAll(colors);
	        System.out.println(names);
	        
	     
	        
     }
}
