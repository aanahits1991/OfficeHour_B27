package day03_07_06_2022;

public class Calculator {
    public static void main(String[] args) {
        /*

              Task 1: Get two numbers and operator


                   Create simple calculator
                    case 1 +
                    case 2 *
                    case 3 -
                    case 4 /
                    default:

         */

        int num1 = 10;
        int num2 = 14;
        char ch = '+';
        double result = 0;

        switch (ch) {

            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
            case'&':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result=0;
                System.err.println("invalid operator");
                break;

        }
        System.out.println("result = " + result);

    }
}
