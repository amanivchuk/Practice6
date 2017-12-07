package ua.nure.manivchuk.Practice6.Part6;

/**
 * Created by nec on 07.12.17.
 */
public class Part6 {
    public static void main(String[] args) {
        MyMain.main(new String[] { "-i src/main/resources/Part6.txt -t frequency" });
        MyMain.main(new String[] { "--input src/main/resources/Part6.txt --task length" });
        MyMain.main(new String[] { "-i src/main/resources/Part6.txt -t duplicates" });
    }
}
