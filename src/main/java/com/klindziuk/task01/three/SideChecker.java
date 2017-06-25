package com.klindziuk.task01.three;

public class SideChecker {
	
	public static boolean checkSides(double sideA, double sideB, double sideC) {
		return (((sideA > 0) && (sideB > 0) && (sideC > 0)));
	}

	public static boolean isRightTriangle(double sideA, double sideB, double sideC) {
		return (Math.pow(sideA, 2) + Math.pow(sideB, 2)) == (Math.pow(sideC, 2));
	}
}
