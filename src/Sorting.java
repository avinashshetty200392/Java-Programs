import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {

		Sorting s = new Sorting();
		s.sorting();

	}

	public void sorting() {
		String[] months = {"Jeep","Avinash", "cara", "Baleno",};
		System.out.println("====****Input List****====");
		showList(months);
		System.out.println("====****Sorted List****====");
		Arrays.sort(months);
		showList(months);
		System.out.println("====****Case-Sensitive List****====");
		Arrays.sort(months, String.CASE_INSENSITIVE_ORDER);
		showList(months);
	}

	public static void showList(String[] array) {
		for (String showList : array) {
			System.out.print(showList + " ");
		}
		System.out.println();
	}

}
