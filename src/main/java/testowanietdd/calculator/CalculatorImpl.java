package testowanietdd.calculator;

public class CalculatorImpl implements Calculator {

    //wartosc początkowa wyswietlacza
    //w konstruktorze
    private String display;
    public static String DIV_ERROR_MESSAGE = "Nie dziel przezc 0";


    public CalculatorImpl(){
        clear();
    }


    @Override
    public void clear() {
        display = new String();
    }

    @Override
    public void pressNumber(Object number) {
        //dopisuj do wyswietlacza kolejne wpisane
        //znaki z uzyciem StringBuildera
        StringBuilder builder= new StringBuilder(display);
        builder.append(number);
        display = builder.toString();
        //ponieżej w postaci jednej linijki
        //display = new StringBuilder(display).append(number).toString();
    }



    @Override
    public String display() {
        //zwróc stan wyswietlacza
        return display;
    }

    @Override
    public void add(int number1, int number2) {
        pressNumber(number1+number2);
    }

    @Override
    public void sub(int number1, int number2) {
        pressNumber(number1-number2);
    }

    @Override
    public void div(int number1, int number2) throws IllegalArgumentException {
        if (number2 == 0){
            throw new IllegalArgumentException(DIV_ERROR_MESSAGE);
        }else{
            pressNumber(number1/number2);
        }
    }

    @Override
    public void multi(int number1, int number2) {
        pressNumber(number1*number2);
    }


}
