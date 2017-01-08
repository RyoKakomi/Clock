import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Clock extends JFrame {

	private JPanel contentPane;
	private JLabel lblTime;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
			Clock frame = new Clock();
			frame.setVisible(true);
			
			GetTime getTime = new GetTime();
			Thread thread = new Thread(getTime);
			thread.start();
			while(true){
				frame.lblTime.setText(GetTime.time);
				Thread.sleep(1000);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Create the frame.
	 */
	public Clock() {
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 109);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTime = new JLabel("ZZ:ZZ:ZZ");
		lblTime.setForeground(Color.CYAN);
		lblTime.setFont(new Font("Bauhaus 93", Font.PLAIN, 51));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBounds(6, 19, 215, 62);
		contentPane.add(lblTime);
	}
}
