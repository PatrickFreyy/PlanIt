package de.dhbw.planit;

import java.io.File;

public class FilePersistence implements Persistence{
      File storage;
      Appointment appointment;

    @Override
    public void saveAppointment(Appointment appointment) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Appointment loadAppointments() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAppointment(int app_ID) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateAppointment(Appointment appointment) {
        // TODO Auto-generated method stub
        
    }
      // ---------------- getter and setter section ---------------

      File getStorage() {
          return storage;
      }

      void setStorage(File storage) {
          this.storage = storage;
      }

      Appointment getAppointment() {
          return appointment;
      }

      void setAppointment(Appointment appointment) {
          this.appointment = appointment;
      }

    
}
