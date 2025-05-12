package Box;
public class TestBoxes{
    public static Box testbox;
    public static void main(String[]args){
        Box testbox = new Box(2,6);
        System.out.println("Area:" + testbox.getArea());
        testbox.bigger(2);
        System.out.println("perimeter:"+testbox.getPerimeter());
    }
}