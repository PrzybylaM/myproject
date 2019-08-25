package programowanie1.sort;

/**
 * Czym się rożni klasa od klasy abstrkcyjnej od interfejsu?
 * Odp. Klasa zawiera: pola, konstruktory, metody, metody z implementacjami
 * Interfejs: zawiera tylko deklaracje metod, nie zawiera implementacji i konstruktorów
 * Klasa abstrakcyjna zawiera: pola, konstruktory, metody z implementacjami oraz dklaracje metod abstrakcyjnych
 * UWAGA: nie można tworzyć obiektu typu klasa abstrakcyjna
 */

public abstract class AlgorithmSort {
    //pole - tablica liczb calkowitych
    int[] numbers = {1,3,80,5,67,3,2,57,32,79};

    //metoda wczytujaca tablice liczb load(tablica)
    public void load(int[] numbers){
        //czym rozni sie tablica intow od int?
        // int [] tablica - tablica liczb, int tablica -
        this.numbers = numbers;
    }

    //metoda pobierajaca tablice get()
    public int[] get(){
        return numbers;
    }

    //metoda wypisujaca elementy tablicy(StringBuilder)
    public void print(){
        for (int i =0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.print("\n");
    }

    public abstract void sort();


    public void swap(int i, int j){
        int tmp;
        tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }

}
