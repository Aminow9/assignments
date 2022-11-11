import java.sql.SQLOutput;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number to check: ");
        int num = input.nextInt();

        int PN= num;

        int rev = 0;

        while (num!= 0)
        {
            rev = rev*10 + num%10;
            num = num / 10;
        }

        if (PN== rev) {
            System.out.println("number is palindrome");
        }

        else {
            System.out.println("number is not palindrom");
        }
    }



}
