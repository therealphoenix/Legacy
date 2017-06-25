package com.klindziuk.task01.three;

public class Calulator {
	private static final String SQUARE_EXCEPTION_MESSAGE = "Cannot perform square calculation.Sides are should be greater than zero.";
	private static final String PERIMETER_EXCEPTION_MESSAGE = "Cannot perform perimeter calculation.Sides are should be greater than zero.";

	public double calculateTriangleSquare(double a, double b) {
		if (0 > a || 0 > b) {
			throw new IllegalArgumentException(SQUARE_EXCEPTION_MESSAGE);
		}
		return (a * b) / 2;
	}

	public double calculateTrianglePerimeter(double a, double b) {
		if (0 > a || 0 > b) {
			throw new IllegalArgumentException(PERIMETER_EXCEPTION_MESSAGE);
		}
		return a + b + Math.sqrt(a * a + b * b);
	}
}
