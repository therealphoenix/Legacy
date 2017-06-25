package com.klindziuk.task01.five;

public class PowerCalculator {
	private static final int POWER_FOR_POSITIVE = 2;
	private static final int POWER_FOR_NEGATIVE = 4;
	private static final String EXCEPTION_MESSAGE = "Cannot perform calculating with \"null\".";

	public double[] calculatePower(double[] array) {
		if(null == array){
			throw new IllegalArgumentException(EXCEPTION_MESSAGE);
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				array[i] = Math.pow(array[i], POWER_FOR_POSITIVE);
			} else {
				array[i] = Math.pow(array[i], POWER_FOR_NEGATIVE);
			}
		}
		return array;
	}
}
