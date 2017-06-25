package com.klindziuk.task01.nine;

import com.klindziuk.task01.util.ArgsChecker;

public class TaskNineArgsChecker extends ArgsChecker{

	public void fullArgsCheck(String[] args) {
		checkArgumentsSize(args);
		checkMaxQuantityOfSymbols(args);
		checkForSpecialSymbols(args);
	}
}
