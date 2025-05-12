package Box;

public class Box{
    private int side;

    private double len, width;
    public Box(double a, double b){
        len = a;
        width = b;
    }
    public double getArea(){
        return(len*width);
    }
    public double getPerimeter(){
        return(len + width)*2;
    }
    public void bigger(double f){
        len = f * len;
        width = f *width;
    }
}