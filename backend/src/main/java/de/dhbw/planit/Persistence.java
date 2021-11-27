package de.dhbw.planit;

public interface Persistence {
      public void saveAppointment(Appointment appointment);
      public Appointment loadAppointments();
      public void deleteAppointment(int app_ID);
      public void updateAppointment(Appointment appointment);
}
