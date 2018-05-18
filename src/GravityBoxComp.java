import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyListener;

public class GravityBoxComp extends GameDriverV3 {

	//Declares objects up here
	Box b1 = new Box();
	Rectangle background = new Rectangle(800, 600);
	Color c1 = new Color(255, 255, 255);
	Box[] boxes = new Box[200];
	
	//The constructor gives the declared objects an initial state, and it also adds a KeyListener to it
	public GravityBoxComp() {
		for(int i = 0; i < boxes.length; i++) {
			boxes[i] = new Box();
		}
		
		for(int i = 0; i < boxes.length; i++) {
			this.addKeyListener(boxes[i]);
			this.addKeyListener(b1);
		}
	}
	
	//Draws the above objects dynamically, frame by frame
	@Override
	public void draw(Graphics2D win) {
		win.setColor(c1);
		win.fill(background);
		b1.moveAndDraw(win);
		
		for(int i = 0; i < boxes.length; i++) {
			boxes[i].moveAndDraw(win);
		}
		
	}
	
}
