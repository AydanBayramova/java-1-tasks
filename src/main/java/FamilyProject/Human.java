package FamilyProject;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private Date birthDate;
    ;
    private double iqLevel;

    private String schedule[][];
    private Family family;


    public Human(String name, String surname, Date birthDate, double iqLevel, String[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iqLevel = iqLevel;
        this.schedule = schedule;
        this.family = family;
    }
    public Human(String name, String surname, Date birthDate, double iqLevel, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iqLevel = iqLevel;
        this.schedule = schedule;

    }
    public Human(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;

    }
    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
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

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
public void welcomeFavoritePet(){
    System.out.println("This animal is your favorite"+this.getFamily().getPet());
}
public  void describefavPet(){
    System.out.println("Your favorite animal has"+this.getFamily().getPet().getHabits()+"and"+this.getFamily().getPet().getTrickLevel());
}
public  void feed(){
    System.out.println("your feed your animal"+this.getFamily().getPet());
}

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", iqLevel=" + iqLevel +
                ", schedule=" + Arrays.toString(schedule) +
                ", family=" + family +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Your information is deleted by garbage collector");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Double.compare(human.iqLevel, iqLevel) == 0 && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(birthDate, human.birthDate) && Arrays.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, birthDate, iqLevel, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}