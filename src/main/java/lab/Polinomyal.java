package lab;

import java.util.ArrayList;

/**
 * Polinomyal class, Created by Vinnikov Ilya 9/25/2019
 */

public class Polinomyal {

    private ArrayList<Fraction> polinomCoe;
    private int power;
    private long[] polinom;

    /**
     * 
     * @return double
     */
    public long[] getPolinom() {
        return polinom;
    }

    public ArrayList<Fraction> getCoe() {
        return polinomCoe;
    }

    /**
     * Initializes the polinom
     * 
     * @param sof- Set of fraction
     * @param p    - power
     */
    public Polinomyal(SetOfFraction sof, int p) {
        this.polinomCoe = (ArrayList<Fraction>) sof.getArray().clone();
        this.power = p;
        polinom = new long[polinomCoe.size()];
        for (int i = 0; i < polinomCoe.size(); i++)
            polinom[i] = (long) Math.pow(polinomCoe.get(i).Value(), power + polinomCoe.size() - 1 - i);
    }

    /**
     * Prints the polinom
     */
    public void show() {
        for (double X : polinom) {
            System.out.print(X + " ");
        }
        System.out.println();
    }

    /**
     * @param p - polinom
     */
    public Polinomyal add(Polinomyal p) {
        int mSize = Math.min(polinom.length, p.getPolinom().length);
        long[] temp = polinom.length >= p.polinom.length ? polinom : p.polinom;
        for (int i = 0; i < mSize; i++)
            temp[i] = polinom[i] + p.polinom[i];
        polinom = temp;

        return this;
    }

    public Polinomyal reverse() {
        long[] rPolinom = new long[polinom.length];
        int j = polinom.length;
        for (int i = 0; i < polinom.length; i++) {
            rPolinom[j - 1] = polinom[i];
            j = j - 1;
        }
        polinom = rPolinom;
        return this;
    }

}
