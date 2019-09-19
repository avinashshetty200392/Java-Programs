
public class ReverseANumber {
	public static void reverseANumber()
	{
		String input = "1234";
		StringBuilder sb = new StringBuilder();
		for(int i=input.length()-1;i>=0;i--)
		{
			sb.append(input.charAt(i));
		}
		System.out.println(sb);
	}

	public static void main(String[] args)
	{
		reverseANumber();
	}
}
