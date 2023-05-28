package Demo;

public class getter_setter {

private int val;
	
private String str;
// we can initialize global variable in the getter and setter method to achieve encapsulation
// global variable are made private and getter and setter are made public to manipulate data.
	public int getData() {
		return val;
	}
	public void setData(int a) {
		val=a;
	}
	public String getStringData() {
		return str;
	}
	public void setStringData(String s) {
		str=s;
	}
	
	
	
}
