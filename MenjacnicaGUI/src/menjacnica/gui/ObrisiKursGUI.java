package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldProdajni;
	private JTextField textFieldNaziv;
	private JTextField textFieldKupovni;
	private JTextField textFieldSkraceni;
	private JTextField textFieldSrednji;
	private MenjacnicaGUI menjacnica;

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI menjacnica) {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 338, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JButton btnObrisi = new JButton("Obrisi");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s= new String();
				 s = "Sifra: " + textFieldSifra.getText() + " Naziv: " + textFieldNaziv.getText()
						+ " Skraceni naziv: " + textFieldSkraceni.getText() + " Prodajni kurs: "
						+ textFieldProdajni.getText() + " Kupovni kurs: " + textFieldKupovni.getText()
						+ " Srednji kurs: " + textFieldSrednji.getText()+'\n';
				menjacnica.textAreaStatus.append("Obrisan je kurs: "+s);
				dispose();
			}
		});
		btnObrisi.setEnabled(false);
		btnObrisi.setBounds(10, 210, 142, 23);
		contentPane.add(btnObrisi);

		JCheckBox chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
		chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxZaistaObrisiKurs.isSelected())
					btnObrisi.setEnabled(true);;
			}
		});
		chckbxZaistaObrisiKurs.setBounds(6, 178, 146, 23);
		contentPane.add(chckbxZaistaObrisiKurs);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOdustani.setBounds(180, 210, 142, 23);
		contentPane.add(btnOdustani);

		JLabel lblSifra = new JLabel("Sifra");
		lblSifra.setBounds(10, 11, 46, 14);
		contentPane.add(lblSifra);

		textFieldSifra = new JTextField();
		textFieldSifra.setBounds(10, 39, 142, 20);
		contentPane.add(textFieldSifra);
		textFieldSifra.setColumns(10);

		JLabel lblProdajni = new JLabel("Prodajni kurs");
		lblProdajni.setBounds(10, 70, 111, 14);
		contentPane.add(lblProdajni);

		textFieldProdajni = new JTextField();
		textFieldProdajni.setBounds(10, 95, 142, 20);
		contentPane.add(textFieldProdajni);
		textFieldProdajni.setColumns(10);

		JLabel lblNaziv = new JLabel("Naziv");
		lblNaziv.setBounds(180, 11, 46, 14);
		contentPane.add(lblNaziv);

		JLabel lblKupovni = new JLabel("Kupovni kurs");
		lblKupovni.setBounds(180, 70, 89, 14);
		contentPane.add(lblKupovni);

		JLabel lblSkraceni = new JLabel("Skraceni naziv");
		lblSkraceni.setBounds(180, 126, 111, 14);
		contentPane.add(lblSkraceni);

		JLabel lblSrednji = new JLabel("Srednji kurs");
		lblSrednji.setBounds(10, 126, 111, 14);
		contentPane.add(lblSrednji);

		textFieldNaziv = new JTextField();
		textFieldNaziv.setBounds(180, 39, 142, 20);
		contentPane.add(textFieldNaziv);
		textFieldNaziv.setColumns(10);

		textFieldKupovni = new JTextField();
		textFieldKupovni.setBounds(180, 95, 142, 20);
		contentPane.add(textFieldKupovni);
		textFieldKupovni.setColumns(10);

		textFieldSkraceni = new JTextField();
		textFieldSkraceni.setBounds(180, 151, 142, 20);
		contentPane.add(textFieldSkraceni);
		textFieldSkraceni.setColumns(10);

		textFieldSrednji = new JTextField();
		textFieldSrednji.setBounds(10, 151, 142, 20);
		contentPane.add(textFieldSrednji);
		textFieldSrednji.setColumns(10);

	
	}
}
