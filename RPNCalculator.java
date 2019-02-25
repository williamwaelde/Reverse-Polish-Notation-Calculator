package PisHau3;

public interface RPNCalculator {

    public String stackPusher(int a);

    public String delTopElement();

    public String clearStack();

    public int showTopStack();

    public String calcOp(char a) throws IllegalArgumentException;
}