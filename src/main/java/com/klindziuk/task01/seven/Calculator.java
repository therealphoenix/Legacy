package com.klindziuk.task01.seven;

import java.util.Map;
import java.util.TreeMap;

public class Calculator {
	private static final int REQUIRED_ARGS_LENGTH = 3;
	private static final String NULL_EXCEPTION_MESSAGE = "Cannot perform calculation of function with \"null\" arguments.";
	private static final String TOO_MANY_ARGS_EXCEPTION_MESSAGE = "Cannot perform calculation.Too many arguments.";
	private static final String NOT_ENOUGH_EXCEPTION_MESSAGE = "Cannot perform calculation.Not enough arguments.";

	public Map<Double, Double> calculateFunction(double[] array) {
		if (null == array) {
			throw new IllegalArgumentException(NULL_EXCEPTION_MESSAGE);
		}
		if (REQUIRED_ARGS_LENGTH > array.length) {
			throw new IllegalArgumentException(NOT_ENOUGH_EXCEPTION_MESSAGE);
		}
		if (REQUIRED_ARGS_LENGTH < array.length) {
			throw new IllegalArgumentException(TOO_MANY_ARGS_EXCEPTION_MESSAGE);
		}
		Map<Double, Double> result = new TreeMap<>();
		double a = array[0];
		double b = array[1];
		double step = array[2];
		do {
			double function = Math.pow(Math.sin(a), 2) - Math.cos(2 * a);
			result.put(a, function);
		} while ((a = a + step) <= b);
		return result;
	}
}
