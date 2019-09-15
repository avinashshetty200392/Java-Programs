public class Pattern {
	public void patternOfNumbers() {
		// Outer loop.
		for (int i = 1; i <= 5; i++) {
			// Inner loop to print numbers.
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// To print numbers on next line.
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Calling Non static method
		Pattern p = new Pattern();
		p.patternOfNumbers();
	}
}
