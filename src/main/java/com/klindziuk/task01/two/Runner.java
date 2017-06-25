package com.klindziuk.task01.two;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	private static final String RESULT_EXPRESSION_MESSAGE = "The result of the expression is";
	private static final String PARSING_EXCEPTION_MESSAGE = "Exception during pasring the arguments.";

	public static void main(String[] args) {
		new TaskTwoArgsChecker().fullArgsCheck(args);
		try {
			double[] numbers = ArrayUtils.convertArrayOfStringsToDouble(args);
			PrintHelper.print(RESULT_EXPRESSION_MESSAGE, new Calculator().calculateExpression(numbers));
		} catch (NumberFormatException nfex) {
			PrintHelper.print(PARSING_EXCEPTION_MESSAGE);
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
