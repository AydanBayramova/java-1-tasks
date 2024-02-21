package module01.MiniFamily;
public class person extends anumal {
    private String name;
    private  String surname;
    private int year;
    private int iq;
    anumal pet;
    person mother;
    person father;
    String[][] schedule;
    public person(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    public person(String name, String surname, int year, int iq, anumal pet, person mother, person father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }
    public person() {
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }
    public void describePet() {
        String slyLevel = (pet.getTricklevel()> 50) ? "very sly" : "almost not sly";
        System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old, he is " + slyLevel + " (" + pet.getTricklevel() + ")");
    }
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", mother=" + mother.name + " " + mother.surname + ", father=" + father.name + " " + father.surname + ", pet=" + pet.toString() + "}";
    }

}
