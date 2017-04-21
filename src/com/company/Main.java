package com.company;

public class Main {

    public static void main(String[] args) {
        MainWindow   MWindow = new MainWindow();
        HelperWindow HWindow = new HelperWindow();

        Shape test = new Shape(10,10, 3);

        test.print(); // works as expected
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
