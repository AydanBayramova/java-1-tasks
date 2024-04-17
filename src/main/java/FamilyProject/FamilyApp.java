package FamilyProject;

import java.time.LocalDate;
import java.util.Date;

public class FamilyApp {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "watson", LocalDate.of(1980, 9, 7));
        Human father = new Human("John", "Watson", LocalDate.of(1890, 9, 5));

        Family family = new Family(mother, father);
        System.out.println(family.countFamily());
        System.out.println(mother.toString());
//        Human child = new Human("Tom", "Watson", new Date(1800, 4, 6), 80, new String[][]{
//                {DaysOfWeek.TUESDAY.name(), "coding"},
//                {DaysOfWeek.THURSDAY.name(), "reading"},
//                {DaysOfWeek.FRIDAY.name(), "running"}}, family.getMother().getFamily());
//        family.addChild(child);
//        System.out.println(family.countFamily());
//        System.out.println(family.deleteChild(child));
//        System.out.println(family.countFamily());
//        System.out.println(family.deleteChild(child));
//        Human child2 = new Human("Tom", "Watson", new Date(1800, 4, 6), 80, new String[][]{
//                {DaysOfWeek.TUESDAY.name(), "coding"},
//                {DaysOfWeek.THURSDAY.name(), "reading"},
//                {DaysOfWeek.FRIDAY.name(), "running"}}, family.getMother().getFamily());
//        family.addChild(child2);
//        System.out.println(family.countFamily());
//        System.out.println(family);
//        Pet cat = new DomesticCat("Cat", "Tom", 18, 79, new String[]{"sleeping"});
//        family.setPet(cat);
//        System.out.println(family.getPet());
//        Human woman = new Woman("Jane", "Watson", new Date(1990, 3, 8));
//        woman.greetPet();


    }
}