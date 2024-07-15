package streams;

import java.util.Arrays;
import java.util.List;

public class AverageMarks_ofStudents {

	public static void main(String[] args) {
		List<Students> details = Arrays.asList(new Students(1, "Shubham", 89), 
												new Students(2, "Avinash", 70),
												 new Students(3, "Deepanshi", 68));

		double avg = details.stream()
							 .mapToInt(x -> x.getMarks())
							  .average()
							   .getAsDouble();

		System.out.println(avg);

	}

}
