package String;

public class SB{
    public static void main(String[] args) {
        // only one obj is made and the changes done in the one obj only
        // ITS A seperate class
        StringBuilder  builder  = new StringBuilder();
        for ( int i = 0; i <26; i++){
            char ch = (char)('a'+i);
            builder.append(ch);//its mutable
        }


        System.out.println(builder.toString());


    }

}
