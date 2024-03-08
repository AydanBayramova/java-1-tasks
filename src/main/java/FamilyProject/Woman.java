package FamilyProject;

import java.util.Date;

public class Woman extends Human {
    public Woman(String name, String surname, Date birthDate, double iqLevel, String[][] schedule, Family family) {
        super(name, surname, birthDate, iqLevel, schedule, family);
    }

    public Woman(String name, String surname, Date birthDate, double iqLevel, String[][] schedule) {
        super(name, surname, birthDate, iqLevel, schedule);
    }

    public Woman(String name, String surname, Date birthDate) {
        super(name, surname, birthDate);
    }

    public void makeup() {
        System.out.println("woman likes makeup");
    }

    @Override
    public void greetPet() {
        super.greetPet();
        System.out.println("woman feed her pet 3 times during the day");
    }
}
