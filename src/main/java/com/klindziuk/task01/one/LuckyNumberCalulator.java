package com.klindziuk.task01.one;

public class LuckyNumberCalulator {
	private static final String NULL_EXCEPTION_MESSAGE = "Cannot perform calculating with \"null\".";

	public boolean isLuckyNumber(int[] array) {
		if (null == array) {
			throw new IllegalArgumentException(NULL_EXCEPTION_MESSAGE);
		}
		int firstSum = 0;
		int secondSum = 0;
		for (int i = 0; i < array.length / 2; i++) {
			firstSum = firstSum + array[i];
			secondSum = secondSum + array[array.length - 1 - i];
		}
		return (firstSum == secondSum);
	}
}
