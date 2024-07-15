package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy_Marks {

	public static void main(String[] args) {
		List<Students> details = Arrays.asList(new Students(1, "Shubham", 60), 
												new Students(2, "Avinash", 70),
												 new Students(3, "Deepanshi", 60));
		
		Map<Integer, List<Students>> group = details.stream()
														.collect(Collectors.groupingBy(
																            Students::getMarks));
		
		System.out.println(group.toString());

	}

}
