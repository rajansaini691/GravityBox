import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Box extends Rectangle implements KeyListener {
	
	double gravity = 0.5;
	double dx = 0, dy = 0;
	Random r1 = new Random();
	boolean isPressed = false;
	double elasticity = 0.8;
	
	Color c1 = new Color(r1.nextInt(256), r1.nextInt(256), r1.nextInt(256));
	
	public Box() {
		this.setSize(100, 100);
		this.setLocation(r1.nextInt(784) - this.width, r1.nextInt(760) - this.height - 200);
	}
	
	public void moveAndDraw(Graphics2D win) {
		win.setColor(c1);
		if(isPressed) {
			dy += gravity;
			if(this.getY() < 561 - this.height - dy) {
				this.translate((int) dx, (int) dy);
			} else if(this.getY() >= 561 - this.height - dy){
				dy = 0 - dy;
				dy *= elasticity;
				this.translate((int) dx, (int) dy);
			}
		}
		
		win.fill(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		this.isPressed = true;
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
