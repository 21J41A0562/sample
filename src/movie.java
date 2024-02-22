import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movie {

	private JFrame frame;
	private JTextField tb;
	protected JComboBox cb1;
	protected JComboBox cb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie window = new movie();
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
	public movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(54, 70, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE");
		lblNewLabel_1.setBounds(54, 123, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NUMBER");
		lblNewLabel_2.setBounds(54, 177, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		tb = new JTextField();
		tb.setBounds(176, 67, 86, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Movie Ticket Booking");
		lblNewLabel_3.setBounds(176, 11, 106, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "KGF", "SALAAR"}));
		cb1.setBounds(173, 119, 89, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3"}));
		cb2.setBounds(173, 173, 89, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String sm=(String) cb1.getSelectedItem();
				String nt=(String) cb2.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;

				if(sm.equals("KGF"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movie:"+sm+
							"\n Ticket:"+t+
							"\n Your Bill:"+bill);
				}
				else if(sm.equals("SALAAR"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movie:"+sm+
							"\n Ticket:"+t+
							"\n Your Bill:"+bill);
				}
					
				
				
				
			}
		});
		btnNewButton.setBounds(173, 205, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	
	}

}
