package src.main.java.de.dhbw.planit.backend;

import src.main.java.de.dhbw.planit.frontend.Event;

public interface UIView {
      void declareEvent(Event event);
      void showView();
}
