import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by espen on 05.09.17.
 */



public class SurroundTheCircles {

    public double leftEdge;
    public double rightEdge;
    public double upperEdge;
    public double bottomEdge;
    public ArrayList<Circle> circleList;

    public SurroundTheCircles(ArrayList<Circle> circleList){
        this.circleList = circleList;
    }

    public double findRightEdge(){
        double re = Double.MIN_VALUE;

        for(Circle temp : circleList){
            double tempRight = temp.x + temp.radius;
            if(re < tempRight) re = tempRight;

        }
        return re;
    }

    public double findLeftEdge(){
        double le = Double.MAX_VALUE;

        for(Circle temp : circleList){
            double tempLeft = temp.x - temp.radius;
            if(le > tempLeft) le = tempLeft;

        }
        return le;
    }

    public double findUpperEdge(){
        double ue = Double.MIN_VALUE;

        for(Circle temp : circleList){
            double tempUpper = temp.y + temp.radius;
            if(ue < tempUpper) ue = tempUpper;

        }
        return ue;
    }

    public double findBottomEdge(){
        double be = Double.MAX_VALUE;

        for(Circle temp : circleList){
            double tempBottom = temp.y - temp.radius;
            if(be > tempBottom) be = tempBottom;

        }
        return be;
    }

    public ArrayList<String> findTheRectangle(){

        ArrayList<String> rectangle = new ArrayList<String>();

        leftEdge = findLeftEdge();
        rightEdge = findRightEdge();
        upperEdge = findUpperEdge();
        bottomEdge = findBottomEdge();

        StringJoiner upperLeftSj = new StringJoiner(",", "(" , ")");
        upperLeftSj.add(String.valueOf(leftEdge));
        upperLeftSj.add(String.valueOf(upperEdge));

        StringJoiner upperRightSj = new StringJoiner(",", "(" , ")");
        upperRightSj.add(String.valueOf(rightEdge));
        upperRightSj.add(String.valueOf(upperEdge));

        StringJoiner bottomLeftSj = new StringJoiner(",", "(" , ")");
        bottomLeftSj.add(String.valueOf(leftEdge));
        bottomLeftSj.add(String.valueOf(bottomEdge));

        StringJoiner bottomRightSj = new StringJoiner(",", "(" , ")");
        bottomRightSj.add(String.valueOf(rightEdge));
        bottomRightSj.add(String.valueOf(bottomEdge));

        rectangle.add(bottomLeftSj.toString());
        rectangle.add(upperLeftSj.toString());
        rectangle.add(upperRightSj.toString());
        rectangle.add(bottomRightSj.toString());

        return rectangle;
    }



    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n", "", "");
        for(Circle temp : circleList){
            sj.add(temp.toString());
        }

        return sj.toString();
    }

}
