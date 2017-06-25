package com.klindziuk.task01.four;

public class PointChecker {
	
	private static final String NULL_POINT_EXCEPTION_MESSAGE = "Cannot check locations for point \"null\".";
	private static final String NULL_AREA1_EXCEPTION_MESSAGE = "Cannot check locations for upper area \"null\".";
	private static final String NULL_AREA2_EXCEPTION_MESSAGE = "Cannot check locations for lower area \"null\".";

	public boolean checkFullLocation(Area2D lower, Area2D upper, Point2D point) {
		if (null == point) {
			throw new IllegalArgumentException(NULL_POINT_EXCEPTION_MESSAGE);
		}
		if (null == upper) {
			throw new IllegalArgumentException(NULL_AREA1_EXCEPTION_MESSAGE);
		}
		if (null == lower) {
			throw new IllegalArgumentException(NULL_AREA2_EXCEPTION_MESSAGE);
		}
		return checkUpperLocation(upper, point) || checkLowerLocation(lower,point);
	}

	private boolean checkUpperLocation(Area2D upper, Point2D point) {
		return (point.getX() >= upper.getX1() && point.getX() <= upper.getX2())
				&& (point.getY() >= upper.getY1() && point.getY() <= upper.getY2());
	}

	private boolean checkLowerLocation(Area2D lower, Point2D point) {
		return (point.getX() >= lower.getX1() && point.getX() <= lower.getX2())
				&& (point.getY() >= lower.getY1() && point.getY() <= lower.getY2());
	}
}
