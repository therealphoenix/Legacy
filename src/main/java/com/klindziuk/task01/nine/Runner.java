package com.klindziuk.task01.nine;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	private static final String PRINT_FIRST_ARRAY_MESSAGE = "First array elements";
	private static final String PRINT_SECOND_ARRAY_MESSAGE = "Second array elements";
	private static final String PRINT_MERGED_ARRAY_MESSAGE = "Merged array elements";

	public static void main(String[] args) {
		new TaskNineArgsChecker().fullArgsCheck(args);
		try {
			int[] arguments = ArrayUtils.convertArrayOfStringsToInt(args);
			int[] firstArray = ArrayUtils.createArrayWithFloatQuantity(arguments[0]);
			int[] secondArray = ArrayUtils.createArrayWithFloatQuantity(arguments[1]);
			int[] result = new ArrayMerger().mergeArrayfromPreterminiedPosition(firstArray, secondArray, arguments[2]);
			PrintHelper.print(PRINT_FIRST_ARRAY_MESSAGE, firstArray);
			PrintHelper.print(PRINT_SECOND_ARRAY_MESSAGE, secondArray);
			PrintHelper.print(PRINT_MERGED_ARRAY_MESSAGE, result);
		} catch (IllegalArgumentException iaex) {
			PrintHelper.print(iaex.getMessage());
		}
	}
}
