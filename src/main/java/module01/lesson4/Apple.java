package module01.lesson4;

public class Apple extends Fruit  {
    private  String color;
    private String species;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Apple(String color,String species,String name){
        super(color,species,name);
        this.color=color;
        this.species=species;
        this.name=name;
    }
    public static String eat(){
        return "Student eat green apples";
    }


}
