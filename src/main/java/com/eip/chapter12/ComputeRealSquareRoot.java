package com.eip.chapter12;

/**
 * Created by sunilpatil on 2/22/17.
 */
public class ComputeRealSquareRoot {

    public double squareRoot(double x) {
        double left, right;
        if (x < 1.0) {
            left = x;
            right = 1.0;
        } else {
            left = 1.0;
            right = x;
        }
        while (compare(left, right) == Ordering.SMALLER) {
            double middle = left + ((right - left) / 2);
            double midSquared = middle * middle;
            if (compare(midSquared, x) == Ordering.EQUAL)
                return middle;

            if (compare(midSquared, x) == Ordering.LARGER) {
                right = middle;
            } else {
                left = middle;
            }
        }
        System.out.println(x + " -> " + left);
        return left;
    }

    public static enum Ordering {SMALLER, EQUAL, LARGER}
    public Ordering compare(double a, double b) {
        final double EPSILON = 0.00001;
        double diff = (a - b) / b;
        if (diff < -EPSILON)
            return Ordering.SMALLER;
        else if (diff > EPSILON) {
            return Ordering.LARGER;
        } else
            return Ordering.EQUAL;
    }
}
