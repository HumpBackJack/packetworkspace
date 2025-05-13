public class Cube {
    private double side;
    public Cube(double s){
        side = s;
    }
    public double volume(){
        return side*side*side;
    }
    public double surfaceArea(){
        double area = side*side;
        return area*6;     
    }
    public double getside(){
        return side;
    }
    public void setSideForVolume(double v){
        double temp = Math.pow(v,1.0/3.0);
        temp = (int)(1000*temp+0.5);
        side = temp/1000.0;
    }
}
