package FamilyProject;

import java.util.Date;

public class Man extends Human {
    public Man(String name, String surname, Date birthDate, double iqLevel, String[][] schedule, Family family) {
        super(name, surname, birthDate, iqLevel, schedule, family);
    }

    public Man(String name, String surname, Date birthDate, double iqLevel, String[][] schedule) {
        super(name, surname, birthDate, iqLevel, schedule);
    }

    public Man(String name, String surname, Date birthDate) {
        super(name, surname, birthDate);
    }

    @Override
    public void greetPet() {
        super.greetPet();
        System.out.println("man like eat his pet");
    }

    public void repairCar() {
        System.out.println("Man like car collection");
    }
}
