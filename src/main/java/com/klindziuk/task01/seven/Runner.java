package com.klindziuk.task01.seven;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	private static final String PARSING_EXCEPTION_MESSAGE = "Exception during pasring the line.";

	public static void main(String[] args) {
		new TaskSevenArgsChecker().fullArgsCheck(args);
		try {
			double[] numbers = ArrayUtils.convertArrayOfStringsToDouble(args);
			PrintHelper.print(new Calculator().calculateFunction(numbers));
		} catch (NumberFormatException nfex) {
			PrintHelper.print(PARSING_EXCEPTION_MESSAGE);
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
