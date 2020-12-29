import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class proton {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proton window = new proton();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public proton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 929, 603);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(proton.class.getResource("/protonimg/newproton.jpg")));
		lblNewLabel.setBounds(335, 0, 532, 162);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel x70pic = new JLabel("");
		x70pic.setIcon(new ImageIcon(proton.class.getResource("/protonimg/img-Proton-X70-CKD-1.png")));
		x70pic.setBounds(34, 117, 286, 162);
		frame.getContentPane().add(x70pic);
		
		JLabel x50pic = new JLabel("");
		x50pic.setIcon(new ImageIcon(proton.class.getResource("/protonimg/proton x50 1.jpg")));
		x50pic.setBounds(44, 257, 314, 190);
		frame.getContentPane().add(x50pic);
		
		JLabel personapic = new JLabel("");
		personapic.setIcon(new ImageIcon(proton.class.getResource("/protonimg/pesona.png")));
		personapic.setBounds(484, 117, 221, 162);
		frame.getContentPane().add(personapic);
		
		JLabel personapic_1 = new JLabel("");
		personapic_1.setIcon(new ImageIcon(proton.class.getResource("/protonimg/img-Proton-Saga-New.png")));
		personapic_1.setBounds(470, 257, 221, 162);
		frame.getContentPane().add(personapic_1);
		
		JButton x70 = new JButton("Proton X70");
		x70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String model;

				model=("You have Choosen: Proton X70");
				box_answer.setText(model);



				txtrDisplay.setText("Proton X70:"	+ "\n\nPrice is: RM4,000.00"
								+ "\n\nBasic Salary minimum RM4,000.00"
								+ "\n\nMonthly installment: RM 950"
								+ "\n\nSPECIFICATIONS"
								+ "\nFuel Tank Capacity : 60 L"
								+ "\n\nSafety Features: \t\r\n1.Front SRS Airbags \n2.Anti-Lock Braking System (ABS) \n3.Electronic Brake Distribution (EBD)"
								+ "\n\nAuto Driving and Parking feature available"
								+ "\n\nColour available: Red, White, Blue, Silver, Yellow");







			}
			
		});
		x70.setFont(new Font("Tahoma", Font.BOLD, 16));
		x70.setBounds(260, 188, 171, 21);
		frame.getContentPane().add(x70);
		
		JButton x50 = new JButton("Proton X50");
		x50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String model;

				model=("You have Choosen: Proton X50");
				box_answer.setText(model);



				txtrDisplay.setText("Proton X50:"	+ "\n\nPrice is: RM80,000.00"
								+ "\n\nBasic Salary minimum RM3,500.00"
								+ "\n\nMonthly installment: RM 800"
								+ "\n\nSPECIFICATIONS"
								+ "\nFuel Tank Capacity : 55 L"
								+ "\n\nSafety Features: \t\r\n1.Front SRS Airbags \n2.Anti-Lock Braking System (ABS) \n3.Electronic Brake Distribution (EBD)"
								+ "\n\nAuto Parking feature available"
								+ "\n\nColour available: Red, White, Blue, Silver, Yellow");


			}
		});
		x50.setFont(new Font("Tahoma", Font.BOLD, 16));
		x50.setBounds(260, 319, 171, 21);
		frame.getContentPane().add(x50);
		
		JButton saga = new JButton("Proton Saga");
		saga.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String model;

				model=("You have Choosen: Proton Saga");
				box_answer.setText(model);

				txtrDisplay.setText("Proton Saga:"	+ "\n\nPrice is: RM45,000.00"
								+ "\n\nBasic Salary minimum RM2,000.00"
								+ "\n\nMonthly installment: RM 450"
								+ "\n\nSPECIFICATIONS"
								+ "\nFuel Tank Capacity : 50 L"
								+ "\n\nSafety Features: \t\r\n1.Front SRS Airbags \n2.Anti-Lock Braking System (ABS) \n3.Electronic Brake Distribution (EBD)"
								+ "\n\nBig space comfortable seat"
								+ "\n\nColour available: Red, White, Blue, Silver, Yellow");
			}
		});
		saga.setFont(new Font("Tahoma", Font.BOLD, 16));
		saga.setBounds(701, 319, 190, 21);
		frame.getContentPane().add(saga);
		
		JButton persona = new JButton("Proton Persona");
		persona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String model;

				model=("You have Choosen: Proton Persona");
				box_answer.setText(model);



				txtrDisplay.setText("Proton Persona:"	+ "\n\nPrice is: RM50,000.00"
								+ "\n\nBasic Salary minimum RM2,500.00"
								+ "\n\nMonthly installment: RM 600"
								+ "\n\nSPECIFICATIONS"
								+ "\nFuel Tank Capacity : 50 L"
								+ "\n\nSafety Features: \t\r\n1.Front SRS Airbags \n2.Anti-Lock Braking System (ABS) \n3.Electronic Brake Distribution (EBD)"
								+ "\n\nMost fuel efficient model"
								+ "\n\nColour available: Red, White, Blue, Silver, Yellow");
			}
		});
		persona.setFont(new Font("Tahoma", Font.BOLD, 16));
		persona.setBounds(699, 188, 192, 21);
		frame.getContentPane().add(persona);
		
		JTextArea box_answer = new JTextArea();
		box_answer.setBounds(301, 377, 499, 179);
		frame.getContentPane().add(box_answer);
		
		
	}
}
