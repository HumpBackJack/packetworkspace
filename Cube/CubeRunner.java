package Cube;
public class CubeRunner {
    public static void main(String[]args){
        Cube c1 = new Cube(3.0);
        double sArea = c1.surfaceArea();
        System.out.println(sArea);
        Cube c2 = new Cube(125.0);
        double volume  = c2.setSideForVolume();
        System.out.println(volume);
        double side = c2.getside();
        sArea = c2.surfaceArea();
        System.out.println(side);
        System.out.println(sArea);
    }
}
