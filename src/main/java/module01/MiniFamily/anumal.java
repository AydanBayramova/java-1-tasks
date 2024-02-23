package module01.MiniFamily;

import java.util.Arrays;

public class anumal {
    private String species;
    private String nickname;
    private int age;
    private int tricklevel;
    private String[] habits;

    public anumal(String species, String nickname, int age, int tricklevel, String[] habits) {
        this.species = species;
        this.nickname=nickname;
        this.age=age;
        if (tricklevel>=1 && tricklevel<=100){
            this.tricklevel=tricklevel;
        }
        this.habits=habits;
    }
    public anumal(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public anumal() {

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public void setTricklevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String eat(){
        System.out.println("i am eating");
        return "Hello, owner. I am " + this.nickname + ". I miss you!";
    }
    public void faul(){
        System.out.println(" 'I need to cover it up'");
    }
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + tricklevel + ", habits=" + Arrays.toString(habits) + "}";
    }


}
