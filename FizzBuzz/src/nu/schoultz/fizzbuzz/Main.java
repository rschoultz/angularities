package nu.schoultz.fizzbuzz;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		IntStream.range(0, 100).forEach(
				(x) -> {
					String t = "";
					t += (x % 3) == 0 ? "fizz" : "";
					t += (x % 5) == 0 ? "buzz" : "";
					System.out.println(!t.isEmpty() ? t : x);
				});
	}



}
