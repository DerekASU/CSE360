package src.HCP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HCPHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HCPHome frame = new HCPHome();
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
	public HCPHome() {
		setTitle("Health Care Provider Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddPatient = new JButton("Add Patient");
		btnAddPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPatient addPatient = new  AddPatient();
				addPatient.setVisible(true);
			}
		});
		btnAddPatient.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddPatient.setBounds(177, 110, 320, 50);
		contentPane.add(btnAddPatient);
		
		JButton btnPatientForms = new JButton("Patient Forms");
		btnPatientForms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientForms patientForms = new PatientForms();
				patientForms.setVisible(true);
			}
		});
		btnPatientForms.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPatientForms.setBounds(177, 204, 320, 50);
		contentPane.add(btnPatientForms);
		
		JButton btnDeletePatient = new JButton("Delete Patient");
		btnDeletePatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeletePatient deletePatient = new DeletePatient();
				deletePatient.setVisible(true);
			}
		});
		btnDeletePatient.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDeletePatient.setBounds(177, 295, 320, 50);
		contentPane.add(btnDeletePatient);
		
		JButton button = new JButton("EXIT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(177, 379, 320, 50);
		contentPane.add(button);
	}

}
