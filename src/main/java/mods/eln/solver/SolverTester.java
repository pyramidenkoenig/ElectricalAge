package mods.eln.solver;

import java.util.Scanner;

public class SolverTester {
    public static void main(String[] args) {
        Equation equation = new Equation();
        equation.setIterationLimit(100);
        equation.setUpDefaultOperatorAndMapper();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String expression = scanner.nextLine();
            //String expression = "25%5";
            equation.preProcess(expression);
            System.out.println("Equation Valid?: " + equation.isValid());
            if (equation.isValid()) {
                System.out.println("Value: " + equation.getValue(1));
            }
        }
    }
}
