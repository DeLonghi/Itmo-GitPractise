package lab;



import java.util.ArrayList;

/** Polinomial class,
 * Created by Vinnikov Ilya 9/25/2019
 * Edited by Daniil Tatianin 9/30/2019
 */

public class Polinomial {



    private ArrayList<Fraction> polinomialCoe;
    private int power;
    private long[] polinomial;
/**
 * 
 * @return long[]
 */
    public long[] getPolinomial() {
        return polinomial;
    }

    public ArrayList<Fraction> getCoe() {
        return polinomialCoe;
    } 

    /**
     * Initializes the polinomial
     * @param sof- Set of fraction
     * @param p    - power
     */
    public Polinomial(SetOfFraction sof, int p) {
        this.polinomialCoe = (ArrayList<Fraction>) sof.getArray().clone();
        this.power = p;
        polinomial = new long[polinomialCoe.size()];
        for (int i = 0; i < polinomialCoe.size(); i++)
            polinom[i] = (long) Math.pow(polinomialCoe.get(i).Value(), power + polinomialCoe.size() - 1 - i);
    }
/**
 * Prints the polinom
 */
    public void show() {
        for (double X : polinomial) {
            System.out.print(X + " ");
        }
        System.out.println();
    }

    /**
     * @param p - polinom
     */
    public Polinomial add(Polinomial p) {
        int mSize = Math.min(polinomial.length, p.getPolinomial().length);
        long[] temp = polinomial.length >= p.polinomial.length ? polinomial : p.polinomial;
        for (int i = 0; i < mSize; i++)
            temp[i] = polinomial[i] + p.polinomial[i];
        polinomial = temp;

        return this;
    }

}
