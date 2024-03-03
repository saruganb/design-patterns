import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class City {

  private String trafficUpdate = "";

  private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

  public void updateTraffic(String trafficUpdate) {
    this.propertyChangeSupport.firePropertyChange("trafficUpdate", this.trafficUpdate, trafficUpdate);
    this.trafficUpdate = trafficUpdate;
  }

  public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener){
    this.propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
  }

}
