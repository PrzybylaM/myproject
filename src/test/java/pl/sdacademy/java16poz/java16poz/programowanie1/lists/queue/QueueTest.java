package pl.sdacademy.java16poz.java16poz.programowanie1.lists.queue;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.java16poz.programowanie1.TestBase;
import pl.sdacademy.java16poz.obiekty.Person;
import programowanie1.lists.queue.Queue;
import programowanie1.lists.queue.QueueImpl;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * QueueTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 13:09
 **/
public class QueueTest extends TestBase {
    Queue<Person> queue;
    private Person julietPerson;
    private Person joannPerson;
    private Person jesonPerson;

    @Before
    public void setUp(){
        // given
        queue = new QueueImpl();
        julietPerson = new Person("Juliet","Michaelle",23);
        joannPerson = new Person("Joann","April",17);
        jesonPerson = new Person("Jeson","September",34);

    }



    /**
     * Test sprawdza czy nowa kolejka jest pusta
     */
    @Test
    public void shouldEmptyNewQueueTest(){

        //when

        //then
        assertTrue("Lista powinna być pusta",queue.isEmpty());
    }

    /**
     * Test kolejkuje jeden element
     */
    @Test
    public void shouldEnqueueOneElementTest(){
        //when
        queue.enqueue(julietPerson);
        //then
        assertTrue("Kolejka nie powinna byc pusta", !queue.isEmpty());
    }

    /**
     * Test kolejkuje dwa elementy
     */
    @Test
    public void shouldEnqueueTwoElementTest(){
        //when
        queue.enqueue(joannPerson);
        queue.enqueue(jesonPerson);

        //then
        assertTrue("Kolejka nie powinna być pusta", !queue.isEmpty());

    }

    /**
     * Test kolejkuje trzy elementy
     */
    @Test
    public void shouldEnqueueThreeElementTest(){
        //when
        queue.enqueue(jesonPerson);
        queue.enqueue(joannPerson);
        queue.enqueue(julietPerson);
        //then

        assertTrue("Kolejka nie powinna być pusta", !queue.isEmpty());

    }

    /**
     * Test kolejkuje jeden element oraz dekolejkuje go
     */
    @Test
    public void shouldEnqueueDequeueOneElementTest(){
        //when
        queue.enqueue(julietPerson);
        queue.dequeue();
        //then
        assertTrue("Kolejka powinna być pusta", queue.isEmpty());
    }

    /**
     * Test kolejkuje jeden element i podgląda peek()
     */
    @Test
    public void shouldEnqueueOneElementAndPeekTest(){
        //when
        queue.enqueue(jesonPerson);
        Optional<Person> optional = queue.peek();

        //then
        assertTrue("Osoba sprawdzana w kolejce powinna istnieć", optional.isPresent());
        assertTrue("Osoba sprawdzana jest jeson",optional.get().equals(jesonPerson));
    }

    /**
     * Test kolejkuje dwa elementy i podgląda peek()
     */
    @Test
    public void shouldEnqueueTwoElementAndPeekTest(){
        //when
        queue.enqueue(julietPerson);
        queue.enqueue(joannPerson);
        Optional<Person> optional = queue.peek();
        //then
        assertTrue("Osoby sprawdzane w kolejce powinny istnieć", optional.isPresent());
        assertTrue("Osobą sprawdzaną powinna być juliet", optional.get().equals(julietPerson));
        Person person = optional.get();
        assertTrue("Osoba sprawdzana powinna miec na imie Juliet", person.getName().equals("Juliet"));
    }


}