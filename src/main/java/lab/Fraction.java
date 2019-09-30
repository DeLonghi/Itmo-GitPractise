package lab;

import java.io.File;
import java.util.Scanner;

/**
 * Fraction class, Created by Vinnikov Ilya 9/25/2019
 */

public class Fraction implements Cloneable {

    private int M;
    private int N;

    /**
     * LOLLLLL
     * 
     * @param m
     * @param n
     */
    public Fraction(int m, int n) {
        this.M = m;
        this.N = n;
    }

    public Fraction(File file) {
        try {
            Scanner scanner = new Scanner(file);
            this.M = scanner.nextInt();
            this.N = scanner.nextInt();
            scanner.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public int getM() {
        return M;
    }

    public int getN() {
        return N;
    }

    /**
     * @param m numerator
     */
    public void setM(int m) {
        this.M = m;
    }

    /**
     * @param n denominator
     */
    public void setN(int n) {
        this.N = n;
    }

    /**
     * 
     * @return double
     */

    public double Value() {
        return (double) M / N;
    }

    @Override
    public Fraction clone() throws CloneNotSupportedException {

        return (Fraction) super.clone();
    }

}