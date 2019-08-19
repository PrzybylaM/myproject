package pl.sdacademy.java16poz.programowanie1.sort;

public class BubbleSort extends AlgorithmSort {

    public void sort() {
        //przechodzenie po elementach w petli
        //porownac 2 elementy
        //gdy druga z liczb jest mniejsza od pierwszej
        //zamieniamy miejscami liczby
        //w przeciwnym razie idziemy dalej
        boolean b = true;
        boolean isSort = false;
        boolean isSwap = false;
        while (!isSort){
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int tmp;
                    swap(i, i+1);
                    isSwap=true;
                }
                print();
            }
            if(!isSwap){
                isSort=true;
            }else {
                isSwap=false;
            }

        }
    }
}
