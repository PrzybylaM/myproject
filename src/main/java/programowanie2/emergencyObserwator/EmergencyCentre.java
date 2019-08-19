package pl.sdacademy.java16poz.programowanie2.emergencyObserwator;

public class EmergencyCentre {
    public static void main(String[] args) {
        Operator adam = new OperatorAdam();
        IAmbulance fast = new FirstAmbulance(adam);
        adam.setStatus("Złamanie głowy");

        adam.setStatus("Menel");

    }
}
