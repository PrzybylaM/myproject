package programowanie2.emergencyObserwator;


import java.util.ArrayList;
import java.util.List;

public class OperatorAdam implements Operator {
    List<IAmbulance> ambulances = new ArrayList<>();

    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }


    @Override
    public void registerObserver(IAmbulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public void removeObserver(IAmbulance ambulance) {
        ambulances.remove(ambulance);
    }

    @Override
    public void notifyObservers() {
        ambulances.forEach(IAmbulance::update);
    }
}
