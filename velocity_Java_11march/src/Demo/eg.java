package Demo;

public class eg {
	

	static void printPattern(int n)
	{
		int star =0;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if((j+star)<=n)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			star++;
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		printPattern(3);	
	}
}
	
	
	
	

