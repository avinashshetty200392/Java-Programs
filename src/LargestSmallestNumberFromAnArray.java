public class LargestSmallestNumberFromAnArray {

	public void largestSmallestNumberFromArray() {
		int number = 0;
		int[] intArray = new int[] { 100, 200, 1, 2, 5, 30 };
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		for (int value : intArray) {
			if (value < smallest) {
				smallest = value;
			}
		}
		System.out.println("Smallest value in an array is " + smallest);
		for (int value1 : intArray) {
			if (value1 > largest) {
				largest = value1;
			}
		}
		System.out.println("Largest value in an array is " + largest);
	}

	public static void main(String[] args) {
		LargestSmallestNumberFromAnArray lsnfaa = new LargestSmallestNumberFromAnArray();
		lsnfaa.largestSmallestNumberFromArray();
	}
}
