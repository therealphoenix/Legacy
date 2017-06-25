package com.klindziuk.task01.two;

public class Calculator {
	private static final String NULL_EXCEPTION_MESSAGE = "Cannot perform calculation of expression with \"null\".";
	private static final String ZERO_ARGS_EXCEPTION_MESSAGE = "Arguments cannot be equals to 0.";

	public double calculateExpression(double[] args) {
		if (null == args) {
			throw new IllegalArgumentException(NULL_EXCEPTION_MESSAGE);
		}
		if (( 0 == (args[0]) || ( 0 == args[1]) || (0 == args[2]))) {
			throw new IllegalArgumentException(ZERO_ARGS_EXCEPTION_MESSAGE);
		}
		double a = args[0];
		double b = args[1];
		double c = args[2];
		
		return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));
	}
}
