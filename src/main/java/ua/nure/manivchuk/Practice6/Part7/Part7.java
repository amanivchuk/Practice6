package ua.nure.manivchuk.Practice6.Part7;

/**
 * Created by nec on 07.12.17.
 */
public class Part7 {
    public static void main(String[] args) {
        Range range = new Range(3, 10);
        for(Integer el : range){
            System.out.printf("%d ", el);
        }
        System.out.println();

        range = new Range(3, 10, true);
        for(Integer el : range){
            System.out.printf("%d ", el);
        }
        System.out.println();
    }
}
