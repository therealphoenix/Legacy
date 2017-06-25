package com.klindziuk.task01.ten;

import com.klindziuk.task01.util.ArgsChecker;
import com.klindziuk.task01.util.PrintHelper;

public class TaskTenArgsChecker extends ArgsChecker {
	private static final int REQUIRED_ARGS_LENGTH = 1;
	private static final String ZERO_ARGS_ERROR_MESSAGE = "You don't input numbers for calculating.Please,try again.";
	private static final String TOO_MANY_ARGS_ERROR_MESSAGE = "You input too many arguments.Only two numbers needed.Please, try again.";
	private static final String NOT_ENOUGHT_ARGS_ERROR_MESSAGE = "You input not enough arguments.Two numbers needed.Please, try again.";
		
	@Override
	protected void checkArgumentsSize(String[] args) {
		if (0 == args.length) {
			PrintHelper.print(ZERO_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
		if (REQUIRED_ARGS_LENGTH < args.length) {
			System.out.println(TOO_MANY_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
		
		if (REQUIRED_ARGS_LENGTH > args.length) {
			System.out.println(NOT_ENOUGHT_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
	}
	
	public int fullArgsCheck(String[] args) {
		checkArgumentsSize(args);
		checkMaxQuantityOfSymbols(args);
		checkForSpecialSymbols(args);
		return Integer.parseInt(args[0]);
	}
}
