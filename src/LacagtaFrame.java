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

public class LacagtaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LacagtaFrame frame = new LacagtaFrame();
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
	public LacagtaFrame() {
		setTitle("Geli Lacagta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFadlanGeliTa = new JLabel("Fadlan Geli ta aad rabto in aad dirto");
		lblFadlanGeliTa.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblFadlanGeliTa.setBounds(76, 36, 275, 21);
		contentPane.add(lblFadlanGeliTa);
		
		JLabel lblNewLabel_2_1 = new JLabel("Press 0 for main menu and * for previous menu");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(76, 100, 301, 21);
		contentPane.add(lblNewLabel_2_1);
		
		input = new JTextField();
		input.setColumns(10);
		input.setBounds(127, 132, 172, 36);
		contentPane.add(input);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(127, 179, 95, 32);
		contentPane.add(btnCancel);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LacagtaFrame frame = new LacagtaFrame();
				int userinput = Integer.parseInt(input.getText());
				switch(userinput) {
			case 0:
				frame.dispose();
				LambarkaFrame menue = new LambarkaFrame();
				menue.setVisible(true);
				
				break;
			case 20:
				frame.dispose();
				LambarkaFrame menu = new LambarkaFrame();
				menu.setVisible(true);
				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid");
			break;
			}
			}
		});
		btnSend.setBounds(231, 179, 67, 32);
		contentPane.add(btnSend);
	}

}
