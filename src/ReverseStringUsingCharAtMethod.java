public class ReverseStringUsingCharAtMethod {

	public void reverseTringUsingCharAtMethod() {
		String input = "Avinash";
		StringBuilder builder = new StringBuilder();
		for(int i=input.length()-1;i>=0;i--)
		{
			builder.append(input.charAt(i));
		}
		System.out.print(builder.toString());
	}

	public static void main(String[] args) {
		ReverseStringUsingCharAtMethod rsucam = new ReverseStringUsingCharAtMethod();
		rsucam.reverseTringUsingCharAtMethod();
	}
}
