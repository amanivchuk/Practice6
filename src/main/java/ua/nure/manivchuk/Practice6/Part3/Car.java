package ua.nure.manivchuk.Practice6.Part3;

/**
 * Created by nec on 06.12.17.
 */
public class Car {
    private int id;
    private static int count;

    public Car() {
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car_" + id;
    }
}
