package programowanie2.emergencyObserwator;
/**
 Został użyty wzorzez obserwator
 */
public interface Operator {
    void registerObserver(IAmbulance ambulance);
    void removeObserver(IAmbulance ambulance);
    void notifyObservers();
    String getStatus();
    void setStatus(String status);
}
