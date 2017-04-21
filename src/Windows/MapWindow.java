package Windows;

import Shapes.EShape;
import Shapes.ShapeSpace;

import java.awt.*;

/**
 * This is the window containing a visual map for the user
 * the precision of the machine is 1/10 mm per x or y
 * and the max size is 5" by 7"
 * which in millimeters is 127 X ~178 mm
 *
 * Turning it sideways so user gets to see more
 *
 */
public class MapWindow extends Window {
    public static final int MACHINE_WIDTH_MM  = 178;
    public static final int MACHINE_HEIGHT_MM = 127;
    public static final int PIXELS_PER_MM = 8;
    public static final int WINDOW_WIDTH  = MACHINE_WIDTH_MM * PIXELS_PER_MM;
    public static final int WINDOW_HEIGHT = MACHINE_HEIGHT_MM * PIXELS_PER_MM;
    public static final int NUM_ROWS      = 1;
    public static final int NUM_COLS      = 1;

    private Map map;
    private ShapeSpace space;

    public MapWindow() {
        super("Embroidery Map",WINDOW_WIDTH,WINDOW_HEIGHT,NUM_ROWS,NUM_COLS,HelperWindow.WINDOW_WIDTH+20,0);

        space = new ShapeSpace();

        ClickListener clickListener = new ClickListener();
        MotionListener motionListener = new MotionListener();

        map = new Map(new Color(200,200,200));
        map.addMouseMotionListener(motionListener);
        map.addMouseListener(clickListener);
        map.setVisible(true);
        mainFrame.add(map);


        mainFrame.setVisible(true);
        //map.addMouseListener();
    }

    public void add(EShape s) {
        space.add(s);
    }

    public void update() {
        // draw
    }
}
