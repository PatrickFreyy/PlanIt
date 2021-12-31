package src.main.java.de.dhbw.planit.frontend;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;

import javax.swing.JComponent;

public class Paint extends JComponent {
	String description;
	// Category category;
	int priority; // data not final
	Color color;
	Date startDate = new Date();
	Date endDate = new Date();

	@Override
	protected void paintComponent(Graphics g) {
		int time = getTimeInMinutes();
		int x = 0;

//		g.fillRect(0, 10, 30, 30);
		g.setColor(Color.BLACK);
		g.fillRect(x, getStart(), WeekOverview.panelUhrzeit.getWidth(), time);
	}

	private int getStart() {
		return ((startDate.getHours() * 60) + startDate.getMinutes()) / (24 * 60);
	}

	private int getTimeInMinutes() {
		this.endDate.setHours(11);
		this.endDate.setMinutes(15);
		this.startDate.setHours(10);
		this.startDate.setMinutes(15);
		int diffhrs = endDate.getHours() - startDate.getHours();
		int diffmin = endDate.getMinutes() - startDate.getMinutes();
		int length = diffhrs * 60 + diffmin;
		int percentage = length / (24 * 60);
		return percentage;
	}
}
