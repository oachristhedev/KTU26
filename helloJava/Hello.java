
public class Hello {

    public static void main(String[] args) {

        // "String" is used for text values such as a student's name
        String fullName = "Christopher Abuenyi Odoom";

        // "int" is used for whole numbers without decimal places such as a student's age 
        int age = 25;

        // "char" is used for single characters such as a student's gender
        char gender = 'M';

        // "double" is used for decimal numbers such as a student's height
        double height = 1.75;

        // "double" is used for decimal numbers such as a student's weight
        double weight = 70.5;

        // "boolean" is used for true or false values such as a student's status
        boolean isStudent = true;

        // "long" is used for long whole numbers such as a student's phone number. 
        // NB: Long values must always end with "L" to indicate that they are long values.
        long phoneNumber = 233545801717L;

        // "int" is used for whole numbers without decimal places such as a student's level.
        int level = 200;

        // "String" is used for text values such as a student's name
        String studentID = "04/2024/2197D";

        System.out.println("PERSONAL INFORMATION PROGRAM");
        System.out.println("--------------------------------------------");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Student Status: " + isStudent);
        System.out.println("Phone Number: " + "+" + phoneNumber);
        System.out.println("Level: " + level);
        System.out.println("Student ID: " + studentID);

    }
}
