package quadratic_equation;

import org.xml.sax.EntityResolver;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();*/

        Solution solve1 = new Solution();
        double[] solution = solve1.solve(0,2,3);
        System.out.println(Arrays.toString(solution));

    }
}
