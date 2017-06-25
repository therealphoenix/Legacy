package com.klindziuk.task01.util;

public class ArrayUtils {
	private static final String REGEXP_FOR_INTEGER_PATTERN = "[0-9-]+";
	private static final String REGEXP_FOR_DOUBLE_PATTERN = "^(?=.)([+-]?([0-9]*)(\\.([0-9]+))?)$";
	private static final String CREATE_NULL_EXCEPTION_MESSAGE = "Cannot perform creation of array from \"null\"";
	private static final String EMPTY_LINE_EXCEPTION_MESSAGE = "Cannot perform creation of array from empty line";
	private static final String RESTRICTED_SYMBOLS_EXCEPTION_MESSAGE = "Cannot perform creation of array.Line contains restricted symbols";
	private static final String ZERO_SIZE_EXCEPTION_MESSAGE = "Cannot perform creation of array.Size of array should be grater than zero.";
	private static final String CONVERT_NULL_EXCEPTION_MESSAGE = "Cannot perform convert from \"null\".";
	private static final String CONVERT_EMPTY_LINE_EXCEPTION_MESSAGE = "Cannot perform convertion from empty line.";

	public static int[] createArrayFromStringLine(String line) {
		if (null == line) {
			throw new IllegalArgumentException(CREATE_NULL_EXCEPTION_MESSAGE);
		}
		if ("".equals(line)) {
			throw new IllegalArgumentException(EMPTY_LINE_EXCEPTION_MESSAGE);
		}
		if (!line.matches(REGEXP_FOR_INTEGER_PATTERN)) {
			throw new IllegalArgumentException(RESTRICTED_SYMBOLS_EXCEPTION_MESSAGE);
		}
		int[] result = new int[line.length()];
		for (int i = 0; i < line.length(); i++) {
			result[i] = line.charAt(i) - '0';
		}
		return result;
	}

	public static int[] createArrayWithFloatQuantity(int quantityOfElements) {
		if (0 >= quantityOfElements) {
			throw new IllegalArgumentException(ZERO_SIZE_EXCEPTION_MESSAGE);
		}
		int[] result = new int[quantityOfElements];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * (9 - 0) + 1);
		}
		return result;
	}

	public static int[] convertArrayOfStringsToInt(String[] args) {
		if (null == args) {
			throw new IllegalArgumentException(CONVERT_NULL_EXCEPTION_MESSAGE);
		}
		for (String line : args) {
			if ("".equals(line)) {
				throw new IllegalArgumentException(CONVERT_EMPTY_LINE_EXCEPTION_MESSAGE);
			}
		}
		for (String line : args) {
			if (!line.matches(REGEXP_FOR_INTEGER_PATTERN)) {
				throw new IllegalArgumentException(RESTRICTED_SYMBOLS_EXCEPTION_MESSAGE);
			}
		}
		int[] result = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			result[i] = Integer.parseInt(args[i]);
		}
		return result;
	}

	public static double[] convertArrayOfStringsToDouble(String[] args) {
		if (null == args) {
			throw new IllegalArgumentException(CONVERT_NULL_EXCEPTION_MESSAGE);
		}
		for (String line : args) {
			if ("".equals(line)) {
				throw new IllegalArgumentException(CONVERT_EMPTY_LINE_EXCEPTION_MESSAGE);
			}
		}
		for (String line : args) {
			if (!line.matches(REGEXP_FOR_DOUBLE_PATTERN)) {
				throw new IllegalArgumentException(RESTRICTED_SYMBOLS_EXCEPTION_MESSAGE);
			}
		}
		double[] result = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			result[i] = Double.parseDouble(args[i]);
		}
		return result;
	}
}
