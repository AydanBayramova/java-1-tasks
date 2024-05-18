package module01.Part02.filesWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Files {
    private  static final List<Student> STUDENTS=new ArrayList<>();
    public static void main(String[] args) {
        Student aydan = new Student(20, "Aydan", 88);
        System.out.println(addStudent(aydan));
        Student aydan1 = new Student(19, "Aydan", 88);
        System.out.println(addStudent(aydan1));
        System.out.println(STUDENTS);
    }

    private static long addStudent(Student student) {
        STUDENTS.add(student);
        return  student.id;
    }

    static final   class Student{
        private  static  long MAX_INDEX=0;
    public  long id;
    public final   int age;
    public  final  String name;
    public  final double grade;

        public Student( int age, String name, double grade) {
            this.age = age;
            this.name = name;
            this.grade = grade;
            this.id = ++MAX_INDEX;
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
