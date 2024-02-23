package module01.MiniFamily;

public class fam {
    public static void main(String[] args) {
   anumal pet=new anumal("dog","tom",10,60,new String[]{"eat","drink"});
        person mother = new person("Jane","Karleona",1950);
        person father = new person("Jake", "Karleone", 1950);
        person child = new person("M", "Karleone", 1977, 90, pet, mother, father, new String[][]{{"Monday", "Work"}, {"Tuesday", "Gym"}});

        child.greetPet();
        child.pet.eat();
        child.pet.faul();
        System.out.println(child.toString());
        System.out.println(pet.toString());


    }
}
