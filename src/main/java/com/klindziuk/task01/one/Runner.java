package com.klindziuk.task01.one;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	private static final String LUCKY_NUMBER_MESSAGE = " Is lucky number ?";

	public static void main(String[] args) {
		new TaskOneArgsChecker().fullArgsCheck(args);
		try {
			int[] array = ArrayUtils.createArrayFromStringLine(args[0]);
			PrintHelper.print(args[0] + LUCKY_NUMBER_MESSAGE, new LuckyNumberCalulator().isLuckyNumber(array));
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
