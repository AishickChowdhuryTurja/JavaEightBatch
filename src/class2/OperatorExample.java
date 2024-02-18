package class2;


public class OperatorExample {

    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        arithmeticOperators.performArithmeticOperations();

        RelationalOperators relationalOperators = new RelationalOperators();
        relationalOperators.performRelationalOperations();

        LogicalOperators logicalOperators = new LogicalOperators();
        logicalOperators.performLogicalOperations();

        UnaryOperators unaryOperators = new UnaryOperators();
        unaryOperators.performUnaryOperations();

        TernaryOperator ternaryOperator = new TernaryOperator();
        ternaryOperator.performTernaryOperation();

        AssignmentOperators assignmentOperators = new AssignmentOperators();
        assignmentOperators.performAssignmentOperations();
    }
}

class ArithmeticOperators {

    public void performArithmeticOperations() {
        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}

class RelationalOperators {

    public void performRelationalOperations() {
        int x = 10, y = 20;

        System.out.println("Is x equal to y? " + (x == y));
        System.out.println("Is x not equal to y? " + (x != y));
        System.out.println("Is x greater than y? " + (x > y));
        System.out.println("Is x less than y? " + (x < y));
        System.out.println("Is x greater than or equal to y? " + (x >= y));
        System.out.println("Is x less than or equal to y? " + (x <= y));
    }
}

class LogicalOperators {

    public void performLogicalOperations() {
        boolean p = true, q = false;

        System.out.println("Logical AND: " + (p && q));
        System.out.println("Logical OR: " + (p || q));
        System.out.println("Logical NOT for p: " + (!p));
        System.out.println("Logical NOT for q: " + (!q));
    }
}

class UnaryOperators {

    public void performUnaryOperations() {
        int num = 5;

        System.out.println("Original value of num: " + num);
        System.out.println("Post-increment: " + (num++));
        System.out.println("After post-increment, num is: " + num);
        System.out.println("Pre-increment: " + (++num));
        System.out.println("After pre-increment, num is: " + num);
        System.out.println("Unary minus: " + (-num));
        System.out.println("Unary plus: " + (+num));
    }
}

class TernaryOperator {

    public void performTernaryOperation() {
        int x = 10, y = 20;

        int result = (x > y) ? x : y;

        System.out.println("Maximum value between x and y: " + result);
    }
}

class AssignmentOperators {

    public void performAssignmentOperations() {
        int a = 5;

        System.out.println("Original value of a: " + a);

        a += 3;
        System.out.println("After a += 3, a is: " + a);

        a -= 2;
        System.out.println("After a -= 2, a is: " + a);

        a *= 4;
        System.out.println("After a *= 4, a is: " + a);

        a /= 2;
        System.out.println("After a /= 2, a is: " + a);

        a %= 3;
        System.out.println("After a %= 3, a is: " + a);
    }
}
