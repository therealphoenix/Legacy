package com.klindziuk.task01.one;

import com.klindziuk.task01.util.ArgsChecker;
import com.klindziuk.task01.util.PrintHelper;

public class TaskOneArgsChecker extends ArgsChecker {
	
	private static final int REQUIRED_ARGS_LENGTH = 1;
	private static final int RATIO_NUMBER = 2;
	private static final String ZERO_ARGS_ERROR_MESSAGE = "You don't input numbers for calculating.Please,try again.";
	private static final String TOO_MANY_ARGS_ERROR_MESSAGE = "You input too many arguments.Only one number needed.Please, try again.";
	private static final String NOT_ENOUGHT_ARGS_ERROR_MESSAGE = "You input not enough arguments.Only one number needed.Please, try again.";
	private static final String ODD_NUMBER_ERROR_MESSAGE = "Can't calculate lucky number.Quantity of numbers must be even.Please try again.";
		
     @Override
	protected void checkArgumentsSize(String[] args) {
		if (0 == args.length) {
			PrintHelper.print(ZERO_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
		if (REQUIRED_ARGS_LENGTH < args.length) {
			PrintHelper.print(NOT_ENOUGHT_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
		if (REQUIRED_ARGS_LENGTH > args.length) {
			PrintHelper.print(TOO_MANY_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
	}

	protected void checkEvenQuantityOfSymbols(String lineOfNumber) {
		if ((lineOfNumber.length() % RATIO_NUMBER) != 0) {
			PrintHelper.print(ODD_NUMBER_ERROR_MESSAGE);
			System.exit(-1);
		}
	}
	
	public void fullArgsCheck(String[] args) {
		checkArgumentsSize(args);
		checkMaxQuantityOfSymbols(args);
		checkForSpecialSymbols(args);
		checkEvenQuantityOfSymbols(args[0]);
	}
}
