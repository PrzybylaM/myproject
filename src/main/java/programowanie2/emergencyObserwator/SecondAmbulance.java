package programowanie2.emergencyObserwator;

public class SecondAmbulance implements IAmbulance {
    private Operator operator;

    public SecondAmbulance(Operator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToIncidendt();
    }

    public void driveToIncidendt(){
        String status = operator.getStatus();
        System.out.println("Jedziemy do: " + status);
    }
}
