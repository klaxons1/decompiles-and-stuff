package com.nokia.midp.example.jsr234.audio3d;

/**
 * Bean Class stored location attributes. Main attributes of LocationControl are: <br>
 * <ol>
 * 1. Scale<br>
 * 2. Altitude
 * </ol>
 * @author gothadiy
 *
 */
public class LocationAttributes {

	private int locAltitude;
	private int locScale;
        
	public LocationAttributes(int scale, int altitude) {
		locScale = scale;
        locAltitude = altitude;
	}

	public int getLocAltitude() {
		return locAltitude;
	}

	public void setLocAltitude(int locAltitude) {
		this.locAltitude = locAltitude;
	}

	public int getLocScale() {
		return locScale;
	}

	public void setLocScale(int locScale) {
		this.locScale = locScale;
	}
	
    
}
