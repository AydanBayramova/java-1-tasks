package Quizes.Quiz6;


import java.util.Objects;

class Person2 {
    private String name;

    public Person2(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
//    public boolean equals(Object object){
//        if (object instanceof Person2){
//            Person2 person;
//            person = (Person2)object;
//            return this.name.equals(person.name);
//        }
//        return false;
//    }
}
public class fourth {

    public static void main(String[] args) {
        Person2 person1=new Person2("Osman");
        Person2 person3=new Person2("Osman");
        Person2 person4=person1;
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person4));
        System.out.println(person1==person3);
        System.out.println(person1==person4);
    }}
