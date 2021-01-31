import java.util.*;

public class Calculator
{
    public static void main(String [] args) {
        float num1 = 0;
        float num2 = 0;
        char sum;
        char cont;
        boolean loop = true;

        while (loop) {
            Scanner scanObject = new Scanner(System.in);

            System.out.println("Enter a number");
            num1 = scanObject.nextInt();
            System.out.println("Enter a second number");
            num2 = scanObject.nextInt();
            System.out.println("Choose a sum type (+, -, * or /)");
            sum = scanObject.next().charAt(0);

            switch (sum) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
            }
            System.out.println("Do you want to continue? y/n");

            cont = scanObject.next().charAt(0);

            switch (cont) {
                case 'n':
                    loop = false;
                    break;
                default:
                    loop = true;
            }
        }

    }
}