package module01.Part02.genericss;

import java.util.Optional;
public class OptionalExample {
    public static void main(String[] args) {
        String[] str = new String[6];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // It Checks, value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("String value is not present");
    }
}
