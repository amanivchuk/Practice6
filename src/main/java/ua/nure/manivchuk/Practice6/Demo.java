package ua.nure.manivchuk.Practice6;

import ua.nure.manivchuk.Practice6.Part1.Part1;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by nec on 05.12.17.
 */
public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setIn(new ByteArrayInputStream("asd asdf asd asdf asdf 43 asdsf 43 43 434".getBytes("UTF-8")));
        Part1.main(args);
    }
}
