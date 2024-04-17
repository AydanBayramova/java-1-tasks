//package module01.Part02.Exception.lab2;
//
//import java.io.File;
//import java.util.Scanner;
//
//public class lab1 {
//    public static String inputString() throws Exception {
//
//        File file = new File("C:\\Users\\aydan\\IdeaProjects\\java-course-turing-1-classes\\src\\main\\java\\module01\\Part02\\Exception\\lab2");
//      String words=" "
//        Scanner scanner = new Scanner(file);
//        String word = scanner.next();
//        scanner.close();
//        return word;
//    }
//
//    public static int computeSequence(String input) {
//
//        String input = String.valueOf(input.length() - 1);
//        int inputNumbers1 = Integer.parseInt(inputNumbers);
//
//        try {
//            for (int i = 0; i < inputNumbers1; i++) {
//                int input1 = Integer.parseInt(input);
//                if (input1 % 100 == 0) {
//                    input1 += input1;
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("exception error");
//        }
//    }
//}
