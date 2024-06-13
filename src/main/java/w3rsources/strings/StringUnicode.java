package w3rsources.strings;

public class StringUnicode {
    public static void main(String[] args) {
        String original="w3resource.com ";
        for(int i=0;i<original.length();i++){
            char ch=original.charAt(i);
            int unicodeValue = (int) ch;
            System.out.println(unicodeValue);
        }
    }
}
