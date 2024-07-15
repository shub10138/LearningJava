package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectDataIntoMap {

	public static void main(String[] args) {
		List<Students> details = Arrays.asList(new Students(1, "Shubham", 89), 
												new Students(2, "Avinash", 70),
												 new Students(3, "Deepanshi", 68));

		Map<Integer, String> m = details.stream()
										.collect(Collectors.toMap(
															Students::getRollno,
															Students::getName));
		System.out.println(m.toString());
	}

}
