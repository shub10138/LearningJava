package generics;

public class GenericFunction<T> {
	public static <T> int count(T arr[], T x) {
		int result = 0;

		for (T e : arr) {
			if (e.equals(x))
				result++;
		}

		return result;
	}
}
