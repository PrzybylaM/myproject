package pl.sdacademy.java16poz.programowanie2.program;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import programowanie2.program.IAnimal;
import programowanie2.program.IBeer;
import programowanie2.program.ILivingBear;
import programowanie2.program.beers.BlackBeer;
import programowanie2.program.beers.PolarBeer;
import programowanie2.program.helpers.IDateProvider;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;

import static org.mockito.Mockito.mock;

public class ProgramTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    IDateProvider dateProvider = mock(IDateProvider.class);

    @Before
    public void setUp(){
        System.setOut(new PrintStream(outContent));
        final IBeer beer = mock(IBeer.class);
        Mockito.when(beer.getWeight()).thenReturn(37);
    }



    @Test
    public void getWeight_forPolarBear_returns200_Test(){
        //AAA - Arrage, Act, Assert
        //Arrage / Given
        IBeer beer = new PolarBeer(dateProvider);
        int expectedWeight = 200;

        //Act / When
        int actualWeight = beer.getWeight();


        //Assert / Then
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void getWeightForBlackBearTest(){
        IBeer beer = new BlackBeer(dateProvider);
        int expectedWeight = 50;

        int actualWeight = beer.getWeight();

        Assert.assertEquals(expectedWeight, actualWeight);

    }

    @Test
    public void attackforPolarBearReturnsCorrectMessageOnConsoleOutPutTest() {

        //Arage
        ILivingBear bear = new PolarBeer(dateProvider);
        String expected = "Kill the target!".trim();

        //Act
        bear.attack();
        String actual = outContent.toString().trim();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalIsAliveIfHeHasEatemLessThan10DaysAgoTest() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2019);
        cal.set(Calendar.MONTH, Calendar.JULY);
        cal.set(Calendar.DAY_OF_MONTH, 20);

        Date currentDate = cal.getTime();

        Mockito.when(dateProvider.getDate()).thenReturn(currentDate);

        IAnimal animal = new BlackBeer(dateProvider);
        animal.eat();

        boolean isAlive = animal.isAlive();

        Assert.assertEquals(true, isAlive);

    }

        @Test
        public void animalIsAliveIfHeHasEatemLessThan11DaysAgoTest(){
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, 2019);
            cal.set(Calendar.MONTH, Calendar.JULY);
            cal.set(Calendar.DAY_OF_MONTH, 14);

            Date currentDate = cal.getTime();
            Mockito.when(dateProvider.getDate()).thenReturn(currentDate);

            IAnimal animal = new BlackBeer(dateProvider);
            animal.eat();

            cal.set(Calendar.DAY_OF_MONTH, 26);
            currentDate = cal.getTime();
            Mockito.when(dateProvider.getDate()).thenReturn(currentDate);
            boolean isAlive = animal.isAlive();

            Assert.assertEquals(false, isAlive);

    }


        @After
                public void tearDown() {
            System.setOut(originalOut);
        }


    }
