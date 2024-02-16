package module01.Practice.Constructors;

public class Encaplutations {
   private int length;
   private int width;

    Encaplutations(int l, int w){
        this.length=l;
        this.width=w;
    }
    public  void  getArea(){
        System.out.println(length*width);
    }
}
