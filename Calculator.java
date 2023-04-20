import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            try {
                double num1, num2, result;
                String operator;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the first no : ");
                num1 = scanner.nextDouble();

                System.out.println("Enter the second no :");
                num2 = scanner.nextDouble();

                System.out.println("Kindly enter the operator : ");
                operator = scanner.next();

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        System.out.println("Result : " + result);
                        break;

                    case "-":
                        result = num1 - num2;
                        System.out.println("Result : " + result);
                        break;

                    case "*":
                        result = num1 * num2;
                        System.out.println("Result : " + result);
                        break;

                    case "/":
                        if (num2 == 0) {
                            System.out.println("Denominator can not be zero ");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result : " + result);
                        }
                        break;
                    default:
                        System.out.println("Invalid Operator");
                }
                int tryAgain;
                System.out.println("Do you want to try again ? Press 1 for YES and 2 for NO ");
                tryAgain=scanner.nextInt();
                switch (tryAgain){
                    case 1 :
                        System.out.println(" Great, let's do it again!");
                        break;
                    case 2 :
                        System.out.println(" Sure!");
                        System.exit(0);
                    default:
                        System.out.println(" Invalid input ");
                        System.exit(0);
                }
            } catch (InputMismatchException e) {
                System.out.println("Kindly enter a natural number");
            }
            catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
