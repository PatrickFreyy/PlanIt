package Scheduler;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class WeekOverview extends JComponent {
	String description;
	// Category category;
	int priority; // data not final
	Color color;
	Date startDate = new Date();
	Date endDate = new Date();

	// Panel Tage erstellen
	static JPanel uhrzeitenPanel = new JPanel();
	JPanel montagPanel = new JPanel();
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

		JPanel terminPanel = new JPanel();
		terminPanel.setBorder(new LineBorder(SystemColor.desktop));
		terminPanel.setBounds(10, 176, 1509, 442);
		frame.getContentPane().add(terminPanel);
		terminPanel.setLayout(new GridLayout(1, 8, 0, 0));

		uhrzeitenPanel.setBackground(Color.LIGHT_GRAY);
		uhrzeitenPanel.setBorder(new LineBorder(SystemColor.desktop));
		terminPanel.add(uhrzeitenPanel);

		montagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		terminPanel.add(montagPanel);

		dienstagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		terminPanel.add(dienstagPanel);

		mittwochPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		terminPanel.add(mittwochPanel);

		donnerstagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		terminPanel.add(donnerstagPanel);

		freitagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		terminPanel.add(freitagPanel);

		samstagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		terminPanel.add(samstagPanel);

		sonntagPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		terminPanel.add(sonntagPanel);

		// -------------------

		JPanel datumsleiste = new JPanel();
		datumsleiste.setBackground(Color.LIGHT_GRAY);
		datumsleiste.setBorder(new LineBorder(Color.BLACK));
		datumsleiste.setBounds(10, 124, 1509, 54);
		frame.getContentPane().add(datumsleiste);
		datumsleiste.setLayout(new GridLayout(1, 8, 0, 0));

		JLabel Kalenderwoche = new JLabel("");
		datumsleiste.add(Kalenderwoche);

		JLabel montagHeader = new JLabel("Montag");
		montagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		montagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		datumsleiste.add(montagHeader);

		JLabel dienstagHeader = new JLabel("Dienstag");
		dienstagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		dienstagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		datumsleiste.add(dienstagHeader);

		JLabel mittwochHeader = new JLabel("Mittwoch");
		mittwochHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		mittwochHeader.setHorizontalAlignment(SwingConstants.CENTER);
		datumsleiste.add(mittwochHeader);

		JLabel donnerstagHeader = new JLabel("Donnerstag");
		donnerstagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		donnerstagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		datumsleiste.add(donnerstagHeader);

		JLabel freitagHeader = new JLabel("Freitag");
		freitagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		freitagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		datumsleiste.add(freitagHeader);

		JLabel samstagHeader = new JLabel("Samstag");
		samstagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		samstagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		datumsleiste.add(samstagHeader);

		JLabel sonntagHeader = new JLabel("Sonntag");
		sonntagHeader.setFont(new Font("Tahoma", Font.PLAIN, 23));
		sonntagHeader.setHorizontalAlignment(SwingConstants.CENTER);
		datumsleiste.add(sonntagHeader);

		iniziateAppointments();
	}

	private void iniziateAppointments() {
		// TODO Auto-generated method stub
		try {
			System.out.println(getDayOfTheWeek());
			switch (getDayOfTheWeek()) {
			case "Montag": {
				montagPanel.add(new Paint());
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
