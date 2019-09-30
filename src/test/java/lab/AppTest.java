package lab;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



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
}
