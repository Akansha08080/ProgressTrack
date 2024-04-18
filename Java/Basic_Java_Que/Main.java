interface Calculation {
    int performSquare(int num);
}

class Calculator implements Calculation {
    @Override
    public int performSquare(int num) {
        return num * num;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.performSquare(8);
        System.out.println("Square of 8 is: " + result);
    }
}
