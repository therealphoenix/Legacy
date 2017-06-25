package com.klindziuk.task01.util;

import java.util.Arrays;
import java.util.Map;

public class PrintHelper {

	public static void print(String message) {
		System.out.println(message);
	}

	public static void print(String message, boolean result) {
		System.out.println(message + " : " + result);
	}

	public static void print(String message, double result) {
		System.out.println(message + " : " + result);
	}

	public static void print(String message, int[] result) {
		System.out.println(message + " : " + Arrays.toString(result));
	}

	public static void print(String message, double[] result) {
		System.out.println(message + " : " + Arrays.toString(result));
	}

	public static void print(String message, String[] result) {
		System.out.println(message + " : " + Arrays.toString(result));
	}

	public static void print(Map<Double, Double> map) {
		for (Map.Entry<Double, Double> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
