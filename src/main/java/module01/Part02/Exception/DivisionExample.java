//package module01.Part02.Exception;
//
//import java.io.IOException;
//import java.util.InputMismatchException;
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//public class DivisionExample { // Renamed class
//
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////
////        int a, b;
////
////        try {
////            System.out.print("Enter the first integer: ");
////            a = scanner.nextInt();
////
////            System.out.print("Enter the second integer: ");
////            b = scanner.nextInt();
////
////            System.out.println("The result is: " + (double) a / b); // Cast to double for non-integer results
////        } catch (InputMismatchException e) {
////            System.out.println("Please enter valid integers only.");
////        } catch (ArithmeticException e) {
////            System.out.println("Division by zero is not allowed.");
////        }
////
////        System.out.println("Program execution continues..."); // Optional: Indicate program continues
////    }
//
//    public static void main(String[] args) throws ArithmeticException, IOException {
//        int a = 10, b = 0;
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//          //  throw new ArithmeticException("errorjjj");
//            System.out.println("error");
//        }
//        fall(2);
//    }
//static void fall(int distance) throws Exception {
// try {
//     if(distance > 10) {
//         throw new RuntimeException();
//     }
// }catch (IOException e){
//   e.printStackTrace();
// }
//    System.out.println("method finished");
//}
//
//
//}
