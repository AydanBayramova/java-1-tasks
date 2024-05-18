package FinalExam.StudentApp.resources;

import FinalExam.StudentApp.BufferedWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileWrite {
//
//    public static final String RESOURCE_FOLDER="C:\\Users\\aydan\\IdeaProjects\\java-course-turing-1-classes\\src\\main\\java\\FinalExam\\StudentApp\\resources";
//     private  static  final List<FileWrite> st=new ArrayList<>();
//    public static void main(String[] args) {
//   FileStudends studend=new FileStudends(12,"Aaa",88);
//   fileWriteS(studend);
//    }
//
//    private static long fileWriteS(FileStudends studend) {
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(RESOURCE_FOLDER + "student.txt"))) {
//            bufferedWriter.write("hii");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }


    static  public class FileStudends{
        private  static    long MAX_INDEX=0;
        public long id;
        public  final int age;
        public final  String name;
        public  final  double grade;


        public FileStudends(int age, String name, double grade) {
            this.id=++MAX_INDEX;
            this.age = age;
            this.name = name;
            this.grade = grade;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FileStudends that = (FileStudends) o;
            return id == that.id && age == that.age && Double.compare(that.grade, grade) == 0 && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, age, name, grade);
        }

        @Override
        public String toString() {
            return "FileStudends{" +
                    "id=" + id +
                    ", age=" + age +
                    ", name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }
}
