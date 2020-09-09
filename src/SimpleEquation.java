import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constant:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0){
            double solution = (c - b) / a;
            System.out.printf("the solution is: %f!\n" , solution);
        }
        else {
            if (b == 0){
                System.out.printf("countless solution");
            } else {
                System.out.println("no solution");
            }
        }
    }
}
