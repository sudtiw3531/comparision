package DemoPackages;
//this is a class of demopackages
//if we need to use methods present in _different_ package
//so we need to import package
import Demo.*;
//import Demo;   //we cannot import like this

public class demoPackages {
 
	public static void main(String[] args) {

	static_nonstatic_methods.staticShow1();                       //classname.method bcaz method is static
	static_nonstatic_methods obj=new static_nonstatic_methods();
	obj.nonStaticShow1();                                         //for non static method we need to create obj
	
	}
}
