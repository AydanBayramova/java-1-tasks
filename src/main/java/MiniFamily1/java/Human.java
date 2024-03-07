//package MiniFamily1.java;
//
//import java.util.Arrays;
//
//public class Human  {
//    private String name;
//    private String surname;
//    private int year;
//    private int iq;
//    Pet pet;
//    Human mother;
//    Human father;
//    String[][] schedule;
//
//    public Human(String name, String surname, int year, int iq) {
//        this.name = name;
//        this.surname = surname;
//        this.year = year;
//        this.iq = iq;
//    }
//
//    public Human(String name, String surname, int year) {
//
//        this.name = name;
//        this.surname = surname;
//        this.year = year;
//    }
//
//    public Human() {
//
//    }
//
//    @Override
//    public String toString() {
//        return "Human{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", year=" + year +
//                ", iq=" + iq +
//                ", pet=" + pet +
//                ", mother=" + mother +
//                ", father=" + father +
//                ", schedule=" + Arrays.toString(schedule) +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getIq() {
//        return iq;
//    }
//
//    public void setIq(int iq) {
//        if (iq > 0 && iq < 100) {
//            this.iq = iq;
//        }
//    }
//
//    public String greetPet() {
//        return "hello" + pet.getNickname();
//    }
//
//    public void describePet() {
//        String slyLevel = (pet.getTricklevel() > 50) ? "very sly" : "almost not sly";
//        System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old, he is " + slyLevel + " (" + pet.getTricklevel() + ")");
//
//    }
//
//
//}
