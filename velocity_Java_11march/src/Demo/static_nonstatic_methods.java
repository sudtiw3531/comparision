package Demo;

public class static_nonstatic_methods {

	public static void staticShow1() {
		System.out.println("1st Static method executed");
		static_nonstatic_methods ns = new static_nonstatic_methods();  
	    ns.nonStaticShow1();   // calling nonstatic inside static -need to create object
	}
	
	public void nonStaticShow1() {
		System.out.println("1st Non static method executed");
		staticShow2();                                  //calling static inside nonstatic directly call
	}

	static void staticShow2() {
	  System.out.println("2nd Static executed");
	  staticShow3();                                         //calling static inside static
	}

	 static void staticShow3() {
		System.out.println("3rd static executed");
		static_nonstatic_methods ns = new static_nonstatic_methods();  
	     ns.nonStaticShow2();                                            //calling non static inside static
		
	 }
	void nonStaticShow2() {
			System.out.println("2nd non static executed");
			nonStatic3();                                          //calling non static inside non static  
		}

		 void nonStatic3() {
		   System.out.println("3rd non static executed...");
		   System.out.println();
		}
	

	public static void main(String[] args) {                             //main is also one method i.e static method 
		staticShow1();                                                    //direct call or using className	//for nonstatic we need object    
    }
}
