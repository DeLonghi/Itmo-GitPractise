package lab;



import java.util.ArrayList;

/** Polynomial class,
 * Created by Vinnikov Ilya 9/25/2019
 * Edited by Daniil Tatianin 9/30/2019
 */

public class Polynomial {



    private ArrayList<Fraction> polynomialCoe;
    private int power;
    private long[] polynomial;
/**
 * 
 * @return long[]
 */
    public long[] getPolynomial() {
        return polynomial;
    }

    public ArrayList<Fraction> getCoe() {
        return polynomialCoe;
    } 

    /**
     * Initializes the polynomial
     * @param sof- Set of fraction
     * @param p    - power
     */
    public Polynomial(SetOfFraction sof, int p) {
        this.polynomialCoe = (ArrayList<Fraction>) sof.getArray().clone();
        this.power = p;
        polynomial = new long[polynomialCoe.size()];
        for (int i = 0; i < polynomialCoe.size(); i++)
            polynomial[i] = (long) Math.pow(polynomialCoe.get(i).Value(), power + polynomialCoe.size() - 1 - i);
    }
/**
 * Prints out the polynomial
 */
    public void show() {
        for (double X : polynomial) {
            System.out.print(X + " ");
        }
        System.out.println();
    }

    /**
     * @param p - polynomial
     */
    public Polynomial add(Polynomial p) {
        int mSize = Math.min(polynomial.length, p.getPolynomial().length);
        long[] temp = polynomial.length >= p.polynomial.length ? polynomial : p.polynomial;
        for (int i = 0; i < mSize; i++)
            temp[i] = polynomial[i] + p.polynomial[i];
        polynomial = temp;

        return this;
    }

}
