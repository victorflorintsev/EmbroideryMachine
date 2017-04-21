package Shapes;

/**
 * Created by Victor on 4/19/2017.
 */
public class ShapeSpace {
    public static final int ALLOC = 100; // starting allocation of shapes
    private EShape[] space;
    private int size;

    public ShapeSpace() {
        space = new EShape[ALLOC];
        size = 0;
    }

    public void add(EShape s) {
        // passed by reference BE CAREFUL
        space[size++] = s;
    }
}
