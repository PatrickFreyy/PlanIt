package src.main.java.de.dhbw.planit.frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class WeekOverview {
	String description;
	// Category category;
	int priority; // data not final
	Color color;
	Date startDate = new Date();
	Date endDate = new Date();

	// Panel Tage erstellen
	static JPanel panelUhrzeit = new JPanel();
	JPanel panelMontag = new JPanel();
	JPanel dienstagPanel = new JPanel();
	JPanel mittwochPanel = new JPanel();
	JPanel donnerstagPanel = new JPanel();
	JPanel freitagPanel = new JPanel();
	JPanel samstagPanel = new JPanel();
	JPanel sonntagPanel = new JPanel();

	private String getDayOfTheWeek() throws ParseException {
		SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		String date = "22.08.1989"; // muss noch angepasst werden
		return dayFormat.format(format.parse(date));
	}

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeekOverview window = new WeekOverview();
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
	public WeekOverview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1545, 682);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel logo = new JPanel();
		logo.setBounds(43, 11, 375, 40);
		frame.getContentPane().add(logo);

		JLabel labelLogo = new JLabel("PlanIt Logo");
		labelLogo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		logo.add(labelLogo);

		// ------------------------

		JPanel panelTerminsicht = new JPanel();
		panelTerminsicht.setBorder(new LineBorder(SystemColor.desktop));
		panelTerminsicht.setBounds(10, 176, 1509, 442);
		frame.getContentPane().add(panelTerminsicht);
		panelTerminsicht.setLayout(new GridLayout(1, 8, 0, 0));

		panelUhrzeit.setBackground(Color.LIGHT_GRAY);
		panelUhrzeit.setBorder(new LineBorder(SystemColor.desktop));
		panelTerminsicht.add(panelUhrzeit);

		panelMontag.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTerminsicht.add(panelMontag);

		dienstagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTerminsicht.add(dienstagPanel);

		mittwochPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTerminsicht.add(mittwochPanel);

		donnerstagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTerminsicht.add(donnerstagPanel);

		freitagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTerminsicht.add(freitagPanel);

		samstagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTerminsicht.add(samstagPanel);

		sonntagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTerminsicht.add(sonntagPanel);

		// -------------------

		JPanel panelTage = new JPanel();
		panelTage.setBackground(Color.LIGHT_GRAY);
		panelTage.setBorder(new LineBorder(Color.BLACK));
		panelTage.setBounds(10, 124, 1509, 54);
		frame.getContentPane().add(panelTage);
		panelTage.setLayout(new GridLayout(1, 8, 0, 0));

		JLabel Kalenderwoche = new JLabel("");
		Kalenderwoche.setBackground(new Color(255, 160, 122));
		panelTage.add(Kalenderwoche);

		JLabel montagHeader = new JLabel("Montag");
		montagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		montagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panelTage.add(montagHeader);

		JLabel dienstagHeader = new JLabel("Dienstag");
		dienstagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		dienstagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panelTage.add(dienstagHeader);

		JLabel mittwochHeader = new JLabel("Mittwoch");
		mittwochHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		mittwochHeader.setHorizontalAlignment(SwingConstants.CENTER);
		panelTage.add(mittwochHeader);

		JLabel donnerstagHeader = new JLabel("Donnerstag");
		donnerstagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		donnerstagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		panelTage.add(donnerstagHeader);

		JLabel freitagHeader = new JLabel("Freitag");
		freitagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		freitagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		panelTage.add(freitagHeader);

		JLabel samstagHeader = new JLabel("Samstag");
		samstagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		samstagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		panelTage.add(samstagHeader);

		JLabel sonntagHeader = new JLabel("Sonntag");
		sonntagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		sonntagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		panelTage.add(sonntagHeader);

		JPanel panelHeader = new JPanel();
		panelHeader.setBounds(10, 11, 1509, 48);
		frame.getContentPane().add(panelHeader);
		panelHeader.setLayout(new BorderLayout(0, 0));

		JButton buttonCreateAppointment = new JButton("Erstelle neuen Termin");
		buttonCreateAppointment.setBackground(new Color(30, 144, 255));
		buttonCreateAppointment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonCreateAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelHeader.add(buttonCreateAppointment, BorderLayout.EAST);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 160, 122));
		panel_1.setBounds(10, 76, 1509, 48);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JButton buttonLetzteWoche = new JButton("<-  Letzte Woche");
		buttonLetzteWoche.setBackground(new Color(30, 144, 255));
		buttonLetzteWoche.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonLetzteWoche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(buttonLetzteWoche, BorderLayout.WEST);

		JLabel labelDatumWoche = new JLabel("Datum:");
		labelDatumWoche.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelDatumWoche.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(labelDatumWoche, BorderLayout.CENTER);

		JButton buttonNaechsteWoche = new JButton("N\u00E4chste Woche  ->");
		buttonNaechsteWoche.setBackground(new Color(30, 144, 255));
		buttonNaechsteWoche.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(buttonNaechsteWoche, BorderLayout.EAST);

		iniziateAppointments();
	}

	private void iniziateAppointments() {
		// TODO Auto-generated method stub
		try {
			System.out.println(getDayOfTheWeek());
			switch (getDayOfTheWeek()) {
			case "Montag": {
				panelMontag.add(new Paint());
			}
			case "Dienstag": {
				dienstagPanel.add(new Paint());
			}
			case "Mittowch": {
				mittwochPanel.add(new Paint());
			}
			case "Donnerstag": {
				donnerstagPanel.add(new Paint());
			}
			case "Freitag": {
				freitagPanel.add(new Paint());
			}
			case "Samstag": {
				samstagPanel.add(new Paint());
			}
			case "Sonntag": {
				sonntagPanel.add(new Paint());
			}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
