package com.brigelab.assignment.linecomparision;

public class Linecamparision {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line camparisioncd");
		
		// All Values in mm.
		
		int x1 = 2; 
		int y1 = 2; 
		int x2 = 1; 
		int y2 = 1; 
		
		double lengthOfLine = Math.sqrt((Math.pow((x2-x1),2))+ (Math.pow((y2-y1),2)));
		System.out.println("Length of line is " + lengthOfLine);
		
	}

}
