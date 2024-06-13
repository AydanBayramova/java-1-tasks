package w3rsources.strings;

public class unicodeCount {
    public static void main(String[] args) {
        String original="helloo";
        int start=0;
        int end=5;
        int codePoint=original.codePointCount(start,end);
        System.out.println(codePoint);
    }
}
