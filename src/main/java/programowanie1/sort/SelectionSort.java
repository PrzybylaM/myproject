package programowanie1.sort;

public class SelectionSort extends AlgorithmSort {

    @Override
    public void sort() {
        int position =0;
        while (position != numbers.length-1) {
            //znajdz indeks najmniejszej wartosci od pozycji do konca tablicy
            //zamien wartosci pozycji z indeksem pozycji najmniejszej wartosci
            position++;
            indexOfSmallest(position);
            int a = indexOfSmallest(position);
            swap(position, a);

        }

    }

    /**
     *       metoda zwraca indeks najmniejszej liczby od pozycji do konca
     */
    private  int indexOfSmallest(int position){
        int smallest = position;
        for (int i = position; i < numbers.length; i++){
            //numbers[i] - wartosc pozycji i-tej
            if (numbers[i] < numbers[smallest]){
                smallest = i;
            }
        }
        return smallest;
    }
}

