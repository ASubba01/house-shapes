package house;

import javax.swing.JFrame;

public class ShapeTester {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Drawing House");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Shape shape = new Shape();
		frame.add(shape);
		
		frame.setSize(800,550);
		frame.setLocation(200,100);
		frame.setVisible(true);
		
	}

}

