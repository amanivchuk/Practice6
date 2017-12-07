package ua.nure.manivchuk.Practice6.Part3;

/**
 * Created by nec on 06.12.17.
 */
public class Part3 {
    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.info();

        for(int i = 0; i < 7; i++){
            parking.park(new Car());
        }
        parking.info();
        System.out.println("-----");

        parking.leace(2);
        parking.info();
        System.out.println("-----");
        parking.leace(4);
        parking.info();

    }
}
