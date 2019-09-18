public class LargestSmallestNumberFromAnArray {

	public void getSmallestLargestNumberFromArray() {
		int[] intArray = new int[] { 10, 20, 30, 40, 50, 90 };
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		for (int value : intArray) {
			if (value < smallest) {
				smallest = value;
			}
		}
		System.out.println("Smallest value from array is:" + " " + smallest);
		for (int value : intArray) {
			if (value > largest) {
				largest = value;
			}
		}
		System.out.println("Largest value from array is:" + " " + largest);
	}

	public static void main(String args[]) {
		LargestSmallestNumberFromAnArray lsnfa = new LargestSmallestNumberFromAnArray();
		lsnfa.getSmallestLargestNumberFromArray();
	}
}
