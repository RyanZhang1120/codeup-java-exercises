package shapes;

public class Rectangle extends Quadrilateral {
    public Rectangle(double length, double width){
        super(length, width);
    }
    @Override
    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
