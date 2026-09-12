package com.nokia.midp.example.jsr234.audio3d;

import java.io.InputStream;

import javax.microedition.amms.GlobalManager;
import javax.microedition.amms.SoundSource3D;
import javax.microedition.amms.Spectator;
import javax.microedition.amms.control.audio3d.DistanceAttenuationControl;
import javax.microedition.amms.control.audio3d.LocationControl;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

/**
 * MIDlet class is responsible to handle Audio 3D effect with respect to the Sound Source and
 * Observer. It initializes the Audio 3D sound source and spectator. 
 * <br>Example gives following aspects:
 * <br><br>
 * 
 * <ol>
 * 1. LocationControl: It controls the virtual location of an object in the virtual sound space.<br>
 * 2. DistanceAttenuationControl: It controlls the sound from a sound source is attenuated with its distance from the Observer.<br>
 * </ol>
 * <br>
 * Class performs following functionalities:<br>
 * - Initializing Canvas and other required controls<br>
 * - Initialize Sound Source<br>
 * - initialize spectator<br>
 * - Create Player to play Audio3D<br>
 * <br>
 * 
 * <b> Pre-requisites</b><br>
 * - Enable the sound to feel the sound effect
 * 
 * <b>Note: </b> This Example application is only reference implementation for JSR 234 - Advanced Multimedia Supplements.
 * Go through the JSR234 Specification to get more idea about Advanced Multimedia Supplements APIs
 * @author gothadiy
 *
 */
public class Audio3DMIDlet extends MIDlet implements CommandListener {

	/**Title of midlet start form*/
	private static final String START_FORM_TITLE = "AMMS Audio 3D";

	/**Message to display on start midlet form*/
	private static final String START_MESSAGE = "Please hit Start to observer Audio 3D effect!!";

	/**Audio wav content type*/
	private static final String CONTENT_TYPE = "audio/x-wav";

	/**Distance Attenuation control property*/
	private static final String DISTANCE_ATTENUATION_CONTROL = "javax.microedition.amms.control.audio3d.DistanceAttenuationControl";

	/**Location Control property*/
	private static final String LOCATION_CONTROL = "javax.microedition.amms.control.audio3d.LocationControl";

	/**Audio Sound source file path*/
	private static final String AUDIO3D_SOUND = "/com/nokia/midp/example/jsr234/audio3d/res/music2.wav";

	/**Constant to set the UI move per screen*/
	public static final int MOVE_PER_SCREEN = 5;

	/**Max X and Y values*/
	public static final int MAX_VALUES = MOVE_PER_SCREEN * 5;

	/**Display instance*/
	Display display;

	/**Start command to start the Audio3D stuff*/
	Command startCommand = new Command("Start", Command.OK, 1);

	/**Exit command to exit from the application*/
	Command exitCommand = new Command("Exit", Command.EXIT, 2);

	/**Location Settings command*/
	Command locationCommand = new Command("Location Settings", Command.SCREEN,
			3);
	
	Command distAttenuationCommand = new Command("Distance Attenuation Settings",Command.SCREEN,4);

	/** Source location control */
	LocationControl sourceLC;

	/** Spectator location control */
	LocationControl specLC;

	/**Distance Attenuation Control*/
	DistanceAttenuationControl ctlDistAtt;

	/**Player for sound source*/
	Player player;

	/**Instance of sound source 3D*/
	SoundSource3D sound3D;

	/**Instance of InputStream*/
	InputStream inStream;

	/**UI canvas*/
	Audio3DCanvas audio3DCanvas;

	/**Location Attributes*/
	LocationAttributes locAttr;

	DistAttenuationAttributes distAttnAttr;
	
	/**Instance of form to display start form*/
	Form startForm;

	/**Instance of location settings form*/
	LocationForm locationForm = null;

	DistAttenuationForm distAttForm = null;
	
	/**MIDlet constructor*/
	public Audio3DMIDlet() {
		display = Display.getDisplay(this);
	}

	/**Audio 3D MIDlet start form*/
	private void startAudio3DForm() {
		startForm = new Form(START_FORM_TITLE);
		startForm.append(START_MESSAGE);
		startForm.addCommand(startCommand);
		startForm.addCommand(exitCommand);
		startForm.setCommandListener(this);
		display.setCurrent(startForm);
	}

	/**It initializes all controls and UI components.*/
	void init() {

		audio3DCanvas = new Audio3DCanvas(MAX_VALUES, this);
		audio3DCanvas.addCommand(locationCommand);
		audio3DCanvas.addCommand(distAttenuationCommand);
		audio3DCanvas.addCommand(exitCommand);
		audio3DCanvas.setCommandListener(this);
		display.setCurrent(audio3DCanvas);

		locAttr = new LocationAttributes(1200, 1000);
		distAttnAttr = new DistAttenuationAttributes(1000,1000,0,false);
		
		initControls();

	}

	/**Displays application startup form*/
	public void startApp() throws MIDletStateChangeException {
		startAudio3DForm();
	}

	public void pauseApp() {
	}

	/**Stop the player*/
	public void destroyApp(boolean unconditional) {
		try {
			player.stop();
			player = null;
			sound3D = null;
		} catch (MediaException e) {
			e.printStackTrace();
		}
	}

	/**Initializes Location and  Distance Attenuation controls. It also starts the player
	 * It performs following steps:
	 * - Create player, loop it and play the content indefinitely
	 * - Create SoundSource 3D control and assign it to location control for Sound source
	 * - Create Spectator and assign it to spectator location control
	 * - Create distance attenuation control
	 * */
	void initControls() {
		try {
			inStream = getClass().getResourceAsStream(AUDIO3D_SOUND);

			// Create player
			player = Manager.createPlayer(inStream, CONTENT_TYPE);

			// It will loop and play the content indefinitely
			player.setLoopCount(-1);
			player.realize();

			// Create SoundSource 3D control and assign it to location control
			// for Sound source
			sound3D = GlobalManager.createSoundSource3D();
			sourceLC = (LocationControl) sound3D.getControl(LOCATION_CONTROL);
			sound3D.addPlayer(player);

			// Create Spectator and assign it to spectator location control
			Spectator spectator = GlobalManager.getSpectator();
			specLC = (LocationControl) spectator.getControl(LOCATION_CONTROL);

			// Create distance attenuation control
			ctlDistAtt = (DistanceAttenuationControl) sound3D
					.getControl(DISTANCE_ATTENUATION_CONTROL);

			player.prefetch();
			player.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Handles control commands<br>
	 * - locationCommand: Provide location settings form
	 * - distAttenuationCommand: Provide distance attenuation settings form
	 **/
	public void commandAction(Command c, Displayable d) {
		// Handle commands for distance att.
		if (c == startCommand) {
			init();
		} else if (c == exitCommand) {
			destroyApp(true);
			notifyDestroyed();
		} else if (c == locationCommand) {
			if (locationForm == null) {
				locationForm = new LocationForm("Location Settings", this);
			}
			display.setCurrent(locationForm);
		} else if (c == distAttenuationCommand){
            if(distAttForm == null){
                distAttForm = new DistAttenuationForm("Distance " +
                        "Attenuation Settings",this);
            }
            display.setCurrent(distAttForm);
		}

	}

}
