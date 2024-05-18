package module01.Part02;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Objects;

public class SrudentTask {
    public static final String FILE_PATH ="C:\\Users\\aydan\\IdeaProjects\\java-course-turing-1-classes\\src\\main\\java\\module01\\Part02\\Task\\resource";

    private int id;
    public int MAX_VALUE=0;
    private int age;
    private  int grade;
    private String name;

    public SrudentTask(int id, int age, int grade, String name) {
        this.id = ++MAX_VALUE;
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        ArrayList<SrudentTask> task=new ArrayList<>();
        SrudentTask task1=new SrudentTask(2,12,9,"aydan");
        task.add(task1);

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SrudentTask that = (SrudentTask) o;
        return id == that.id && MAX_VALUE == that.MAX_VALUE && age == that.age && grade == that.grade && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, MAX_VALUE, age, grade, name);
    }

    @Override
    public String toString() {
        return "SrudentTask{" +
                "id=" + id +
                ", MAX_VALUE=" + MAX_VALUE +
                ", age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
