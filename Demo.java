package PisHau3;

public class Demo {
    public static void main(String[] args) {

        RPNCalculator c1 = new Calculator();

        System.out.println("\n" + "******* Welcome to the RPNCalculator DEMO *******" + "\n");
        System.out.println("\n" + "******* Version 2.0 *******" + "\n");

        System.out.println("\n" + "Note: " + "\n");
        System.out.println("- Stack max size: 2 Elments." + "\n");
        System.out.println("- Result of opreration is top Element in Stack." + "\n");

        System.out.println("\n" + "Full Commandlist: " + "\n");
        System.out.println("c1.stackPusher(Element to push on Stack)");
        System.out.println("c1.showTopStack()");
        System.out.println("c1.clearStack()");
        System.out.println("c1.delTopElement()");
        System.out.println("c1.calcOp('+')");
        System.out.println("c1.calcOp('-')");
        System.out.println("c1.calcOp('*')");
        System.out.println("c1.calcOp('/')");
        System.out.println("c1.calcOp('!')");
        System.out.println("c1.calcOp('n')");

        System.out.println("\n" + "Illegal Argument Exceptions: " + "\n");
        System.out.println("Stack is empty!");
        System.out.println("Max Stacksize is: 2 Elements!");
        System.out.println("Division by zero is forbidden!");

        System.out.println("\n" + "Pushing Elements on Stack: 20 & 80" + "\n");
        System.out.println(c1.stackPusher(20));
        System.out.println(c1.stackPusher(80));

        System.out.println("\n" + "Show Top Element of Stack:");
        System.out.println("Result: " + c1.showTopStack() + "\n");

        System.out.println("Remove Top Element of Stack and show new Top:");
        System.out.println(c1.delTopElement());

        System.out.println("New Top Element: " + c1.showTopStack() + "\n");

        System.out.println("Clear Stack: with method c1.clearStack()");
        System.out.println(c1.clearStack());

        System.out.println("\n" + "Addition with two Integer: 20, 4 +");
        System.out.println(c1.stackPusher(20));
        System.out.println(c1.stackPusher(4));
        System.out.println(c1.calcOp('+'));

        System.out.println("Result: " + c1.showTopStack() + "\n");
        c1.clearStack();

        System.out.println("Subtraction with two Integer: 20, 4 -");
        System.out.println(c1.stackPusher(20));
        System.out.println(c1.stackPusher(4));
        System.out.println(c1.calcOp('-'));

        System.out.println("Result: " + c1.showTopStack() + "\n");
        c1.clearStack();

        System.out.println("Multiplikation with two Integer: 20, 4 *");
        System.out.println(c1.stackPusher(20));
        System.out.println(c1.stackPusher(4));
        System.out.println(c1.calcOp('*'));

        System.out.println("Result: " + c1.showTopStack() + "\n");
        c1.clearStack();

        System.out.println("Division with two Integer: 100, 4 /");
        System.out.println(c1.stackPusher(100));
        System.out.println(c1.stackPusher(4));
        System.out.println(c1.calcOp('/'));

        System.out.println("Result: " + c1.showTopStack() + "\n");
        c1.clearStack();

        System.out.println("Sign Change: 20 n ");
        System.out.println(c1.stackPusher(20));
        System.out.println(c1.calcOp('n'));

        System.out.println("Result: " + c1.showTopStack() + "\n");
        c1.clearStack();

        System.out.println("Calculation with one Integer and Factorial: 5 !");
        System.out.println(c1.stackPusher(5));
        System.out.println(c1.calcOp('!'));

        System.out.println("Result: " + c1.showTopStack() + "\n");
        c1.clearStack();


    }
}