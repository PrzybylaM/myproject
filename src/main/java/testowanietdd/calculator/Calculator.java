package pl.sdacademy.java16poz.testowanietdd.calculator;

public interface Calculator {

    /**
     * Metoda wprowadza znak z argumentu na wyswietlaczu, ale nie wyswietla
     * @param number
     */
    void pressNumber(Object number);

    /**
     * Metoda wyswietla zawartosc wyswietlacza
     * @return
     */
    String display();

    void add(int number1, int number2);
    void sub(int number1, int number2);
    void div(int number1, int number2);
    void multi(int number1, int number2);

    void clear();
}
