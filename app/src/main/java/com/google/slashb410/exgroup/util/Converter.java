package com.google.slashb410.exgroup.util;

public class Converter {
	public static float DegreeToRadian(float angle){
		return (float) (angle * Math.PI / 180);
	}
	
	public static float RadianToDegree(float radian){
		return (float) (radian * 180 / Math.PI);
	}
}
