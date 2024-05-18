package FinalExam.StudentApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentApp {
    private static  final List<Student> STUDENTS=new ArrayList<>();
    public static void main(String[] args) {
        Student a = new Student(25, "A", 89);
        Student b = new Student(28, "b", 99);
        System.out.println(addStudent(a));
    }

    private static long addStudent(Student a) {
        STUDENTS.add(a);
        return a.id;
    }


    static final  class Student{
        private  static    long MAX_INDEX=0;
        public long id;
        public  final int age;
        public final  String name;
        public  final  double grade;

        public Student( int age, String name, double grade) {
            this.id = ++MAX_INDEX;
            this.age = age;
            this.name = name;
            this.grade = grade;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && age == student.age && Double.compare(student.grade, grade) == 0 && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, age, name, grade);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", age=" + age +
                    ", name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }
}
