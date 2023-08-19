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

public class LiiskaMagacyadaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LiiskaMagacyadaFrame frame = new LiiskaMagacyadaFrame();
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
	public LiiskaMagacyadaFrame() {
		setTitle("Liiska Magacyada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFadlanDooro = new JLabel("Fadlan Dooro:");
		lblFadlanDooro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFadlanDooro.setBounds(87, 26, 260, 21);
		contentPane.add(lblFadlanDooro);
		
		JLabel lblNewLabel_1 = new JLabel("1. Liiska Magacyada Gudaha.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(87, 64, 181, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2.Liiska Magacyada Dibada");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(87, 88, 168, 21);
		contentPane.add(lblNewLabel_2);
		
		input = new JTextField();
		input.setColumns(10);
		input.setBounds(129, 137, 154, 33);
		contentPane.add(input);
		
		JButton btnCencel = new JButton("Cencel");
		btnCencel.setBounds(123, 191, 79, 30);
		contentPane.add(btnCencel);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LiiskaMagacyadaFrame frame = new LiiskaMagacyadaFrame();
				int userinput = Integer.parseInt(input.getText());
				switch(userinput) {
				case 1:
					  frame.dispose();
					  KudarliiskagudahaFrame add = new KudarliiskagudahaFrame();
					  add.setVisible(true);
					break;
					default:
						JOptionPane.showMessageDialog(null, "Invalid");
					break;
				}
			}
		});
		btnNewButton.setBounds(213, 191, 84, 30);
		contentPane.add(btnNewButton);
	}

}
