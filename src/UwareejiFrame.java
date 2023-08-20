import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UwareejiFrame extends JFrame {

	private JPanel contentPane;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UwareejiFrame frame = new UwareejiFrame();
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
	public UwareejiFrame() {
		setTitle("U wareeji");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fadlan Dooro:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(159, 11, 172, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. U wareeji Mobile.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(143, 43, 145, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2. Lacag Dir Dibada");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(143, 67, 145, 21);
		contentPane.add(lblNewLabel_2);
		
		input = new JTextField();
		input.setColumns(10);
		input.setBounds(143, 158, 172, 36);
		contentPane.add(input);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UwareejiFrame frame = new UwareejiFrame();
				int userinput = Integer.parseInt(input.getText());
				switch (userinput) {
				case 0:
					frame.dispose();
					MenueFrame1 menue = new MenueFrame1();
					menue.setVisible(true);
					
					break;
				case 1:
					frame.dispose();
					LambarkaFrame geli = new LambarkaFrame();
					  geli.setVisible(true);
					break;
				case 2:
					System.out.println("Case 2");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid");
				break;
				}
			}
		});
		btnSend.setBounds(247, 205, 67, 32);
		contentPane.add(btnSend);
		
		JLabel lblNewLabel_2_1 = new JLabel("Press 0 for main menu and * for previous menu");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(92, 126, 301, 21);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(143, 205, 95, 32);
		contentPane.add(btnCancel);
	}

}
