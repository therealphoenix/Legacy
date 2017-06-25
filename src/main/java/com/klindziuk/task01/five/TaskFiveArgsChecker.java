package com.klindziuk.task01.five;

import com.klindziuk.task01.util.ArgsChecker;
import com.klindziuk.task01.util.PrintHelper;

public class TaskFiveArgsChecker extends ArgsChecker {
	// regexp for double or integer with - and .
	private static final String REGEXP_PATTERN = "^(?=.)([+-]?([0-9]*)(\\.([0-9]+))?)$";
	private static final String RESTRICTED_SYMBOLS_ERROR_MESSAGE = "Only numbers and \"-\" allowed.Please try again.";

	@Override
	protected void checkForSpecialSymbols(String[] args) {
		for (String line : args) {
			if (!line.matches(REGEXP_PATTERN)) {
				PrintHelper.print(RESTRICTED_SYMBOLS_ERROR_MESSAGE);
				System.exit(-1);
			}
		}
	}

	public void fullArgsCheck(String[] args) {
		checkArgumentsSize(args);
		checkMaxQuantityOfSymbols(args);
		checkForSpecialSymbols(args);
	}
}
