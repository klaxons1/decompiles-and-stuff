package com.nokia.midp.example.jsr234.audio3d;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
/**
 * Canvas class to display User Interface with the sound Source movement. 
 * UI gives facility to move sound source 3D to see the sound effect using UP,DOWN.LEFT and RIGHT keys.
 * 
 * @author gothadiy
 *
 */
public class Audio3DCanvas extends Canvas {

	public static int MAX_X;
	public static int MAX_Y;

	/**Instance of Coordinates class*/
	Coordinates coordinates;

	/**Audio3DMIDlet instance for display reference*/
	Audio3DMIDlet midlet;

	/**
	 * Constructor to initialize all required coordinates
	 * @param maxValues for movement
	 * @param midlet Audio3DMIDlet instance
	 */
	public Audio3DCanvas(int maxValues, Audio3DMIDlet midlet) {
		setTitle("AMMS Audio 3D");
		MAX_X = maxValues - 1;
		MAX_Y = (maxValues * getHeight()) / getWidth() - 1;

		coordinates = new Coordinates(MAX_X, MAX_Y);

		this.midlet = midlet;
	}

	/**
	 * Method changes the location of sound source based on the key press.
	 * It also change the effect of LocationControl and DistanceAttenuationControl.
	 * @param key keyCode from the keyPress method
	 * @param controller Audio3DMIDlet instance
	 */
	public void changeSourceLocation(int key, Audio3DMIDlet controller) {

		// Handle Sound source navigation
		switch (key) {
		case UP:
			coordinates.sourceY--;
			if (coordinates.sourceY < 0) {
				coordinates.sourceY = 0;
			}
			break;

		case LEFT:
			coordinates.sourceX--;
			if (coordinates.sourceX < 0) {
				coordinates.sourceX = 0;
			}
			break;

		case DOWN:
			coordinates.sourceY++;
			if (coordinates.sourceY >= MAX_Y) {
				coordinates.sourceY = MAX_Y;
			}
			break;

		case RIGHT:
			coordinates.sourceX++;
			if (coordinates.sourceX >= MAX_X) {
				coordinates.sourceX = MAX_X;
			}
			break;
		}

		repaint();

		// Set Control values
		setCartesians(controller);

	}
	
	/**
	 * Method sets LocationControl and DistanceAttenuationControl
	 * @param controller Audio3DMIDlet instance
	 */
	private void setCartesians(Audio3DMIDlet controller) {
		controller.sourceLC.setCartesian(this.coordinates.sourceX
				* controller.locAttr.getLocScale(), controller.locAttr
				.getLocAltitude(), this.coordinates.sourceY
				* controller.locAttr.getLocScale());

		controller.specLC.setCartesian(this.coordinates.specX
				* controller.locAttr.getLocScale(), 0, this.coordinates.specY
				* controller.locAttr.getLocScale());
		
		controller.ctlDistAtt.setParameters(midlet.ctlDistAtt.getMinDistance(),
                midlet.ctlDistAtt.getMaxDistance(),
                midlet.ctlDistAtt.getMuteAfterMax(),
                midlet.ctlDistAtt.getRolloffFactor());
		
	}

	/**
	 * Displays Audio 3D UI. It contains:<br>
	 * - Draw back ground<br>
	 * - Draw Sound source<br>
	 * - Draw Spectator<br>
	 */
	protected void paint(Graphics graphics) {
		// Draw back ground
		graphics.setColor(50, 50, 100);
		graphics.fillRect(graphics.getClipX(), graphics.getClipY(), graphics
				.getClipWidth(), graphics.getClipHeight());

		// Draw Sound source
		graphics.setColor(0, 200, 0);
		graphics.fillRect((getWidth() * coordinates.sourceX) / MAX_X,
				(getHeight() * coordinates.sourceY) / MAX_Y,
				getWidth() / MAX_X, getHeight() / MAX_Y);

		// Draw Spectator
		graphics.setColor(200, 0, 0);
		graphics.fillRect((getWidth() * coordinates.specX) / MAX_X,
				(getHeight() * coordinates.specY) / MAX_Y, getWidth() / MAX_X,
				getHeight() / MAX_Y);

	}

	/**
	 * identify key pressed and handle it
	 */
	public void keyPressed(int keyCode) {

		int key = getGameAction(keyCode);
		changeSourceLocation(key, midlet);

	}

}
