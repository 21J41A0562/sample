import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class FRND {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRND window = new FRND();
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
	public FRND() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOKMY SHOW");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setBounds(142, 11, 163, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_1.setBounds(34, 60, 96, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"select", "JK", "KJ", "KGF", "RRR", "GVAN"}));
		C1.setBounds(142, 108, 117, 22);
		frame.getContentPane().add(C1);
		
		JComboBox C2 = new JComboBox();
		C2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4"}));
		C2.setBounds(142, 161, 117, 22);
		frame.getContentPane().add(C2);
		frame.setForeground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 425, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2.setBounds(34, 109, 119, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setForeground(new Color(255, 128, 0));
		lblNewLabel_3.setBounds(37, 162, 93, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel tb = new JPanel();
		tb.setBounds(152, 60, 107, 28);
		frame.getContentPane().add(tb);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			private JComboBox cb2;

			public void actionPerformed(ActionEvent e) {
				String n= tb.getText();
				String sm=(String) C1.getSelectedItem();
				String nt=(String) C2.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(sm.equals("JK"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movie:"+sm+
							"\n Tickets:"+t+
							"\n Your Bill:"+bill);
					
				}
				if(sm.equals("KJ"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movie:"+sm+
							"\n Tickets:"+t+
							"\n Your Bill:"+bill);
					
					
				}
				if(sm.equals("KGF"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movie:"+sm+
							"\n Tickets:"+t+
							"\n Your Bill:"+bill);
					
					
				}
				if(sm.equals("RRR"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movie:"+sm+
							"\n Tickets:"+t+
							"\n Your Bill:"+bill);
					
					
				}
				if(sm.equals("JVAN"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movie:"+sm+
							"\n Tickets:"+t+
							"\n Your Bill:"+bill);
					
					
				}
				
				
							}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(170, 276, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
