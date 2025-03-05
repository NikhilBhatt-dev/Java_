import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//
//        int a =5;
//        int b =7;
//        int c =2;
//        int sum  = a+b+c    ;
//        {
//            System.out.println(sum);
//        }
//    }
//}c
//


///calculate CGP of three subject

//
//        double subject1 = 45;
//        double subject2 = 95;
//        double subject3 = 48;
//        double cgpa = (subject3 + subject1 + subject2) / 30;
//        System.out.println(cgpa);
//
//    }
//}


/// enter name and say hello

//
//        System.out.println("enter your name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("hello"  +  name   + "have a good name");
//    }
//}


///check is it int

//
//        System.out.println("enter your number");
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println(sc.hasNextInt());
//    }
//    }
//


///    kilo meter  to mile
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the distance in kilometers: "); // Prompt user for input
        float kilometers = sc.nextFloat();  // Read user input

        // Convert kilometers to miles
        float miles = kilometers * 0.621371f;

        // Display result
        System.out.println(kilometers + " km is equal to " + miles + " miles");

        sc.close();  // Close scanner
    }
}