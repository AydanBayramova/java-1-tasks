package Module0.CharApp.Lesson1.Questions.arrays;

public class arrays6 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{2,3,4}};
        int b[][]={{2,3,5},{5,7,8}};
        int c[][]=new int[2][3];
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
