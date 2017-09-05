import java.util.StringJoiner;

public class Circle{
    public double x; //x coordinate
    public double y; //y coordinate
    public double radius; //radius

    //Circle constructor
    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add(String.valueOf(x));
        sj.add(String.valueOf(y));
        sj.add(String.valueOf(radius));
        return sj.toString();
    }
}