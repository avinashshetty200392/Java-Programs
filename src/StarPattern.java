public class StarPattern {
	public void printStar() 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		StarPattern sp = new StarPattern();
		sp.printStar();
	}

}
