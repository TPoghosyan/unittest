package quadratic_equation;

import java.sql.Array;

public class Solution {

    public double[] solve(double a, double b, double c) {
        double[] array = new double[2];
        double determinant = b * b - 4.0 * a * c;
        /*if (a==0 && b==0 && c==0){
             array[0] = Double.POSITIVE_INFINITY;
            array[1] = Double.NEGATIVE_INFINITY;
           return array;}*/
        if (a != 0) {
            if (determinant > 0.0) {
                array[1] = (-b + Math.sqrt(determinant)) / (2.0 * a);
                array[0] = (-b - Math.pow(determinant, 0.5)) / (2.0 * a);
                return array;
            } else if (determinant == 0.0) {
                array[0] = -b / (2.0 * a);
                array[1] = -b / (2.0 * a);
                return array;
            } else {
                array[0] = 0.0 / 0;
                array[1] = 0.0 / 0;
                return array;
            }
        } else {
            array[0] = -c / b;
            array[1] = -c / b;
            return array;
        }
        }}





       /* double x;
        if (a == 0) {
            x = -c / b;
            return x;
        } else if (b == 0) {
            if (c > 0) {
                return -1111111111;
            } else {
                x = Math.sqrt(-c);
                return x;
            }

        } else if (c == 0) {
            x = -b / a;
            return x;
        } else {
            double d = (b * b) - (4 * a * c);
            x = (-b + Math.sqrt(d)) / (2 * a);
            return x;
        }

    }*/


