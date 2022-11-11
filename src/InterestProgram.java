import java.util.Scanner;

public class InterestProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter principal: ");
        int prin = input.nextInt();
        System.out.print("enter time: ");
        int time = input.nextInt();
        System.out.print("enter RATE: ");
        int rate = input.nextInt();

        int sInterest = prin * time * rate;
        System.out.println("simple interest is:  " + sInterest);


    }
}
