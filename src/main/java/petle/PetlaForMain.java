package petle;

public class PetlaForMain {
    public static void main(String[] args) {

        String[]Tab1 = {"Poznan", "Wrocław", "Wolsztyn", "Gdańsk", "Gdynia"};

        //licznik ; warunek zakończenia ; krok
        //stosujemy literki i,j,k,l,m,n,o
        for (int i=0; i<5; i++){
            String miasto = Tab1[i];
            System.out.print("Interacja: "+ i+" | ");
            System.out.println(miasto);
        }


    }
}
