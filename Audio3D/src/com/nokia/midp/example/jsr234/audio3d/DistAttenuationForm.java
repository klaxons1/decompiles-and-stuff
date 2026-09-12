package com.nokia.midp.example.jsr234.audio3d;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

/**
 * Distance Attenuation Form to set Distance attenuation related parameters 
 * <br>
 * The parameters for setting the distance attenuation taken from user 
 * <br>
 * <ol>
 * 1.Minimum attenuation distance - up to which distance gain is 1<br>
 * 2.Maximum attenuation distances - after which the sound will be muted or held at same level depending on the muteAfterMax setting<br>
 * 3.Roll off factor - The sound attenuation with distance is more when the this factor is more.<br>
 * 4.muteafterMax - when true, sound is muted after max attenuation distance. when false, the sound is held at level which is at maximum attenuation distance
 * </ol>
 * 
 * @author krn
 */
public class DistAttenuationForm extends Form implements CommandListener {

	Audio3DMIDlet midlet;

	/**TextField to take min attenuation distance*/
	TextField txtRmin = null;
	
	/**TextField to take max attenuation distance*/
	TextField txtRmax = null;
	
	/**TextField to take Roll of Factor*/
	TextField txtRF = null;
	
	/**TextField to take input for mute/unmute after max distance*/
	TextField txtMuteAfterMax = null;

	/**OkCommand to apply the settings*/
	Command okCommand = new Command("Set", Command.OK, 1);
	
	/**cancelCommand to revert back the changes*/
	Command cancelCommand = new Command("Cancel", Command.CANCEL, 2);

	/**
	 * Constructor to initialize the Distance attenuation setting form
	 * @param title Distance attenuation setting form title
	 * @param midlet Audio3DMIDlet midlet reference
	 * 
	 */
	public DistAttenuationForm(String title, Audio3DMIDlet midlet) {
		super(title);

		this.midlet = midlet;
		displayDistanceAttenuationSettingForm(midlet);

	}

	/**
	 * Display distance attenuation settings form. current values of Min and Max
	 * distance attenuation distances roll off factor and MutAfterMax condition
	 * is read and shown. User will enter the values within the range specified
	 * in the textfield provided 
	 * 
	 * @param midlet
	 *            Audio3DMIDlet reference
	 */
	private void displayDistanceAttenuationSettingForm(Audio3DMIDlet midlet) {
		/*
		 * current values of Min and Max distance attenuation distances
		 * rolloff factor and MutAfterMax condition is read and shown
		 */
		int Rmin = midlet.distAttnAttr.getDaRMin();
		int Rmax = midlet.distAttnAttr.getDaRMax();
		int RF = midlet.distAttnAttr.getRollOfFactor();
		boolean MafterM = midlet.distAttnAttr.isDaMuteAfterMax();

		txtRmin = new TextField("Min Distance (in meter)", "" + Rmin, 6,
				TextField.NUMERIC);
		txtRmax = new TextField("Max Distance (in meter)", "" + Rmax, 6,
				TextField.NUMERIC);
		txtRF = new TextField("Roll off Factor (0 - 4)", "" + RF, 2,
				TextField.DECIMAL);
		txtMuteAfterMax = new TextField("MuteAfterRmax(true or false)", ""
				+ MafterM, 6, TextField.ANY);
		append(txtRmin);
		append(txtRmax);
		append(txtRF);
		append(txtMuteAfterMax);
		addCommand(okCommand);
		addCommand(cancelCommand);
		setCommandListener(this);
	}

	/**
	 * Handles Distance attenuation settings related commands
	 */
	public void commandAction(Command c, Displayable d) {
		if (c == okCommand) {

			//Values entered by the user are read and set for the distance attenuation

			midlet.distAttnAttr.setDaRMin(Integer.parseInt(txtRmin.getString()
					.trim()));
			midlet.distAttnAttr.setDaRMax(Integer.parseInt(txtRmax.getString()
					.trim()));
			midlet.distAttnAttr.setRollOfFactor(Integer.parseInt(txtRF.getString()
					.trim()));
			String Mute = txtMuteAfterMax.getString();
			if (Mute == "true") {
				midlet.distAttnAttr.setDaMuteAfterMax(true);
			} else
				midlet.distAttnAttr.setDaMuteAfterMax(false);

			// Put some negative value to avoid the effect of key navigation
			midlet.audio3DCanvas.changeSourceLocation(-200, midlet);
		}
		midlet.display.setCurrent(midlet.audio3DCanvas);
	}

}
