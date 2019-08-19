package pl.sdacademy.java16poz.java16poz.programowanie1.lists.stack;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.obiekty.Book;
import pl.sdacademy.java16poz.programowanie1.lists.slack.Stack;
import pl.sdacademy.java16poz.programowanie1.lists.slack.StackImpl;

import java.util.Optional;

import static org.junit.Assert.*;
public class StackTest {

    private Book javaPodstawyBook;
    private Stack<Book> stack;
    private Book testyTddBook;
    private Book javaAlgorytmy;
    private Book javaZaawansowana;


    @Before
    public void setUp() throws Exception {
        //given
        //tworzymy obiekt który testujemy - tworzymy Stos StackImpl
        stack = new StackImpl();
        //stos generyczny to znaczy, że może zawierać dowolny typ
        //może być to stos książek, palet
        //stos książek Book (ISBN, author, title, date (Date/String))
        //Book posiada konstruktor oraz metodę toString()
        //tworzymy obiekty do stosu
        javaPodstawyBook = new Book("9788328341449","Mirosław J. Kubiak","Java. Zadania z programowania z przykładowymi rozwiązaniami. Wydanie 2");
        testyTddBook = new Book("9788328323414","Alex Garcia Viktor Farcic","TDD Programowanie w Javie sterowane testami");
        javaAlgorytmy = new Book("1242342352352", "Robert", "Java algorytmy");
        javaZaawansowana = new Book("1213456789", "Janusz Janusz", "Zadania z Januszem");
    }


    /**
     * Test sprawdza czy stworzony stos jest pusty
     */
    @Test
    public void emptyStackOnCreateTest(){
        //when
        boolean isEmpty = stack.isEmpty();

        //then
        assertTrue("Stos powinien być pusty", isEmpty);
    }

    /**
     * Test wstawia jeden element na stos (nie pusty)
     */
    @Test
    public void pushOneElementOnNotEmptyStackTest(){
        //when
        stack.push(javaPodstawyBook);//nie pusty stos poniewaz dodalismy
        stack.push(testyTddBook);
        boolean isEmpty = stack.isEmpty();
        Optional<Book> peek = stack.peek();

        //then
        assertFalse("Stos powinien być nie pusty",isEmpty);
        assertTrue("Podglądany element powinien istnieć",peek.isPresent());
        assertTrue("Podglądany element to testy TDD",peek.get().equals(testyTddBook));
    }

    /**
     * Test pobiera element na pustym stosie
     */
    @Test
    public void popOneElementOnEmptyStackTest(){
        //when
        Optional<Book> popElement = stack.pop();
        boolean isEmpty = stack.isEmpty();

        //then
        //jeśli isEmpty nie jest prawdą wypisze message w konsoli
        assertTrue("Stos powinien być pusty", isEmpty);

    }
    @Test
    public void pushOneElementAndPeekStackTest(){
        //when
        //push
        stack.push(javaPodstawyBook);
        //peek
        Optional<Book> peek = stack.peek();//podglądany element
        boolean isEmpty = stack.isEmpty();

        //then
        assertFalse("Stos powinien być nie pusty",isEmpty);
        assertTrue("Podglądany element powinien istnieć",peek.isPresent());
        assertTrue("Podglądany element powinien mieć autora Mirosława Kubiak",
                peek.get().getAuthor().equals("Mirosław J. Kubiak"));

        //optional is empty
    }
    /**
     * Test wstawiamy element na pusty stos
     */
    @Test
    public void pushOneElementOnEmptyStackTest(){
        //when opcja .var
        stack.push(javaPodstawyBook);
        boolean isEmpty = stack.isEmpty();

        //then
        //jeśli isEmpty nie jest prawdą wypisze message w konsoli
        assertFalse("Stos powinien być nie pusty",isEmpty);
        //assertTrue("Pobrany element nie powienien istnieć",!popElement.isPresent());//to samo co poniżej

    }

    /**
     * Test wstawiania 2 elementów i jeden podgląd
     * wstawiania 2 elementów i zdjęcie 4 elementów
     * powinno być pusto na stosie
     */
    @Test
    public void pushFourElementPeekAndPeekAndPopStackTest(){
        stack.push(testyTddBook);
        stack.push(javaPodstawyBook);

        Optional<Book> peek = stack.peek();

        stack.push(javaAlgorytmy);
        stack.push(javaZaawansowana);

        Optional<Book> popFirst = stack.pop();
        stack.pop();
        stack.pop();
        Optional<Book> popLast = stack.pop();
        boolean isEmpty = stack.isEmpty();

        //then
        assertTrue("Stos powinien być pusty", isEmpty);
        assertTrue("Po dwóch pushach podejrzana będzie javaPodstawy", peek.get().equals(javaPodstawyBook));
        assertTrue("Pierwszą pobraną powinna być Java Zaawansowana", popFirst.get().equals(javaZaawansowana));
        assertTrue("Ostatnią pobraną powinny być testy TDD", popLast.get().equals(testyTddBook));

    }
}