import java.util.Scanner;

public class greetingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = input.nextLine();

        System.out.println("asalaamu alaikum" + " " + name);
    }
}
