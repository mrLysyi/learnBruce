package gui;

import javax.swing.*;

import java.awt.Point;
import java.util.concurrent.*;

public class HelloLabel {
	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("Hello Swing");
		JLabel label = new JLabel("A Label");
		JLabel label2 = new JLabel("A Label22");
		label2.setBounds(200, 40, 20, 20);
		Point p = new Point(200,80);
		label2.setLocation(p);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(3);
		label.setText("Hey! This is Different!");
		frame.add(label2);
	}
} // /:~