package finalProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

/**
 * Final Project
 * 
 * @author Kevin
 *
 */
public class FinalProjectGUI extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
	Date date = new Date(System.currentTimeMillis());
	Timer timer = new Timer(1000 ,this);
	JLabel time = new JLabel("Time: " + formatter.format(date));


	/**
	 * Create the frame.
	 */
	public FinalProjectGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		contentPane.setBackground(Color.DARK_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		// Calls whiteScreen method
		whiteScreen();
	}
	

	/**
	 * Create the background
	 */
	private void whiteScreen() {
		{
			Layout panel = new Layout();
			panel.setBackground(Color.WHITE);
			// Adjust the size of the background
			panel.setPreferredSize(new Dimension(694, 324));
			// Apply the red border
			panel.setBorder(new LineBorder(Color.RED));
			contentPane.add(panel);
				// Calls the method
				visibilityButton(panel);
				dotMoving(panel);
		}
	}
	/**
	 * Create a real-time dynamic clock
	 * 
	 * @param panel
	 */
	private void Time(Layout panel) {
		time.setForeground(Color.white);
		timer.start();
		
		time.setText("Time: " + formatter.format(date));
		contentPane.add(time);
	}
	
	/**
	 * Creates the Visibility button
	 */
	private void visibilityButton(Layout panel) {
		// Creates the button called VISIBILITY
		JButton VISIBILITY = new JButton("VISIBILITY");
		VISIBILITY.setBackground(Color.LIGHT_GRAY);
		VISIBILITY.addActionListener(new ActionListener() {
			// When when click, it would either turn on or off
			public void actionPerformed(ActionEvent e) {
				panel.invs();
			}
		});
		{
			Time(panel);
		}
		// Set how big the button VISIBILITY is on GUI
		VISIBILITY.setBorder(new LineBorder(Color.green));
		VISIBILITY.setPreferredSize(new Dimension(200, 70));
		// Add the button VISIBILITY on GUI
		contentPane.add(VISIBILITY);
	}

	/**
	 * Display another location for the dot
	 * 
	 * @param label
	 */
	private void dotMoving(Layout panel) {
		// Creates the button called Lat/Long
		JButton Coord = new JButton("Display Longitude and Latitude");
		Coord.setBackground(Color.LIGHT_GRAY);
		Coord.addActionListener(new ActionListener() {
		JLabel lblLatitudeLongitude = new JLabel("<html>Latitude: <br/>Longitude: </html>");
			public void actionPerformed(ActionEvent e) {
				int x = panel.getCoordx();
				int y = panel.getCoordy();
				lblLatitudeLongitude.setText("<html>Latitude: " + x + "<br/>Longitude: " + y + " </html>");
				lblLatitudeLongitude.setForeground(Color.white);
				contentPane.add(lblLatitudeLongitude);
			}
		});
		Coord.setBorder(new LineBorder(Color.green));
		Coord.setPreferredSize(new Dimension(200,70));
		contentPane.add(Coord);
	}


	@Override
	/**
	 * Loops through every second
	 */
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource()==timer) {
			String date = new java.text.SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z").format(new java.util.Date(System.currentTimeMillis()));
			time.setText("Time: " +(date));
		}
	}
}
