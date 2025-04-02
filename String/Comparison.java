package String;

public class Comparison {
    public static void main(String[] args) {
        String a = "nikhil";
        String b = "nikhil";
        System.out.println(a == b); // true (string literals are interned)

        String name1 = new String("nikhil");
        String name2 = new String("nikhil");
        System.out.println(name1 == name2); // false (different objects in heap)

        System.out.println(name1.equals(name2));//true
//        returns true because .equals() checks content (the actual characters in the string) rather than memory reference.
    }
}