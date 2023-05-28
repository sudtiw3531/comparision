package DemoPackages;

public class Practice {
	public static void main(String[] args) {
      
		show(10,'a');
		show('v',10);
		
}
	static void show(int a,char b) {
		System.out.println("show1");
	}

	static void show(char a, int b) {
		System.out.println("show2");
	}

	float show(float a) {
		System.out.println("show3");
		return 9.0;
	}
	void show() {
		System.out.println("show4");
	}

}
