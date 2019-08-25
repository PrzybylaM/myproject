package programowanie2.bracketParse;

public class BracketParse {


    public static boolean validateBrackets(String brackets) {
        int counter = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if ('(' == brackets.charAt(i)) {
                counter++;
            } else if (')' == brackets.charAt(i)) {
                if (counter > 0) {
                    counter--;
                } else {
                    return false;
                }
            }
        }

        if (counter == 0) {
            return true;
        }

        return false;
    }

}

