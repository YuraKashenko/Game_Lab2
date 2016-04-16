import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

public class Game_Lab_2 extends GraphicsProgram {

	public static final int WINDOW_WIDTH = 700;
	public static final int WINDOW_HEIGHT = 500;

	/** Size and speed of racket */
	private static final int RACKET_SPEED = 7;

	/** Animation cycle delay */
	private static final int DELAY = 10;

	/** instance variables */
	private GImage racket;

	public void run() {
		addKeyListeners();
		setup();
		pause(DELAY);

	}
	/** set game objects */
	private void setup() {
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		racketCreate();
	}
	
	private GImage racketCreate() {
		racket = new GImage("racket.GIF");
		racket.scale(1, 0.7);
		add(racket, WINDOW_WIDTH / 2 - racket.getWidth() / 2, WINDOW_HEIGHT - racket.getHeight() - 10);
		return racket;
	}

	
	/** Press "left button" to move racket left, "right" - to right */
	public void keyPressed(KeyEvent e) {
		// System.out.println(e.getKeyCode());
		if (e.getKeyCode() == 37) {
			moveRacketLeft();
		} else if (e.getKeyCode() == 39) {
			moveRacketRight();
		}
	}

	
	private void moveRacketLeft() {
		if (racket.getX() > 0+RACKET_SPEED) {
			racket.move(-RACKET_SPEED, 0);
		}
	}

	private void moveRacketRight() {
		if (racket.getX() < WINDOW_WIDTH - racket.getWidth()-RACKET_SPEED) {
			racket.move(RACKET_SPEED, 0);
		}

	}

}
