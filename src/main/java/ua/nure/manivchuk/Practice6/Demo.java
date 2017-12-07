package ua.nure.manivchuk.Practice6;

import ua.nure.manivchuk.Practice6.Part1.Part1;
import ua.nure.manivchuk.Practice6.Part2.Part2;
import ua.nure.manivchuk.Practice6.Part3.Part3;
import ua.nure.manivchuk.Practice6.Part4.Part4;
import ua.nure.manivchuk.Practice6.Part5.Part5;
import ua.nure.manivchuk.Practice6.Part6.Part6;
import ua.nure.manivchuk.Practice6.Part7.Part7;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by nec on 05.12.17.
 */
public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("====== Part 1 ======");
        System.setIn(new ByteArrayInputStream("asd asdf asd asdf asdf 43 asdsf 43 43 434".getBytes("UTF-8")));
        Part1.main(args);

        /*====== Part 2 ======*/
        System.out.println("====== Part 2 ======");
        Part2.main(args);

        /*====== Part 3 ======*/
        System.out.println("====== Part 3 ======");
        Part3.main(args);

        /*====== Part 4 ======*/
        System.out.println("====== Part 4 ======");
        Part4.main(args);

         /*====== Part 5 ======*/
        System.out.println("====== Part 5 ======");
        Part5.main(args);

        /*====== Part 6 ======*/
        System.out.println("====== Part 6 ======");
        Part6.main(args);

        /*====== Part 7 ======*/
        System.out.println("====== Part 7 ======");
        Part7.main(args);

    }
}
