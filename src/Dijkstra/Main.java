import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String exit = "n";
        String input;
        Equation e;

        while (exit.toLowerCase().equals("n") || exit.toLowerCase().equals("no")) {
            System.out.println("Your expression: ");
            input = in.nextLine();

            /*The boolean parameter indicates whether or not to print
            the individual mathematical operations that occur
            when solving. By default, it is true. This can be
            disabled by changing the constructor call line to:
            e = new Equation("("+input+")", false) */

            e = new Equation("("+input+")", false);
            System.out.println("Output: " + e.solve());

            System.out.println("Would you like to exit? (y/n) : ");
            exit = in.nextLine();
            

        }
        in.close();
    }
}
