package FamilyProject;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private Date birthDate;
    ;
    private double iqLevel;
    Pet pet;
    Human mother;
    Human father;
    private String schedule[][];

    public Human(String name, String surname, Date birthDate, double iqLevel, Pet pet, Human mother, Human father, String schedule[][]) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iqLevel = iqLevel;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getIqLevel() {
        return iqLevel;
    }

    public void setIqLevel(double iqLevel) {
        if (iqLevel > 0 && iqLevel < 100) {
            this.iqLevel = iqLevel;
        }
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello," + pet.getNickname());
    }

    public void describePet() {
        String slyLevel = (pet.getTrickLevel() >= 50) ? "very sly" : "almost not sly";
        System.out.println("I have an" + pet.getSpecies() + "  is" + pet.getAge() + " years old, he is" + slyLevel + "he is level." + pet.getTrickLevel());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", iqLevel=" + iqLevel +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    public Human(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(String name, String surname, Date birthDate, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.mother = mother;
        this.father = father;
    }

    public Human() {

    }

    public boolean feedPet() {
        boolean isFeeding = false;
        if (!isFeeding) {
            System.out.println("Hm... I will feed " + this.name + "'s " + pet.getSpecies());
            pet.foul();
            return true;
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            if (pet.getTrickLevel() > randomNumber) {
                System.out.println("Hm... I will feed " + this.name + "'s " + pet.getSpecies());
                pet.foul();
                return true;
            } else {
                System.out.println("I think " + this.name + " is not hungry.");
                return false;
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate == human.birthDate && Double.compare(human.iqLevel, iqLevel) == 0 && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, birthDate, iqLevel, pet, mother, father);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}