import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class MyGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblIAmA;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGui frame = new MyGui();
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
	public MyGui() {
		setTitle("Who Am I?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("My name is:");
		lblNewLabel.setBounds(72, 48, 86, 20);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("I am:");
		lblNewLabel_1.setBounds(104, 89, 44, 30);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(179, 48, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 94, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnWhoAreYou = new JButton("Who are you?");
		btnWhoAreYou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				textField.setText("Corey Lindsey");
				textField_1.setText("22");
				
				
			}
		});
		
		btnWhoAreYou.setBounds(155, 187, 117, 30);
		contentPane.add(btnWhoAreYou);
		
		lblIAmA = new JLabel("I am a Year Up student!");
		lblIAmA.setBounds(155, 146, 147, 30);
		contentPane.add(lblIAmA);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnClear.setBounds(182, 228, 71, 22);
		contentPane.add(btnClear);
	}
}
