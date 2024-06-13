package w3rsources.strings;

public class StringLexologyTask {
    public static void main(String[] args) {
        String firstText = "This is Exercise1";
        String secondText = "This is Exercise2";
        int result = firstText.compareTo(secondText);

        if (result > 0) {
            System.out.println("First string is lexicographically greater than the second string.");
        } else if (result < 0) {
            System.out.println("Second string is lexicographically greater than the first string.");
        } else {
            System.out.println("Both strings are lexicographically equal.");
        }
    }
}
