package com.klindziuk.task01.eight;

import com.klindziuk.task01.util.ArgsChecker;
import com.klindziuk.task01.util.PrintHelper;

public class TaskEightArgsChecker extends ArgsChecker {
	private static final int ZERO_ARGS_LENGHT = 0;
	private static final int REQUIRED_ARGS_LENGTH = 2;
	private static final String ZERO_ARGS_ERROR_MESSAGE = "You don't input numbers for calculating.Please,try again.";
	private static final String TOO_MANY_ARGS_ERROR_MESSAGE = "You input too many arguments.Only two numbers needed.Please, try again.";
	private static final String NOT_ENOUGHT_ARGS_ERROR_MESSAGE = "You input not enough arguments.Two numbers needed.Please, try again.";
		
	@Override
	protected void checkArgumentsSize(String[] args) {
		if (ZERO_ARGS_LENGHT == args.length) {
			PrintHelper.print(ZERO_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
		if (REQUIRED_ARGS_LENGTH > args.length) {
			PrintHelper.print(NOT_ENOUGHT_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
		if (REQUIRED_ARGS_LENGTH < args.length) {
			PrintHelper.print(TOO_MANY_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
	}
	
	public void fullArgsCheck(String[] args) {
		checkArgumentsSize(args);
		checkMaxQuantityOfSymbols(args);
		checkForSpecialSymbols(args);
	}
}
