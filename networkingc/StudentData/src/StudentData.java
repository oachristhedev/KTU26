import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                //Collect student information
                System.out.print("Enter Full Name: ");
                String fullName = input.nextLine();

                System.out.print("Enter Index Number: ");
                String indexNumber = input.nextLine();

                System.out.print("Enter Age:");
                int age = input.nextInt();
                input.nextLine();

                System.out.print("Enter Gender: ");
                String gender = input.nextLine();

                System.out.print("Enter Department: ");
                String department = input.nextLine();

                System.out.print("Enter level: ");
                int level = input.nextInt();

                System.out.print("Enter GPA: ");
                double gpa = input.nextDouble();

                //Determine adult status
                String adultStatus;

                if (age >= 18) {
                    adultStatus = "YES";
                } else {
                    adultStatus = "NO";
                }

                // Determine academic classification
                String academicClass;

                if (gpa >= 3.5 && gpa <= 4.0) {
                    academicClass = "First Class";
                } else if (gpa >= 3.0) {
                    academicClass = "Second Class Upper";
                } else if (gpa >= 2.5) {
                    academicClass = "Second Class Lower";
                } else {
                    academicClass = "Pass";
                }

                System.out.println();
                // Display student profile
                System.out.println("===== STUDENT PROFILE =====");
                System.out.println("Name: " + fullName);
                System.out.println("Index: " + indexNumber);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
                System.out.println("Department: " + department);
                System.out.println("Level: " + level);
                System.out.println("GPA: " + gpa);
                System.out.println("Adult Status: " + adultStatus);
                System.out.println("Academic Class: " + academicClass);
                System.out.println("===========================");

            }


        }
