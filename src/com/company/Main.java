package com.company;

import Shapes.EShape;
import Windows.HelperWindow;
import Windows.MapWindow;

public class Main {

    public static void main(String[] args) {
        MapWindow map = new MapWindow();
        HelperWindow helperWindow = new HelperWindow();

        EShape test = new EShape(10,10, 20);

        test.print();

        map.add(test);

        map.update();

    }

    // ===================================   +
    // ===================================   +
    /* HELPER METHODS FOR USE IN CLASSES:=   +
    // ===================================  =+=
  */// ===================================   =

    public static double cp(double x1,double y1,double x2,double y2){ //returns cross product
        return x1*y2-y1*x2;
    }

    public static double findLength(int x_start, int y_start, double x_end, double y_end) {
        return Math.sqrt( Math.pow((x_end - x_start),2) + Math.pow((y_end - y_start),2) );
    }
}
