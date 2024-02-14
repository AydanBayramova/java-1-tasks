package Module0.CharApp.Lesson1.Questions.arrays;

public class arraysMatrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{2,4,6},{7,8,9}};
        int b[][]={{2,5,7},{6,8,0},{6,7,8}};
        int c[][]=new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    c[i][j]=a[i][k]+b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
