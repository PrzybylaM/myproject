package pl.sdacademy.java16poz.programowanie2.emergencyObserwator;

public class FirstAmbulance implements IAmbulance {
    private Operator operator;

    FirstAmbulance(Operator operator){
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToIncidendt();
    }

    public void driveToIncidendt(){
        String status = operator.getStatus();
        System.out.println("Jedziemy do wypadku: " + status);
    }
}
