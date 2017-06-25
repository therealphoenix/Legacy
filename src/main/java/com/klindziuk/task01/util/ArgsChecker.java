package com.klindziuk.task01.util;

public abstract class ArgsChecker {

	private static final int MAXIMUM_QUANTITY_OF_NUMBERS = 100;
	private static final String REGEXP_PATTERN = "\\d+";
	private static final int ZERO_ARGS_LENGHT = 0;
	private static final int REQUIRED_ARGS_LENGTH = 3;
	private static final String ZERO_ARGS_ERROR_MESSAGE = "You don't input numbers for calculating.Please,try again.";
	private static final String ZERO_SIDE_ERROR_MESSAGE = "Arguments can't be zero.Please try again.";
	private static final String TOO_MANY_ARGS_ERROR_MESSAGE = "You input too many arguments.Please, try again.";
	private static final String NOT_ENOUGHT_ARGS_ERROR_MESSAGE = "You input not enough arguments.Please, try again.";
	private static final String RESTRICTED_SYMBOLS_ERROR_MESSAGE = "Only numbers allowed.Please try again.";
	private static final String QUANTITY_ERROR_MESSAGE = "Quantity of numbers is bigger than "
			+ MAXIMUM_QUANTITY_OF_NUMBERS + ".Please try again.";

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
	
	protected void checkMaxQuantityOfSymbols(String[] args) {
		for (String line : args) {
			if (line.length() > MAXIMUM_QUANTITY_OF_NUMBERS) {
				PrintHelper.print(QUANTITY_ERROR_MESSAGE);
				System.exit(-1);
			}
		}
	}
	
	protected void checkForSpecialSymbols(String[] args) {
		for (String line : args) {
			if (!line.matches(REGEXP_PATTERN)) {
				PrintHelper.print(RESTRICTED_SYMBOLS_ERROR_MESSAGE);
				System.exit(-1);
			}
		}
	}
	
	protected void checkForZero(String[] args) {
		for (String line : args) {
			if ("0".equals(line)) {
				PrintHelper.print(ZERO_SIDE_ERROR_MESSAGE);
				System.exit(-1);
			}
		}
	}
}
