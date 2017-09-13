import java.util.StringJoiner;

/**
 * Created by espen on 13.09.17.
 */
public class Square {
    private Corner firstCorner;
    private Corner secondCorner;

    private static final class Corner{
        //Coords
        private int x;
        private int y;
        //Constructor
        private Corner(String input){
            String s[] = input.split(",");

            this.x = Integer.parseInt(s[0]);
            this.y = Integer.parseInt(s[1]);

        }

        @Override
        public String toString() {
            StringJoiner sj = new StringJoiner(",", "", "");
            sj.add(String.valueOf(x));
            sj.add(String.valueOf(y));
            return sj.toString();
        }
    }

    private int[] coords = new int[4];

    //constructor
    public Square(String input){
        String s[] = input.split(" ");
        firstCorner = new Corner(s[0]);
        secondCorner = new Corner(s[1]);



    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(" ", "", "");
        sj.add(firstCorner.toString());
        sj.add(secondCorner.toString());
        return sj.toString();
    }

}
