import java.util.StringJoiner;

/**
 * Created by espen on 13.09.17.
 */
public class IntersectingRectangles {
    private Square firstSquare;
    private Square secondSquare;

    //Constructor
    public IntersectingRectangles(String input){
        String s[] = input.split("\n");
        this.firstSquare = new Square(s[0]);
        this.secondSquare = new Square(s[1]);

    }




    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n", "", "");
        sj.add(firstSquare.toString());
        sj.add(secondSquare.toString());
        return sj.toString();
    }
}
