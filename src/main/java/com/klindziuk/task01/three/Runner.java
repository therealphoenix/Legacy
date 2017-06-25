package com.klindziuk.task01.three;

import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	private static final String TRIANGLE_SQUARE_MESSAGE = "The square of right triangle is";
	private static final String TRIANGLE_PERIMETER_MESSAGE = "The perimeter of righ triangle is";

	public static void main(String[] args) {
		new TaskThreeArgsChecker().fullArgsCheck(args);
		try {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double c = Double.parseDouble(args[2]);
			RightTriangle.init(a, b, c);
			RightTriangle triangle = RightTriangle.getInstance();
			Calulator calculator = new Calulator();
			PrintHelper.print(TRIANGLE_SQUARE_MESSAGE,
					calculator.calculateTriangleSquare(triangle.getSideA(), triangle.getSideB()));
			PrintHelper.print(TRIANGLE_PERIMETER_MESSAGE,
					calculator.calculateTrianglePerimeter(triangle.getSideA(), triangle.getSideB()));
		} catch (IllegalArgumentException iaex) {
			PrintHelper.print(iaex.getMessage());
		}
	}
}
