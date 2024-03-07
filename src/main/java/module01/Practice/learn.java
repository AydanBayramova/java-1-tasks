package module01.Practice;

import java.util.Arrays;

public final class learn {
    final private String name;
    final private int age;
    final private double grade[];

    public learn(String name, int age, double[] grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getGrade() {
        double[] toarrays = new double[grade.length];
     System.arraycopy(grade,0,toarrays,0,grade.length);
        return toarrays;
    }

    @Override
    public String toString() {
        return "learn{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + Arrays.toString(grade) +
                '}';
    }
}
