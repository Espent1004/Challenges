import java.util.ArrayList;

/**
 * Created by espen on 05.09.17.
 */
public class Main {

    public static void main(String[] args)
    {
        String test ="0,0 2,2\n" + "1,1 3,3";


        IntersectingRectangles ir = new IntersectingRectangles(test);
        System.out.println(ir);
/*
        String[] test1 = test.split(" ");

        for(String s : test1) System.out.println(s);
        System.out.println(test1.length);*/
    }
}
