package module01.lesson5.umlDiagramsFigures;

public class SpaceFig extends PlaneFig{
   private  double height;
    public SpaceFig(double sideLengths, double radius, double angles) {
        super(sideLengths, radius, angles);
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volumeCylinder(double height, double r){
        return 2*Math.PI*r*height;
    }
 public  double areaofSides(double r,double height){
        r=4;
        return 2*Math.PI*r*height;
 }
}
