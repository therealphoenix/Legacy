package com.klindziuk.task01.four;

import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	private static final String POINT_CHECK_MESSAGE = "Does the point of the filled area belong ?";
	private static final String PARSING_LINE_ERROR_MESSAGE = "Exception during pasring the line.";

	public static void main(String[] args) {
		new TaskFourArgsChecker().fullArgsCheck(args);
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			Area2D lowerArea = new Area2D(Dimension.LOWER_MIN_X, Dimension.LOWER_MAX_X, Dimension.LOWER_MIN_Y,
					Dimension.LOWER_MAX_X);
			Area2D upperArea = new Area2D(Dimension.UPPER_MIN_X, Dimension.UPPER_MAX_X, Dimension.UPPER_MIN_Y,
					Dimension.UPPER_MAX_Y);
			Point2D point = new Point2D(x, y);
			PrintHelper.print(POINT_CHECK_MESSAGE, new PointChecker().checkFullLocation(lowerArea, upperArea, point));
		} catch (NumberFormatException nfex) {
			PrintHelper.print(PARSING_LINE_ERROR_MESSAGE);
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
