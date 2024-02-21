package MiniFamily1.java;

public class FamilyApp {
    public static void main(String[] args) {
        Human human1 = new Human("jana", "Bill", 2000, 70);
        Pet dog = new Pet("Dog", "Buddy", 3, 80, new String[]{"Fetch", "Roll Over"});
        Human mother = new Human("Alice", "Smith", 1975);
        Human father = new Human("Bob", "Smith", 1973);
        Pet pet1 = new Pet("dog", "Tom", 12, 40, new String[]{"running", "jumping"});
        Human child = new Human("Michael", "Smith", 2005, 40, dog, mother, father, new String[][]{{"go shopping"}});


        System.out.println(child);
        System.out.println(human1);
        System.out.println(dog.eat());

    }
}
