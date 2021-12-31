package src.main.java.de.dhbw.planit.backend;

import java.sql.Date;
import src.main.java.de.dhbw.planit.frontend.Event;
// import src.main.java.de.dhbw.planit.backend.Category;
// import src.main.java.de.dhbw.planit.backend.Color;

public class Schedule {
    Persistence persitence;
    Appointment[] appointments;
    UIView view;
    int app_ID_gen;

    public Schedule (Persistence persistence, UIView view){
        this.persitence = persistence;
        this.view = view;
    }


    public void startCA(){
        view.declareEvent(new Event() {
            @Override
            public void createEvent(String[] strings){
                int app_ID;
                String description = strings[0];
                // Category category;
                int priority = 1;
                // Color color;
                Date startDate = Date.valueOf(strings[1]);
                Date endDate = Date.valueOf(strings[3]);
                app_ID = app_ID_gen++;
                createAppointment(app_ID, description, null, priority, null, startDate, endDate);
                // view.closeView();
                
            }
        });
    view.showView();
    }

    void createAppointment(int app_ID, String description, Category category, int priority,
                            Color color, Date startDate, Date endDate) {
        
        persitence.saveAppointment(new Appointment(app_ID, description, category, priority, color, startDate, endDate));
    }

    void refactorAppointment(int app_ID, String description, Category category, int priority,
                             Color color, Date startDate, Date endDate) {
         //
    }

    Appointment[] loadAppointments() {
        //
        return null;
    }

    void createExam (int app_ID, String description, Category category, int priority,
                     Color color, Date startDate, Date endDate, String module, int studyWorkload) {
        new Exam(app_ID, description, category, priority, color, startDate, endDate, module, studyWorkload);
    }

    // ---------------- getter and setter section ---------------

    Persistence getPersistence() {
        return persitence;
    }

    void setPersistence(Persistence persistence) {
        this.persitence = persistence;
    }

    UIView getView() {
        return view;
    }

    void setView(UIView view) {
        this.view = view;
    }

    Appointment[] getAppointments() {
        return appointments;
    }
}
