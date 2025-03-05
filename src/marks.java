import java.util.Scanner;  // Import Scanner class

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a single Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name + " wlc");

        // Taking marks input
        System.out.print("Enter your 1st subject marks: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter your 2nd subject marks: ");
        int marks2 = sc.nextInt();

        System.out.print("Enter your 3rd subject marks: ");
        int marks3 = sc.nextInt();

        System.out.print("Enter your 4th subject marks: ");
        int marks4 = sc.nextInt();

        // Calculate total and percentage
        int total = marks1 + marks2 + marks3 + marks4;
        double percentage = (total / 400.0) * 100;  // Convert to percentage

        // Determine grade using if-else conditions
        String grade;
        if (percentage >= 90) {
            grade = "A+";
            System.out.println( "congratulations "+ name + "you got"+grade+"grade" );

        } else if (percentage >= 80) {
            grade = "A";
            System.out.println( "congratulations "+ name + "you got"+grade+"grade" );

        } else if (percentage >= 70) {
            grade = "B";
            System.out.println( "congratulations "+ name + "you got"+grade+"grade" );

        } else if (percentage >= 60) {
            grade = "C";
            System.out.println( "congratulations "+ name + "you got"+grade+"grade" );

        } else if (percentage >= 50) {
            grade = "D";
            System.out.println( "congratulations"+ name + "you got" + grade + "grade" );

        } else {
            grade = "Fail";
            System.out.println( "shit "+ name + "you got" + grade + "grade" );

        }

        // Display results
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();  // Close the scanner
    }
}
