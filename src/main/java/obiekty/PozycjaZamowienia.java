package obiekty;

public class PozycjaZamowienia {

    //nazwa, ilosc, cenaJednostki
    String nazwa;
    short ilosc;
    float cenaJednostki;


    // konstruktor: nazwa, cena, (domyslnie ilosc =1)
    //konstruktor: nazwa, cena ilosc
    public PozycjaZamowienia(String nazwa, float cenaJednostki){
        //wykorzystanie konstrukotra w konstruktorze
        this(nazwa,cenaJednostki,(short)1);
    }

    public PozycjaZamowienia(String nazwa,float cenaJednostki, short ilosc){
        this.nazwa = nazwa;
        this.cenaJednostki = cenaJednostki;
        this.ilosc = ilosc;
    }



        //metody: pobierzSume(), pobierzCene() / jednostki
        public float pobierzCene(){
        return cenaJednostki;
        }

        public float pobierzSume(){
        return ilosc*cenaJednostki;
        }

    public void prettyPrint() {

    }

    public String pobierzNazwe() {
        return nazwa;
    }
}
