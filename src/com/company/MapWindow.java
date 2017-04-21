package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * This is the window containing a visual map for the user
 * the precision of the machine is 1/10 mm per x or y
 * and the max size is 5" by 7"
 * which in milimeters is 127 X ~178 mm
 *
 */
public class MapWindow extends Window {
    public static final int MACHINE_WIDTH_MM  = 127;
    public static final int MACHINE_HEIGHT_MM = 178;
    public static final int PIXELS_PER_MM = 4;
    public static final int WINDOW_WIDTH  = MACHINE_WIDTH_MM * PIXELS_PER_MM;
    public static final int WINDOW_HEIGHT = MACHINE_HEIGHT_MM * PIXELS_PER_MM;
    public static final int NUM_ROWS      = 1;
    public static final int NUM_COLS      = 1;

    private Map map;

    public MapWindow() {
        super("Embroidery Map",WINDOW_WIDTH,WINDOW_HEIGHT,NUM_ROWS,NUM_COLS,HelperWindow.WINDOW_WIDTH+20,0);

        map = new Map(new Color(200,200,200));
        map.setVisible(true);
        mainFrame.add(map);


        mainFrame.setVisible(true);
        //map.addMouseListener();
    }
}
