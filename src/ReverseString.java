import java.io.InputStreamReader;

public class ReverseString {

	public void reverseString() {
		StringBuffer input = new StringBuffer("Avinash");
		System.out.println("Input string: Avinash");
		StringBuffer reversedString = input.reverse();
		System.out.println("Reversed string:"+" "+reversedString);
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.reverseString();
	}
}
