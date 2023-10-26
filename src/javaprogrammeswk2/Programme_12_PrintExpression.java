package javaprogrammeswk2;

/**
 * Write a java program to compute the specified expression and print the output
 * Test Data:
 * ((25.5*3.5-3.5*3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Programme_12_PrintExpression {
    public static void main(String[] args) {
        Programme_12_PrintExpression t = new Programme_12_PrintExpression();
        t.printExpression();
    }

    // Printing expression
    public void printExpression() {
        double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);
    }
}

