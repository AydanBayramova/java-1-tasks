package module01.Practice.HashCode;

import java.util.Objects;

public class hasccode {
    private static String name;
   public static  int count;
    private  String surname;

    public hasccode(String name, String surname) {
        this.name = name;
        this.surname = surname;
        count++;
    }
    public hasccode(String name) {
        this.name = name;
        count++;
    }

    @Override
    public String toString() {
        return "hasccode{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hasccode hasccode = (hasccode) o;
        return Objects.equals(name, hasccode.name) && Objects.equals(surname, hasccode.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
    public static void sayHello(){
        System.out.println("dgduhwgdw");
        System.out.println(name);

    }
    public  void sayBye(){
        System.out.println("bye");
        System.out.println(name);
        int age;
    }
}
