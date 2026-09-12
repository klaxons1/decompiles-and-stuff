package com.nokia.midp.example.jsr234.audio3d;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

/**
 * Location Setting form used Set location control Cartesian.
 * Class takes input to set Scale and Altitude value of the location.
 * <br>
 * 
 * @author gothadiy
 *
 */
public class LocationForm extends Form implements CommandListener {

	Audio3DMIDlet midlet;
	
	/**TextField to set the scale*/
	TextField txtScale = null;
	
	/**TextField to set altitude*/
	TextField txtAttitude = null;
	
	/**Set command to apply the changes on location settings*/
	Command okCommand = new Command("Set", Command.OK, 1);
	
	/**Cancel command to revert back the location settings*/
	Command cancelCommand = new Command("Cancel", Command.CANCEL, 2);
	
	/**
	 * Constructor to initialize the location setting form
	 * @param title Location setting form title
	 * @param midlet Audio3DMIDlet midlet reference
	 */
	public LocationForm(String title,Audio3DMIDlet midlet) {
		super(title);
		
		this.midlet = midlet;
		displayLocationSettingForm(midlet);
		
	}

	/**
	 * Displays location setting form
	 * Both value Scale and Altitude will be in meter.
	 * @param midlet Audio3DMIDlet reference
	 */
	private void displayLocationSettingForm(Audio3DMIDlet midlet) {
		int scale = midlet.locAttr.getLocScale();
		int attitude = midlet.locAttr.getLocAltitude();
		
		txtScale = new TextField("Scale (in meter)",""+scale,7,TextField.NUMERIC);
		txtAttitude = new TextField("Altitude (in meter)",""+attitude,7,TextField.NUMERIC);
		append(txtScale);
		append(txtAttitude);
		addCommand(okCommand);
		addCommand(cancelCommand);
		setCommandListener(this);
	}

	/**
	 * Handles Location settings related commands
	 */
	public void commandAction(Command c, Displayable d) {
		if (c == okCommand){
			midlet.locAttr.setLocAltitude(Integer.parseInt(txtAttitude.getString().trim()));
			midlet.locAttr.setLocScale(Integer.parseInt(txtScale.getString().trim()));
			
			// Put some negative value to avoid the effect of key navigation
			midlet.audio3DCanvas.changeSourceLocation(-200, midlet);
		} 
		midlet.display.setCurrent(midlet.audio3DCanvas);
	}

	
}
