/*
 * DistAttenuationAttributes.java
 * 
 * Created on Oct 30, 2007, 2:06:56 PM
 * 
 */

package com.nokia.midp.example.jsr234.audio3d;

/**
 * Bean Class stored Distance attenuation attributes. Main attributes of Distance Attenuation are: <br>
 * <ol>
 * 1. Minimum distance<br>
 * 2. Maximum distance<br>
 * 3. Roll Off Factor<br>
 * 4. Mute sound after max distance condition
 * </ol>
 * @author krn
 */

public class DistAttenuationAttributes {

	private int daRMin;
	private int daRMax;
	private int rollOfFactor;
	private boolean daMuteAfterMax;

	//DistAttenuationAttributes is instantiated with default values
	public DistAttenuationAttributes(int rmin, int rmax, int rf, boolean MaM) {
		daRMin = rmin;
		daRMax = rmax;
		rollOfFactor = rf;
		daMuteAfterMax = MaM;

	}

	public int getDaRMin() {
		return daRMin;
	}

	public void setDaRMin(int daRMin) {
		this.daRMin = daRMin;
	}

	public int getDaRMax() {
		return daRMax;
	}

	public void setDaRMax(int daRMax) {
		this.daRMax = daRMax;
	}

	public int getRollOfFactor() {
		return rollOfFactor;
	}

	public void setRollOfFactor(int rollOfFactor) {
		this.rollOfFactor = rollOfFactor;
	}

	public boolean isDaMuteAfterMax() {
		return daMuteAfterMax;
	}

	public void setDaMuteAfterMax(boolean daMuteAfterMax) {
		this.daMuteAfterMax = daMuteAfterMax;
	}

}
