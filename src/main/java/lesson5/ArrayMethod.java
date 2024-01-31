package lesson5;

public class ArrayMethod {
    public static void main(String[] args) {
        arrayChars(new char[]{'a','b','c'});

    }
    public static void arrayChars(char arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
