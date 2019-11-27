
public class swap2NumbersWithout3rdVariables {
	
	static int x=30;
	static int y=10;

	public static void swapNumbers()
	{
		System.out.println("x value before swap: "+ x);
		System.out.println("y value before swap: "+ y);
		
		x=x+y;  //x= 30+10= 40
		y=x-y;  //y= 40-10= 30
		x=x-y;  //x= 40-30= 10
		
		System.out.println("x value after swap: "+ x);
		System.out.println("y value after swap: "+ y);
	}
	
	public static void main(String args[])
	{
		swapNumbers();
	}
}
