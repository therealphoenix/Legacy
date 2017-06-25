package com.klindziuk.task01.five;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	private static final String BEFORE_POWERING_MESSAGE = "Numbers before powering";
	private static final String AFTER_POWERING_MESSAGE = "Numbers after powering";

	public static void main(String[] args) {
		new TaskFiveArgsChecker().fullArgsCheck(args);
		try {
			double[] numbers = ArrayUtils.convertArrayOfStringsToDouble(args);
			PrintHelper.print(BEFORE_POWERING_MESSAGE, numbers);
			PrintHelper.print(AFTER_POWERING_MESSAGE, new PowerCalculator().calculatePower(numbers));
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
