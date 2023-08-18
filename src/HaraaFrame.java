import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HaraaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField pintxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HaraaFrame frame = new HaraaFrame();
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
	public HaraaFrame() {
		setTitle("Haraaga");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel haraalb = new JLabel("Fadlan Geli pinkaaga si aad u xaqiijiso");
		haraalb.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		haraalb.setBounds(66, 72, 358, 24);
		contentPane.add(haraalb);
		
		JButton sendbtn2 = new JButton("OK");
		sendbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int userpin = Integer.parseInt(pintxt.getText());
				main main = new main();
				if (userpin == main.pin) {
					JOptionPane.showMessageDialog(null, "Haraagau waa $" + main.balance);
				}else {
					JOptionPane.showMessageDialog(null, "Wrong pin");
				}
				
				
				
				
			}
		});
		sendbtn2.setBounds(177, 193, 89, 23);
		contentPane.add(sendbtn2);
		
		JLabel lblNewLabel = new JLabel("[eDahab Service]");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(166, 35, 135, 14);
		contentPane.add(lblNewLabel);
		
		JLabel haralb = new JLabel("Haraagaga...");
		haralb.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		haralb.setBounds(166, 99, 129, 24);
		contentPane.add(haralb);
		
		pintxt = new JTextField();
		pintxt.setBounds(138, 150, 164, 20);
		contentPane.add(pintxt);
		pintxt.setColumns(10);
	}

}
