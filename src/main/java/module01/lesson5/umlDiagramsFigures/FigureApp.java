package module01.lesson5.umlDiagramsFigures;

public class FigureApp {
    public static void main(String[] args) {
        SpaceFig cylender=new SpaceFig(3.4,4.4,120);
        System.out.println(cylender.getSideLengths());
        System.out.println(cylender.areaFig(4));
        System.out.println(cylender.areaofSides(4.5,6.6));

    }
}
