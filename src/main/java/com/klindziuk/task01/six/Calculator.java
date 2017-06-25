package com.klindziuk.task01.six;

import java.util.Arrays;

public class Calculator {
	private static final String NULL_EXCEPTION_MESSAGE = "Cannot perform calculation  with \"null\" arguments.";

	public int calculateSumOfMinAndMax(int[] array) {
		if (null == array) {
			throw new IllegalArgumentException(NULL_EXCEPTION_MESSAGE);
		}
		Arrays.sort(array);
		return array[0] + array[array.length - 1];
	}
}
