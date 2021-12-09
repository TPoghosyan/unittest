package quadratic_equation;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    @org.junit.Test
    public void solveAnegative() {
        Solution number = new Solution();
        double[] current = number.solve(-2, 1, 1);
        double[] x = current;
        Arrays.sort(current);
        double[] extended = new double[2];
        extended[0]=-0.5;
        extended[1]=1;

        assertArrayEquals(current,extended,0.001);


    }

    @org.junit.Test
    public void solveAzero() {
        Solution number = new Solution();
        double[] current = number.solve(0, 1, -4);
        double extended = 4.0;
        assertEquals(current[0], extended, 0.001);
    }
        @org.junit.Test
        public void solve2() {
        Solution number = new Solution();
        double[] current = number.solve(1, 2, 1);
        double extended = -1.0;
        assertEquals(current[0], extended, 0.001);


    }@org.junit.Test
        public void nan() {
        Solution number = new Solution();
        double[] current = number.solve(1, 0, 100);
        double extended = Double.NaN;
        assertEquals(current[0], extended, 0.001);


    }


    @org.junit.Test
        public void solveAllzero() {
        Solution number = new Solution();
        double[] current = number.solve(-0, 0, 0);
        double[] x = current;
        Arrays.sort(current);
        double[] extended = new double[2];
        extended[1]=Double.POSITIVE_INFINITY;
        extended[0]=Double.NEGATIVE_INFINITY;
        assertArrayEquals(current,extended,0.001);
    }


}
