package src.patient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientHome frame = new PatientHome();
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
	public PatientHome() {
		setTitle("Patient Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New Form");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewForm newForm = new NewForm();
				newForm.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(192, 33, 320, 50);
		contentPane.add(btnNewButton);
		
		JButton btnPreviousForms = new JButton("Previous Forms\r\n");
		btnPreviousForms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreviousForms prevForm = new PreviousForms();
				prevForm.setVisible(true);
			}
		});
		btnPreviousForms.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPreviousForms.setBounds(192, 135, 320, 50);
		contentPane.add(btnPreviousForms);
		
		JButton btnAddHealthCare = new JButton("Add Health Care Provider");
		btnAddHealthCare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddHCP addHCP = new AddHCP();
				addHCP.setVisible(true);
			}
		});
		btnAddHealthCare.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddHealthCare.setBounds(192, 229, 320, 50);
		contentPane.add(btnAddHealthCare);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(192, 324, 320, 50);
		contentPane.add(btnExit);
	}
}
