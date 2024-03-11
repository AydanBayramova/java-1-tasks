package module01.Examing;

public enum Animal {
    CAT,
    DOG,
    RABBIT,
    BIRD;

   private Animal() {
        System.out.println("this is animal "+this.toString());
    }
    final public void infoAnimal(){
        System.out.println("Animal class ");
    }



}
