package Cube;
public class CubeRunner {
    public static void main(String[]args){
        Cube c1 = new Cube(3.0);
        double sArea = c1.surfaceArea();
        System.out.println(sArea);
    }
}
