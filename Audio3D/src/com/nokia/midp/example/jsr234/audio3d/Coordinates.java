package com.nokia.midp.example.jsr234.audio3d;

/**
 * Class handles UI Coordinates
 * @author gothadiy
 *
 */
public class Coordinates {
	
	int maxX;
	int maxY;
	
	/**Coordinated for sound source X*/
	int sourceX;
	
	/**Coordinated for sound source Y*/
	int sourceY;

	/**Coordinated for Observer X*/
	int specX;
	
	/**Coordinated for Observer X*/
	int specY;

	/**
	 * Sets the coordinates based on the maxX and maxY value
	 * @param maxX
	 * @param maxY
	 */
	public Coordinates(int maxX, int maxY) {
		this.maxX = maxX;
		this.maxY = maxY;
		
		specX = this.maxX / 2;
		specY = this.maxY / 2;
		
		sourceX = this.maxX / 2;
		sourceY = this.maxY / 3;
	}

}
