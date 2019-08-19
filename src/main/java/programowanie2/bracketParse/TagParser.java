package pl.sdacademy.java16poz.programowanie2.bracketParse;

public class TagParser {
    public static void main(String[] args) {
        String tags = "<html>Ble ble</html>";
        System.out.println(parseTag(tags));
    }

    public static String parseTag(String tags) {
        boolean isUpper = false;
        StringBuilder result = new StringBuilder();

        for (char character : tags.toCharArray()){
            if (character == '<') {
                isUpper = true;
            }else if (character == '>') {
                isUpper = false;
            }
                if (isUpper){
                    result.append(String.valueOf(character).toUpperCase());
                }else {
                    result.append(character);
                }
            }

        return result.toString();
    }

}
