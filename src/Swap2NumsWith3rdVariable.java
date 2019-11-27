import java.util.Scanner;

public class Swap2NumsWith3rdVariable {
	
	static String x;
	static String y;
	static String temp;
	public static void swap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for x: ");
		x= sc.next();
		System.out.println("Enter value for y: ");
		y= sc.next();
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("Swapped value for x: "+x);
		System.out.println("Swapped value for y: "+y);
	}
	
	public static void main(String args[])
	{
		swap();
	}
	

}
