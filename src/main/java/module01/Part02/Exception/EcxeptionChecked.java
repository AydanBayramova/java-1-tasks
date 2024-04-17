package module01.Part02.Exception;


class NoMoreCarrotsException extends Exception {}


public class EcxeptionChecked {
    public static void main(String[] args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) {
            System.out.println("Rabbit hasn't any carrot ");
        }
    }
    private  static void eatCarrot() throws NoMoreCarrotsException{

    }
    public  void bad() {
        try {
            Carrots();
        }catch (NoMoreCarrotsException e){
            System.out.println("sad rabbit");
        }
    }
    private void Carrots()throws NoMoreCarrotsException{}
    class CanNotHopException extends Exception {}
    class Hopper {
       public void hop() throws CanNotHopException{};
    }
    class Bunny extends  Hopper {
       public void hop() throws CanNotHopException {}
    }
}
