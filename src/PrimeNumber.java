import java.util.Scanner;

public class PrimeNumber {
	public void toVerifyPrimeNumber() {
		boolean isTrue = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 2; i <= num / 2; i++) {
			int temp = num % i;
			if (temp == 0) {
				isTrue = false;
				break;
			}
		}

		if (isTrue) {
			System.out.println(num + " " + "is a prime number");
		} else {
			System.out.println(num + " " + "is not a prime number");
		}
	}

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.toVerifyPrimeNumber();
	}

}
