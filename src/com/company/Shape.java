package com.company;

import static com.company.Main.cp;

/**
 * Created by Victor on 4/19/2017.
 */
public class Shape {
    Stitch[] slist; // list of stitches

    double[] cm; // center of mass
    double area;
    double perimeter;

    Shape(int x, int y, int sideSize) {

        makeSquare(x,y,sideSize);

        findPerimeter();
        findArea();
        // findCm();
    }

    private void makeSquare(int x, int y, int sideSize) { // keep in mind x, y is bottom left corner
        slist[0] = new Stitch(x               ,y               ,x+sideSize,y);
        slist[1] = new Stitch(x+sideSize,y               ,x+sideSize,y+sideSize);
        slist[2] = new Stitch(x+sideSize,y+sideSize,x               ,y+sideSize);
        slist[3] = new Stitch(x               ,y+sideSize,x               ,y);
    }

    private double findPerimeter() {
        double sum = 0;
        for (Stitch s:slist) {
            sum+=s.getLength();
        }
        return sum;
    }


    protected void findArea() { // finds a close approximation of area by generating triangles and calculating their area
        double sum = 0; // comment test
        int[] first = slist[0].getStart(); // first point
        for (Stitch s:slist) {
            s.getTArea(first[0],first[1]);
        }
        area = sum;
    }

    protected void findCm() {

    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public double[] getCm() {
        return cm;
    }

    protected void move(int x, int y) {
        for (Stitch a:slist) {
            a.moveBy(x,y);  // move every stitch
        }
        cm[0] += x; // move center of mass
        cm[1] += y;
    }

}
