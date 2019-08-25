package pl.sdacademy.java16poz.programowanie2.bracketParse;

import org.junit.Test;
import programowanie2.bracketParse.TagParser;

import static org.junit.Assert.*;

public class TagParserTest {

    @Test
    public void shouldCorrectlyParseAndUpperCaseHTML(){
        String htmlToParse = "<HTML class=Black>Ble ble</HTML>";

        String result = TagParser.parseTag(htmlToParse);

        assertEquals("<HTML class=Black>Ble ble</HTML>", result);
    }


}