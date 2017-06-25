package com.klindziuk.task01.eight;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	private static final String PRINT_ARRAY_MESSAGE = "Elements of array";
	private static final String SUM_MULTIPLE_MESSAGE = "Sum of multiple elements is";

	public static void main(String[] args) {
		new TaskEightArgsChecker().fullArgsCheck(args);
		try {
			int[] arguments = ArrayUtils.convertArrayOfStringsToInt(args);
			int[] array = ArrayUtils.createArrayWithFloatQuantity(arguments[0]);
			PrintHelper.print(PRINT_ARRAY_MESSAGE, array);
			PrintHelper.print(SUM_MULTIPLE_MESSAGE, new Calculator().calculateSum(array, arguments[1]));
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
