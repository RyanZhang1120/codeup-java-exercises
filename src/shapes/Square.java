package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }
    @Override
    public double getArea(){
        return length * length;
    }
    public double getPerimeter(){
        return 4 * length;
    }
}
