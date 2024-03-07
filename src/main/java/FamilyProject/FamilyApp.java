package FamilyProject;

import java.util.Date;

public class FamilyApp {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "Watson", new Date(1980, 0, 1));
        Human father = new Human("John", "Watson", new Date(1760, 2, 19));
        Human children = new Human("Vanilya", "Watson", new Date(1800, 2, 6), 60, new Pet("CAT", "Tom", 12, 78, new String[]{"eat,sleep,running"}), mother, father, new String[][]{
                {"Monday", "coding"},
                {"Tuesday", "reading"},
                {"Wednesday", "running"}});

        Pet pet1 = new Pet("Cat", "Tom", 10, 50, new String[]{"running", "jumping"});
        System.out.println(children);
        System.out.println(children.getIqLevel());
        pet1.foul();
        children.describePet();
        String[][] schedule = children.getSchedule();
        System.out.println(schedule[0][0]);
        System.out.println(schedule[1][1]);
        System.out.println(children.feedPet());
    }
}