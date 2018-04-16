package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldProdajni;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceniNaziv;
	private JTextField textFieldKupovni;
	private JTextField textFieldNaziv;
	private MenjacnicaGUI m;
	/**
	 * Create the frame.
	 */
	public DodajKursGUI() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 343, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSifra = new JLabel("Sifra");
		lblSifra.setBounds(10, 21, 46, 14);
		contentPane.add(lblSifra);
		
		textFieldSifra = new JTextField();
		textFieldSifra.setBounds(10, 46, 142, 20);
		contentPane.add(textFieldSifra);
		textFieldSifra.setColumns(10);
		
		JLabel lblProdajni = new JLabel("Prodajni kurs");
		lblProdajni.setBounds(10, 77, 85, 14);
		contentPane.add(lblProdajni);
		
		textFieldProdajni = new JTextField();
		textFieldProdajni.setBounds(10, 102, 142, 20);
		contentPane.add(textFieldProdajni);
		textFieldProdajni.setColumns(10);
		
		JLabel lblSrednji = new JLabel("Srednji kurs");
		lblSrednji.setBounds(10, 133, 71, 14);
		contentPane.add(lblSrednji);
		
		textFieldSrednji = new JTextField();
		textFieldSrednji.setBounds(10, 160, 142, 20);
		contentPane.add(textFieldSrednji);
		textFieldSrednji.setColumns(10);
		
		textFieldSkraceniNaziv = new JTextField();
		textFieldSkraceniNaziv.setBounds(181, 160, 142, 20);
		contentPane.add(textFieldSkraceniNaziv);
		textFieldSkraceniNaziv.setColumns(10);
		
		textFieldKupovni = new JTextField();
		textFieldKupovni.setBounds(181, 102, 142, 20);
		contentPane.add(textFieldKupovni);
		textFieldKupovni.setColumns(10);
		
		textFieldNaziv = new JTextField();
		textFieldNaziv.setBounds(181, 46, 142, 20);
		contentPane.add(textFieldNaziv);
		textFieldNaziv.setColumns(10);
		
		JLabel lblNaziv = new JLabel("Naziv");
		lblNaziv.setBounds(181, 21, 46, 14);
		contentPane.add(lblNaziv);
		
		JLabel lblKupovni = new JLabel("Kupovni kurs");
		lblKupovni.setBounds(181, 77, 85, 14);
		contentPane.add(lblKupovni);
		
		JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
		lblSkraceniNaziv.setBounds(181, 133, 85, 14);
		contentPane.add(lblSkraceniNaziv);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s= "Sifra: "+textFieldSifra.getText()+" Naziv: "+textFieldNaziv.getText()+" Skraceni naziv: "+textFieldSkraceniNaziv.getText()+" Prodajni kurs: "+textFieldProdajni.getText()+" Kupovni kurs: "+textFieldKupovni.getText()+" Srednji kurs: "+textFieldSrednji.getText();
				dispose();
			}
		});
		btnDodaj.setBounds(10, 191, 142, 23);
		contentPane.add(btnDodaj);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnOdustani.setBounds(181, 191, 142, 23);
		contentPane.add(btnOdustani);
	}
	
}
