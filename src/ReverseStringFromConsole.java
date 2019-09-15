import java.util.Scanner;

public class ReverseStringFromConsole {
	public void reverseStringFromConsole()
	{
		System.out.print("Enter your string:"+" ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuffer sb = new StringBuffer(input);
		System.out.println("Reversed string:"+" "+sb.reverse());
		
	}
	public static void main(String[] args)
	{
		ReverseStringFromConsole rsfc = new ReverseStringFromConsole();
		rsfc.reverseStringFromConsole();
	}

}
