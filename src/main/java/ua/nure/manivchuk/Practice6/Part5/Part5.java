package ua.nure.manivchuk.Practice6.Part5;

/**
 * Created by nec on 07.12.17.
 */
public class Part5 {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        System.out.println(tree.add(3));
        System.out.println(tree.add(3));

        System.out.println("~~~~~~~");
        tree.add(new Integer[]{1,2,5,4,6,0});
        tree.print();

        System.out.println("~~~~~~~");
        System.out.println(tree.remove(3));
        System.out.println(tree.remove(3));

        System.out.println("~~~~~~~");
        tree.print();
    }
}
