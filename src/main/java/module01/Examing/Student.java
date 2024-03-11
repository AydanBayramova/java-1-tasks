package module01.Examing;

public abstract class Student extends Person{
//    private double grade;
    public Student(String name, String surname) {
        super(name, surname);
//        this.grade=grade;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "grade=" + grade +
//                '}';
//    }

    @Override
    public void introduce() {
        System.out.println("hello,student");
    }
    public void speak(){
        System.out.println("i speak");
    }

}
