package finalProject;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Layout extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int counter = 0;
	Timer timer = new Timer(1000 ,this);
	ImageIcon Icon5 = new ImageIcon(Layout.class.getResource("/finalProject/Images/GreenDot.PNG"));
	private String[] images = { "", "/finalProject/Images/GreenDot.PNG"};
	private String w = "/finalProject/Images/GreenDot.PNG";
	private Random x1 = new Random();
	private Random y1 = new Random();
	int x = x1.nextInt(692);
	int y = y1.nextInt(321);
	
	public Layout() {
		timer.start();
	}

	@Override
	/**
	 * Generates the layout and the dot
	 */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		ImageIcon Icon2 = new ImageIcon(Layout.class.getResource("/finalProject/Images/BlackRectangle.PNG"));
		Icon2.paintIcon(this, g, 125, 75);
		
		ImageIcon Icon3 = new ImageIcon(Layout.class.getResource("/finalProject/Images/BlackRectangle2.PNG"));
		Icon3.paintIcon(this, g, 325, 132);
		Icon3.paintIcon(this, g, 550, 132);
		
		ImageIcon Icon4 = new ImageIcon(Layout.class.getResource("/finalProject/Images/BlackRectangle3.PNG"));
		Icon4.paintIcon(this, g, 325, 45);
		Icon4.paintIcon(this, g, 560, 40);
		
		ImageIcon Icon = new ImageIcon(Layout.class.getResource(w));
		Icon.paintIcon(this, g, x, y);
	}
	/**
	 * Turns the dot invisible
	 */
	public void invs() {
		counter = ++counter % images.length;
		w = images[counter];
		repaint();
	}
	/**
	 * Set coordinate for x
	 * 
	 * @param x
	 */
	public void setCoordx(int x) {
		this.x = x;
	}
	/**
	 * Gets coordinate for x
	 * @return
	 */
	public int getCoordx()
	{
		return x;
	}
	/*
	 * Set coordinate for y
	 */
	public void setCoordy(int y)
	{
		this.y = y;
	}
	/**
	 * Gets coordinate for y
	 * @return
	 */
	public int getCoordy()
	{
		return y;
	}
	/**
	 * Loops through every second
	 */
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource()==timer) {
			x = x1.nextInt(692);
			y = y1.nextInt(321);
			setCoordx(x);
			setCoordy(y);
			repaint();
		}
	}
}
