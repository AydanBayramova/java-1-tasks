package module01.lesson5.umlDiagramsFigures;

public class PlaneFig {
    private  double sideLengths;
    private double radius;
    private double angles;

    public PlaneFig(double sideLengths, double radius, double angles) {
        this.sideLengths = sideLengths;
        this.radius = radius;
        this.angles = angles;
    }

    public double getSideLengths() {
        return sideLengths;
    }

    public void setSideLengths(double sideLengths) {
        this.sideLengths = sideLengths;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAngles() {
        return angles;
    }

    public void setAngles(double angles) {
        this.angles = angles;
    }
    public double areaFig(int r){
        return Math.PI*Math.pow(r,2);
    }
}
