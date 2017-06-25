package com.klindziuk.task01.eight;

public class Calculator {
	private static final String NULL_EXCEPTION_MESSAGE = "Cannot perform calculating with \"null\".";
	private static final String ZERO_DIVIDE_EXCEPTION_MESSAGE = "Cannot divide by zero.";
	

	public int calculateSum(int[] array, int number) {
		if(null == array){
			throw new IllegalArgumentException(NULL_EXCEPTION_MESSAGE);
		}
		if(0 == number){
			throw new IllegalArgumentException(ZERO_DIVIDE_EXCEPTION_MESSAGE);
		}
		int result = 0;
		for (int i : array) {
			if (i % number == 0) {
				result = result + i;
			}
		}
		return result;
	}
}
