package module01.interfacesTasks;

public interface Shape {
   void getArea();
   default public void area(){
      System.out.println("ehdedh");
   }
}
