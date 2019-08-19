package pl.sdacademy.java16poz.programowanie2.kryptografia.szyfrCezara;

public interface ICezarService {
    String szyfrowanie(String someString, int key);

    String rozszyfrowywanie(int key);

    String setCezar();
}
