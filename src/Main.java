import java.util.ArrayList;

/**
 * Created by espen on 05.09.17.
 */
public class Main {

    public static void main(String[] args)
    {

        Circle circle1 = new Circle(1, 1, 2);
        Circle circle2 = new Circle(2, 2, 0.5);
        Circle circle3 = new Circle(-1, -3, 2);
        Circle circle4 = new Circle(5, 2, 1);
        ArrayList<Circle> circleArrayList = new ArrayList<Circle>();

        circleArrayList.add(circle1);
        circleArrayList.add(circle2);
        circleArrayList.add(circle3);
        circleArrayList.add(circle4);

        SurroundTheCircles stc = new SurroundTheCircles(circleArrayList);

        System.out.println(stc.findRightEdge());
        System.out.println(stc.findLeftEdge());
        System.out.println(stc.findUpperEdge());
        System.out.println(stc.findBottomEdge());



        System.out.println(stc);

    }
}
