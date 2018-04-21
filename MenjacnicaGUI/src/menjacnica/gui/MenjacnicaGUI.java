package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenjacnicaGUI extends JFrame {

	public JTextArea textAreaStatus;
	private JPanel contentPane;
	private JTable table;
	MenjacnicaGUI menj = this;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izlaz();
			}

		});
		setTitle("Menja\u010Dnica");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 681, 439);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_1.setPreferredSize(new Dimension(2, 50));
		contentPane.add(scrollPane_1, BorderLayout.SOUTH);

		JTextArea textAreaStatus = new JTextArea();
		scrollPane_1.setViewportView(textAreaStatus);
		this.textAreaStatus = textAreaStatus;
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();

				int opcija = fc.showOpenDialog(null);

				if (opcija == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					textAreaStatus.append("Ucitan fajl: " + f.getAbsolutePath() + "\n");

				}
			}
		});
		mntmOpen.setIcon(
				new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/File.gif")));
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmOpen);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();

				int opcija = fc.showSaveDialog(null);

				if (opcija == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					textAreaStatus.append("Sacuvan fajl: " + f.getAbsolutePath() + "\n");
				}
			}
		});
		mntmSave.setIcon(new ImageIcon(
				MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izlaz();
			}
		});
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Aplikacija Menjacnica, autor Milica Zukanovic", "O programu",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnHelp.add(mntmAbout);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
				new String[] { "\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, Double.class, Double.class, Double.class,
					String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		scrollPane.setViewportView(table);

		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(table, popupMenu_1);

		JMenuItem mntmDodajKurs_1 = new JMenuItem("Dodaj kurs");
		mntmDodajKurs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DodajKursGUI dkg = new DodajKursGUI(menj);
				dkg.setVisible(true);
			}
		});
		popupMenu_1.add(mntmDodajKurs_1);

		JMenuItem mntmObrisiKurs_1 = new JMenuItem("Obrisi kurs");
		mntmObrisiKurs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ObrisiKursGUI okg = new ObrisiKursGUI(menj);
				okg.setVisible(true);
			}
		});
		popupMenu_1.add(mntmObrisiKurs_1);

		JMenuItem mntmIzvrsiZamenu = new JMenuItem("Izvr\u0161i zamenu");
		mntmIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IzvrsiZamenuGUI izg = new IzvrsiZamenuGUI(menj);
				izg.setVisible(true);
			}
		});
		popupMenu_1.add(mntmIzvrsiZamenu);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(112, 10));
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnDodajKurs = new JButton("Dodaj kurs");
		btnDodajKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DodajKursGUI dkg = new DodajKursGUI(menj);
				dkg.setVisible(true);
			}
		});
		btnDodajKurs.setPreferredSize(new Dimension(110, 23));
		panel.add(btnDodajKurs);

		JButton btnObrisiKurs = new JButton("Obrisi kurs");
		btnObrisiKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ObrisiKursGUI okg = new ObrisiKursGUI(menj);
				okg.setVisible(true);
			}
		});
		btnObrisiKurs.setPreferredSize(new Dimension(110, 23));
		panel.add(btnObrisiKurs);

		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IzvrsiZamenuGUI izg = new IzvrsiZamenuGUI(menj);
				izg.setVisible(true);
			}
		});
		panel.add(btnIzvrsiZamenu);

	}

	private void izlaz() {
		int opcija = JOptionPane.showConfirmDialog(null, "Da li zelite da izadjete?", "Izlazak",
				JOptionPane.YES_NO_CANCEL_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
