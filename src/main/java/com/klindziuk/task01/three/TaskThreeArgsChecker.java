package com.klindziuk.task01.three;

import com.klindziuk.task01.util.ArgsChecker;
import com.klindziuk.task01.util.PrintHelper;

public class TaskThreeArgsChecker extends ArgsChecker {
	private static final String REGEXP_PATTERN = "[0-9]+([,.][0-9]{1,2})?";
	private static final String ZERO_SIDE_ERROR_MESSAGE = "Sides of triangle  can't be zero.Please try again.";
	private static final String RESTRICTED_SYMBOLS_ERROR_MESSAGE = "Only numbers allowed.Please try again.";
	
	@Override
	protected void checkForSpecialSymbols(String[] args) {
		for (String line : args) {
			if (!line.matches(REGEXP_PATTERN)) {
				PrintHelper.print(RESTRICTED_SYMBOLS_ERROR_MESSAGE);
				System.exit(-1);
			}
		}
	}

	@Override
	protected void checkForZero(String[] args) {
		for (String line : args) {
			if ("0".equals(line)) {
				PrintHelper.print(ZERO_SIDE_ERROR_MESSAGE);
				System.exit(-1);
			}
		}
	}

	public void fullArgsCheck(String[] args) {
		checkArgumentsSize(args);
		checkMaxQuantityOfSymbols(args);
		checkForSpecialSymbols(args);
		checkForZero(args);
	}
}
