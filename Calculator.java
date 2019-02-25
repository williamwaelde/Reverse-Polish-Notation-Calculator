package PisHau3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Calculator implements RPNCalculator {

    //Stack for all rpn calculations
    Stack<Integer> stack = new Stack<>();
    //Map for opertations with: +, -, *, /
    Map<Character, IntBinaryOperator> mapBinary = new HashMap<>();
    //Map for opertations with singn change (n), factorial(!)
    Map<Character, IntUnaryOperator> mapUnary = new HashMap<>();

    //Konstruktor for Calculator
    //Fills Hashmaps with key (char) und value(lambda expression or calls method)
    public Calculator() {
        mapBinary.put('+', (x, y) -> x + y);
        mapBinary.put('-', (x, y) -> x - y);
        mapBinary.put('*', (x, y) -> x * y);
        mapBinary.put('/', (x, y) -> x / y);
        mapUnary.put('n', (x) -> signChange());
        mapUnary.put('!', (x) -> factorial());
    }

    //method for pushing elements to stack
    //returns a notification about the pushed Number
    @Override
    public String stackPusher(int a) {
        stack.push(a);
        String numberAsString = "Pushed to Stack: " + Integer.toString(a);
        return numberAsString;
    }

    //calculator operation (+, -, *, /, !, n)
    //checks if there is an UnaryOperator or BinaryOperator
    //checks if Stack is empty or if size is bigger tahn two
    //checks if there is an division with zero
    @Override
    public String calcOp(char a) throws IllegalArgumentException {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("Stack is empty!");
        } else if (stack.size() > 2) {
            throw new IllegalArgumentException("Max Stacksize is: 2 Elements!");
        } else if (mapUnary.containsKey(a)) {
            int x = stack.peek();
            int result = mapUnary.get(a).applyAsInt(x);
            stack.push(result);
        } else {
            int y = stack.pop();
            int x = stack.pop();
            if (y == 0) {
                throw new IllegalArgumentException("Division by zero is forbidden!");
            }
            int result = mapBinary.get(a).applyAsInt(x, y);
            stack.push(result);
        }
        String text = "Calculation with: ";
        return text + a;
    }

    //method for deleting all Stack Elements
    //returns a notification
    public String clearStack() {
        stack.clear();
        String a = "All Stack Elements Deleted";
        return a;
    }

    //delete top Element of stack
    //returns a notification
    public String delTopElement() {
        stack.pop();
        String a = "Top Element of Stack deleted";
        return a;
    }

    //show top Element of Stack
    //returns top Element as int
    public int showTopStack() {
        return stack.peek();
    }

    //method for changing +/-
    public int signChange() {
        int a = stack.pop();
        a *= -1;
        return a;
    }

    //method for factorial operation
    public int factorial() {
        int n = stack.pop();
        int a = 1;
        for (long i = 1; i <= n; i++) {
            a *= i;
        }
        return a;
    }
}