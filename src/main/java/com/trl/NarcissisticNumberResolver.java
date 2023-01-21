package com.trl;

import java.util.Arrays;

public class NarcissisticNumberResolver {

	public static boolean isNumberNarcissistic(final int number) {
		final int power = (number + "").length();
		final String[] numbers = (number + "").split("");
		Double result = 0.0;

		for (int i = 0; i < numbers.length; i++) {
			final Double n = Double.parseDouble(numbers[i]);
			result += Math.pow(n, power);
		}

		System.out.println(">>>>>>>> " + number);
		System.out.println(">>>>>>>> " + power);
		System.out.println(">>>>>>>> " + Arrays.toString(numbers));
		System.out.println(">>>>>>>> " + result);

		return result.equals(Double.parseDouble(number + ""));
	}

}
