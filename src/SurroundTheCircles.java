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



    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n", "", "");
        for(Circle temp : circleList){
            sj.add(temp.toString());
        }

        return sj.toString();
    }

}
