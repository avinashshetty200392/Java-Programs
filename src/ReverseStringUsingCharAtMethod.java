public class ReverseStringUsingCharAtMethod {

	public void reverseTringUsingCharAtMethod() {
		String input = "Avinash";
		StringBuilder reverseStringBuilder = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			reverseStringBuilder.append(input.charAt(i));
		}
		System.out.println(reverseStringBuilder.toString());

	}

	public static void main(String[] args) {
		ReverseStringUsingCharAtMethod rsucam = new ReverseStringUsingCharAtMethod();
		rsucam.reverseTringUsingCharAtMethod();
	}
}
