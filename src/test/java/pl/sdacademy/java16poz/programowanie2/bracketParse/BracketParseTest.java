package pl.sdacademy.java16poz.programowanie2.bracketParse;

import org.junit.Test;
import programowanie2.bracketParse.BracketParse;

import static org.junit.Assert.*;

public class BracketParseTest {

    @Test
    public void shouldReturnTrueForValidBarackets() {
        //given
        String brackets = "((()))()()()(())";
        //when
        boolean result = BracketParse.validateBrackets(brackets);
        //then
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForIncorrectBarackets() {
        //given
        String brackets = "((()))(()(())()()(())";
        //when
        boolean result = BracketParse.validateBrackets(brackets);
        //then
        assertFalse(result);
    }

    @Test
    public void shouldProcessDespiteWrongChar() {
        //given
        String brackets = "(((a))b)()(c)()d(())";
        //when
        boolean result = BracketParse.validateBrackets(brackets);
        //then
        assertTrue(result);
    }

}