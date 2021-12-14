package src.main.java.de.dhbw.planit.backend;

// import java.sql.Date;

import src.main.java.de.dhbw.planit.frontend.createAppointment;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        
        FilePersistence fp = new FilePersistence();
        createAppointment ca = new createAppointment();

        Schedule sc = new Schedule(fp, ca);

    }
}
