package programowanie2.bracketParse;

import static programowanie2.bracketParse.BracketParse.validateBrackets;

public class Main {
    public static void main(String[] args) {

        String brackets = "(())()()(())";

        boolean valid = validateBrackets(brackets);
        System.out.println(valid);
    }

}
