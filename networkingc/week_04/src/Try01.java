import java.util.Scanner;

public class Try01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fName, lName;

        System.out.println("Enter your first name: ");
        fName = input.nextLine();

        System.out.println();

        System.out.println("Enter your last name: ");
        lName = input.nextLine();

        System.out.println();
        System.out.println(fName.charAt(0) + "." + lName.charAt(0));
    }
}
