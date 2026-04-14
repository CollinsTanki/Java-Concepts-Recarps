import java.util.Scanner;

public class InputOutputViaConsole {
    public static void main(String [] args) {
        // Create scanner
        // and ask user for input
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name");
        String userInput = in.nextLine();
        //Print user's name
        System.out.print("Hello!, "+userInput);

    }
}

