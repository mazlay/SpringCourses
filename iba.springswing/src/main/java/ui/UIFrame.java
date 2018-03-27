package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;

import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class UIFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	@PostConstruct
	public void init() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(new Dimension(600, 600));
		setVisible(true);
		setState(Frame.NORMAL);
		getContentPane().setBackground(Color.RED);
		show();
	}
}
