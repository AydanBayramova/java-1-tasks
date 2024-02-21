package MiniFamily1.java;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int tricklevel;
    private String[] habits;

    public Pet(String species, String nickname, int age, int tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public void setTricklevel(int tricklevel) {
        if (tricklevel > 0 && tricklevel <= 100) {
            this.tricklevel = tricklevel;
        }
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String eat() {
        return "i'm eating";
    }

    public String respond(String nickname) {
        return "Hello, owner. I am " + this.nickname + ". I miss you!";
    }

    public String foul() {
        return "'I need to cover it up'";
    }
}
