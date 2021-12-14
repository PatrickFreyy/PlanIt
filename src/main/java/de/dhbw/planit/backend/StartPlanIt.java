package src.main.java.de.dhbw.planit.backend;

import src.main.java.de.dhbw.planit.frontend.createAppointment;

public final class StartPlanIt {
    private StartPlanIt() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        FilePersistence fp = new FilePersistence();
        createAppointment caView = new createAppointment();

        Schedule sc = new Schedule(fp, caView);



    }
}
