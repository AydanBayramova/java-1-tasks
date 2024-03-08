package FamilyProject;

import java.util.Date;

public class FamilyApp {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "watson", new Date(1980, 9, 7));
        Human father = new Human("John", "Watson", new Date(1890, 9, 5));

        Family family = new Family(mother, father);
        System.out.println(family.countFamily());
        Human child = new Human("Tom", "Watson", new Date(1800, 4, 6), 80, new String[][]{
                {DaysOfWeek.TUESDAY.name(), "coding"},
                {DaysOfWeek.THURSDAY.name(), "reading"},
                {DaysOfWeek.FRIDAY.name(), "running"}}, family.getMother().getFamily());
        family.addChild(child);
        System.out.println(family.countFamily());
        Pet pet1 = new Pet(Species.CAT.name(), "Jerry");
        System.out.println(pet1.getSpecies());
        System.out.println(family.deleteChild(child));
        System.out.println(family.countFamily());
        System.out.println(family.deleteChild(child));
        Human child2 = new Human("Tom", "Watson", new Date(1800, 4, 6), 80, new String[][]{
                {DaysOfWeek.TUESDAY.name(), "coding"},
                {DaysOfWeek.THURSDAY.name(), "reading"},
                {DaysOfWeek.FRIDAY.name(), "running"}}, family.getMother().getFamily());
        family.addChild(child2);
        System.out.println(family.countFamily());
        System.out.println(family);

    }
}