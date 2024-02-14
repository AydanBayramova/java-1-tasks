package module01.lessson2;

public class GradeApp {
    public static void main(String[] args) {
        Grade grade1 = new Grade(90, "aa", 20);
        Grade grade2 = new Grade(80, "80", 23);
        Grade grade3 = new Grade(95, "cc", 25);

        Grade[] grades = {grade1, grade2, grade3};

        int max = grades[0].grade;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i].grade > max) {
                max = grades[i].grade;
            }
        }
        System.out.println("The biggest Grade: " + max);
    }
}
