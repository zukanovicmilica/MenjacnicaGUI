package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldKupovni;
	private JTextField textFieldProdajni;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private MenjacnicaGUI menjacnica;

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI m) {
		menjacnica=m;
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 358, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(10, 11, 84, 14);
		contentPane.add(lblKupovniKurs);

		JLabel lblValuta = new JLabel("Valuta");
		lblValuta.setBounds(142, 11, 46, 14);
		contentPane.add(lblValuta);

		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setBounds(216, 11, 92, 14);
		contentPane.add(lblProdajniKurs);

		textFieldKupovni = new JTextField();
		textFieldKupovni.setEditable(false);
		textFieldKupovni.setBounds(10, 30, 117, 20);
		contentPane.add(textFieldKupovni);
		textFieldKupovni.setColumns(10);

		textFieldProdajni = new JTextField();
		textFieldProdajni.setEditable(false);
		textFieldProdajni.setBounds(216, 30, 117, 20);
		contentPane.add(textFieldProdajni);
		textFieldProdajni.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(142, 30, 64, 20);
		comboBox.addItem("EUR");
		comboBox.addItem("USD");
		comboBox.addItem("CHF");
		contentPane.add(comboBox);

		JLabel lblIznos = new JLabel("Iznos");
		lblIznos.setBounds(10, 84, 46, 14);
		contentPane.add(lblIznos);

		textField = new JTextField();
		textField.setBounds(10, 109, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblVrstaTransakcije = new JLabel("Vrsta transakcije");
		lblVrstaTransakcije.setBounds(184, 84, 103, 14);
		contentPane.add(lblVrstaTransakcije);

		JRadioButton rdbtnKupovina = new JRadioButton("Kupovina");
		buttonGroup.add(rdbtnKupovina);
		rdbtnKupovina.setSelected(true);
		rdbtnKupovina.setBounds(184, 108, 109, 23);
		contentPane.add(rdbtnKupovina);

		JRadioButton rdbtnProdaja = new JRadioButton("Prodaja");
		buttonGroup.add(rdbtnProdaja);
		rdbtnProdaja.setBounds(184, 134, 109, 23);
		contentPane.add(rdbtnProdaja);

		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textField.setText("" + slider.getValue());

			}
		});
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setBounds(10, 170, 323, 45);
		contentPane.add(slider);
		
		
		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String transakcija;
				if (rdbtnKupovina.isSelected())
					transakcija = "Kupovina";
				else
					transakcija = "Prodaja";

				String s = "Kurs je izmenjen. Naziv: " + (String) comboBox.getSelectedItem() + " Iznos: "
						+ textField.getText() + ", Vrsta transakcije: " + transakcija +'\n';
				menjacnica.textAreaStatus.append(" "+s);
				dispose();
		}
		});
		btnIzvrsiZamenu.setBounds(37, 236, 117, 23);
		contentPane.add(btnIzvrsiZamenu);

		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOdustani.setBounds(191, 236, 117, 23);
		contentPane.add(btnOdustani);
	}
}
