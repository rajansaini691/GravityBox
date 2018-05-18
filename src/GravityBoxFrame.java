import javax.swing.JFrame;

public class GravityBoxFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame j1 = new JFrame();
		j1.setSize(800, 600);
		j1.setLocationRelativeTo(null);
		j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE);
		j1.setTitle("Gravity box!");
		j1.add(new GravityBoxComp());

		j1.setVisible(true);

	}

}
