package UnitTesting;

public class Calculator {
    public int add(int number1, int number2) {
        // Enter your code here
        return number1 + number2;
    }

    public int sub(int number1, int number2) {
        // Enter your code here
        return number1 - number2;
    }

    public int mul(int number1, int number2) {
          // Enter your code here
        return number1 *number2;
    }

    // Integer divide. Return a truncated int.
    public int divInt(int number1, int number2) throws IllegalArgumentException{
         // Enter your code here
        if (number2 == 0) {
            throw new IllegalArgumentException();
        }

        return number1 / number2;
    }
}

