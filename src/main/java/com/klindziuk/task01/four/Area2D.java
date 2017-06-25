package com.klindziuk.task01.four;

import java.io.Serializable;

public class Area2D implements Serializable {
	
	private static final long serialVersionUID = -2789193921646874099L;
	
	private int minX;
	private int maxX;
	private int minY;
	private int maxY;
	
	public Area2D(int x1, int x2, int y1, int y2) {
		this.minX = x1;
		this.maxX = x2;
		this.minY = y1;
		this.maxY = y2;
	}
	
	public int getX1() {
		return minX;
	}
	public void setX1(int x1) {
		this.minX = x1;
	}
	public int getX2() {
		return maxX;
	}
	public void setX2(int x2) {
		this.maxX = x2;
	}
	public int getY1() {
		return minY;
	}
	public void setY1(int y1) {
		this.minY = y1;
	}
	public int getY2() {
		return maxY;
	}
	public void setY2(int y2) {
		this.maxY = y2;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + minX;
		result = prime * result + maxX;
		result = prime * result + minY;
		result = prime * result + maxY;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Area2D other = (Area2D) obj;
		if (minX != other.minX)
			return false;
		if (maxX != other.maxX)
			return false;
		if (minY != other.minY)
			return false;
		if (maxY != other.maxY)
			return false;
		return true;
	}
}
