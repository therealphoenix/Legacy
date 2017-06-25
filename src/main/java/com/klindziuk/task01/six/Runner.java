package com.klindziuk.task01.six;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	private static final String ARRAY_PRINT_MESSAGE = "Elements of array";
	private static final String SUM_PRINT_MESSAGE = "Sum of min and max element";
	public static void main(String[] args) {
		try {
			new TaskSixArgsChecker().fullArgsCheck(args);
			int[] numbers = ArrayUtils.convertArrayOfStringsToInt(args);
			PrintHelper.print(ARRAY_PRINT_MESSAGE, numbers);
			PrintHelper.print(SUM_PRINT_MESSAGE, new Calculator().calculateSumOfMinAndMax(numbers));
		} catch (IllegalArgumentException iaex) {
			PrintHelper.print(iaex.getMessage());
		}
	}
}
