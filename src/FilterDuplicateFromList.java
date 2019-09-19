import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterDuplicateFromList {

	public void filterDuplicateFromList() {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i <= 10; i++) {
			list.add(Integer.toString(i));
		}
		for (int j = 1; j <= 5; j++) {
			list.add(Integer.toString(j));
		}
		Set<String> result = new HashSet<String>();
		Set<String> finalResult = new HashSet<String>();
		for (String val : list)
			if (!result.add(val)) {
				finalResult.add(val);
			}
		System.out.println(finalResult);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilterDuplicateFromList fdfl = new FilterDuplicateFromList();
		fdfl.filterDuplicateFromList();

	}

}
