import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter number1: ");
        float num1 = input.nextFloat();
        System.out.println("pls enter number2: ");
        float num2 = input.nextFloat();

        float sum = num1 + num2;

        System.out.println("sum is: " + sum);



    }
}
