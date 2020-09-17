package finalProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static StartMenu frame = new StartMenu();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.DARK_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton Start = new JButton("START");
		Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FinalProjectGUI frame1 = new FinalProjectGUI();
				frame1.setVisible(true);
				frame.dispose();
			}
		});
		Start.setBackground(Color.LIGHT_GRAY);
		Start.setBorder(new LineBorder(Color.green));
		//Start.setPreferredSize(new Dimension(100,150));
		Start.setPreferredSize(new Dimension(1,40));
		contentPane.add(Start, BorderLayout.SOUTH);
		
		// Sets the image on the start menu
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(StartMenu.class.getResource("/finalProject/GPS.png")));
		contentPane.add(label, BorderLayout.CENTER);
	}

}
