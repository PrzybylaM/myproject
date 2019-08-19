package pl.sdacademy.java16poz.programowanie2.kryptografia.szyfrCezara;

public class CezarService implements ICezarService {


    char ch;
    String message = "";
    String messageR = "";


    @Override
    public String szyfrowanie(String someString, int key) {

        char[] arr = someString.toCharArray();
        for (int i = 0; i < someString.length(); ++i) {
            ch = someString.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + key);

                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }

                message += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + key);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                message += ch;
            }
            else {
                message += ch;
            }
        }

    return message;
    }

    @Override
    public String rozszyfrowywanie(int key) {
        for (int i = 0; i < message.length(); ++i) {
            ch = message.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - key);

                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }

                messageR += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - key);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                messageR += ch;
            }
            else {
                messageR += ch;
            }
        }

        return messageR;
    }


    @Override
    public String setCezar() {
        return message;
    }
}