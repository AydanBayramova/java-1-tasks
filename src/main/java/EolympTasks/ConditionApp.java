package EolympTasks;

import java.util.Scanner;

public class ConditionApp {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
       int y= (int) (Math.pow(x,2)- 3 * x + 4);
  if (x >= -1000 && x <= 1000){
      if (x < 5) {
          System.out.println(y);
      } else if (x >= 5) {
          System.out.println(x + 7);
      }
  }
    }
}