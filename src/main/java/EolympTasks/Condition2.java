package EolympTasks;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();


        if (x < Math.pow(-10, 4) || x > Math.pow(10, 4)) {
            if (x >= 10) {
                System.out.println( (int) (Math.pow(x, 3) + 5 * x));
            } else {
                System.out.println( (int) (Math.pow(x, 2) - 2 * x + 4));
            }
        }
//        int y=0;  //=(int) (Math.pow(x, 3) + 5 * x) || (int) (Math.pow(x, 2) - 2 * x + 4);
//        if (x<=10 ? y==(int) (Math.pow(x, 3) + 5 * x): y==(int) (Math.pow(x, 2) - 2 * x + 4)){
//            System.out.println(y);
//        }

//        import java.util.Scanner;
//        public class Condition2 {
//            public static void main(String[] args) {
//                int x = new Scanner(System.in).nextInt();
//                int y;
//                if (x >= 10) {
//                    y = (int) (Math.pow(x, 3) + 5 * x);
//                } else {
//                    y = (int) (Math.pow(x, 2) - 2 * x + 4);
//                }
//                System.out.println(y);
//            }
//        }

    }
}
