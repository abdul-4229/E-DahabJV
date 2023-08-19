import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class KudarliiskagudahaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KudarliiskagudahaFrame frame = new KudarliiskagudahaFrame();
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
	public KudarliiskagudahaFrame() {
		setTitle("Services");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("1. Ku dar Liiska  Gudaha.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(92, 65, 181, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFadlanDooro = new JLabel("Fadlan Dooro:");
		lblFadlanDooro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFadlanDooro.setBounds(92, 27, 260, 21);
		contentPane.add(lblFadlanDooro);
		
		JLabel lblNewLabel_2 = new JLabel("2.I tus Liiska Magacyada.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(92, 89, 168, 21);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(134, 138, 154, 33);
		contentPane.add(textField);
		
		JButton btnCencel = new JButton("Cencel");
		btnCencel.setBounds(128, 192, 79, 30);
		contentPane.add(btnCencel);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setBounds(218, 192, 84, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("2. Tirtir Macaamiil");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(92, 109, 168, 21);
		contentPane.add(lblNewLabel_2_1);
	}

}
