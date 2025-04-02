package String;

import java.util.ArrayList;
public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
//        'a' and 'b' are characters, and in Java, characters are internally represented as ASCII (Unicode) values:

        System.out.println("a"+"b");
//        "a" and "b" are strings, and + acts as a string concatenation operator.

        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        System.out.println("a" + 'a');
//        When a String is concatenated (+) with a number, Java converts the number into a String and performs string concatenation
        System.out.println("nikhil" + new ArrayList<>());
//       "nikhil" is a String.
//      new ArrayList<>() creates a new empty ArrayList object.
//      The + operator is used with a String and a non-String object (ArrayList).



//        System.out.println(new ArrayList<>()+new Integer(66));// Compilation Error!
//        Java does not support the + operator between two objects unless at least one operand is a String.



        System.out.println(new ArrayList<>() + "" + new Integer(66));


    }

}

// only one obj is made and the changes done in the one obj only
// ITS A seperate class