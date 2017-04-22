package Shapes;

import java.awt.*;

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

    public void paint(Graphics2D g2) {
        for (int i = 0; i < size; i++) {
            if (space[i] != null)  {
                space[i].paint(g2);
            }
        }
    }

    public EShape givePos(int x, int y) {

        for (int i = 0; i < size; i++) {
            if (space[i] != null)  {
                if (space[i].isNear(x,y)) {
                    return space[i];
                }
            }
        }
        return null;
    }
}
