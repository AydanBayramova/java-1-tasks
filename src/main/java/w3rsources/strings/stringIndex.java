package w3rsources.strings;

public class stringIndex {
    public static void main(String[] args) {
        String original="Java Exercises!";
        for (int i = 0; i <original.length(); i++) {
            char ch=original.charAt(i);
            System.out.println("char at "+i+" index is: "+ch);
        }
    }
}
