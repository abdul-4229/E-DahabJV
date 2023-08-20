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

public class MenueFrame extends JFrame {

	private JPanel contentPane;
	private JTextField select1txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenueFrame frame = new MenueFrame();
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
	public MenueFrame() {
		setTitle("E-Dahab Service");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel doorotxtlb = new JLabel("Fadlan Dooro:");
		doorotxtlb.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		doorotxtlb.setBounds(166, 41, 115, 14);
		contentPane.add(doorotxtlb);
		
		JLabel dollartxtlb = new JLabel("1. Dollar");
		dollartxtlb.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		dollartxtlb.setBounds(114, 82, 141, 14);
		contentPane.add(dollartxtlb);
		
		JLabel shillingtxtlb = new JLabel("2.  Shilling");
		shillingtxtlb.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		shillingtxtlb.setBounds(114, 122, 101, 19);
		contentPane.add(shillingtxtlb);
		
		select1txt = new JTextField();
		select1txt.setBounds(173, 152, 141, 25);
		contentPane.add(select1txt);
		select1txt.setColumns(10);
		
		JButton btn3 = new JButton("SEND");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MenueFrame frame = new MenueFrame(); 
				MenueFrame1 menu = new MenueFrame1();
				int selectinput = Integer.parseInt(select1txt.getText());
				switch (selectinput) {
				case 1:
					frame.dispose();
					menu.setVisible(true);
					break;
				case 2:
					frame.dispose();
					menu.setVisible(true);
					break;
					default:
						JOptionPane.showMessageDialog(null, "Invalid");
					break;
				}
			}
		});
		btn3.setBounds(207, 188, 74, 34);
		contentPane.add(btn3);
	}
}
