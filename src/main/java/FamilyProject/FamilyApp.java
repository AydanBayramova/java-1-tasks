package FamilyProject;

import java.util.Date;

public class FamilyApp {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "watson", new Date(1980, 9, 7));
        Human father = new Human("John", "Watson", new Date(1890, 9, 5));

        Family family = new Family(mother, father);
        System.out.println(family.countFamily());
        //System.out.println(family);
        Human child = new Human("Tom", "Watson", new Date(1800, 4, 6), 80, new String[][]{
                {"Monday", "coding"},
                {"Tuesday", "reading"},
                {"Wednesday", "running"}}, family.getMother().getFamily());
        family.addChild(child);
        System.out.println(family.countFamily());

    }
}