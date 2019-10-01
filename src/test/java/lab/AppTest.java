package lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;



/**
 * Unit test for simple App.
 */

public class AppTest {
    Polinomyal p1, p2;
    Fraction f1, f2, f3;
   
    @Before
    public void setUp() {
        f1 = new Fraction(1, 50);
        f2 = new Fraction(300, 2);
        f3 = new Fraction(1, 120);
       
    }


    @Test
    public void test1() {
        assertTrue(f1.Value() == 0.02);
    }

    @Test
    public void test2() {

        SetOfFraction sof = new SetOfFraction();

        sof.AddFraction(new Fraction(2, 1));
        sof.AddFraction(new Fraction(2, 1));
        sof.AddFraction(new Fraction(2, 1));
        
        long[] expected = {8, 4, 2};        

        Polinomyal actual = new Polinomyal(sof, 1);
        
        assertArrayEquals(actual.getPolinom(), expected);
    }

    @Test
    public void test3(){
        SetOfFraction expected = new SetOfFraction();

        expected.AddFraction(f1);
        expected.AddFraction(f2);
        expected.AddFraction(f3);

        Polinomyal actual = new Polinomyal(expected, 3);

        assertNotSame(expected, actual.getCoe());

    }

    @Test
    public void test4() {
        Fraction actual = new Fraction(new File("C:\\JAVAAAA\\Itmo-GitPractise\\src\\Fraction Input"));
        assertEquals(f1.getM(), actual.getM());
    }

    @Test
    public void test5() {
        assertTrue(f1.compare(f3));
    }
}
