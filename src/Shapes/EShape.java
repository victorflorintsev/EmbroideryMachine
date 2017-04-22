package Shapes;

import java.awt.*;
import java.awt.geom.Line2D;

import static Windows.MapWindow.PIXELS_PER_MM;

/**
 * Created by Victor on 4/19/2017.
 */
public class EShape {
    public static final int[] DEFAULT_COLOR = {220,20,20};

    private Stitch[] slist; // list of stitches

    private float[] cm; // center of mass
    private double area;
    private double perimeter;
    private int[] color = DEFAULT_COLOR;

    public EShape(int x, int y, int sideSize) {

        makeSquare(x,y,sideSize);

        findPerimeter();
        findArea();
        // findCm();
    }

    private void makeSquare(int x, int y, int sideSize) { // keep in mind x, y is bottom left corner
        cm = new float[2];
        slist = new Stitch[4];
        slist[0] = new Stitch(x               ,y               ,x+sideSize,y);
        slist[1] = new Stitch(x+sideSize,y               ,x+sideSize,y+sideSize);
        slist[2] = new Stitch(x+sideSize,y+sideSize,x               ,y+sideSize);
        slist[3] = new Stitch(x               ,y+sideSize,x               ,y);

        cm[0] = x+sideSize;
        cm[1] = y+sideSize;
    }

    private void findPerimeter() {
        perimeter = 0;
        for (Stitch s:slist) {
            perimeter+=s.getLength();
        }
    }


    protected void findArea() { // finds a close approximation of area by generating triangles and calculating their area
        area = 0; // comment test
        int[] first = slist[0].getStart(); // first point
        for (int i = 1; i < slist.length;i++) {
            area += slist[i].getTArea(first[0],first[1]);
        }
    }

    protected void findCm() {
        // find centroid
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public float[] getCm() {
        return cm;
    }

    protected void move(int x, int y) {
        for (Stitch a:slist) {
            a.moveBy(x,y);  // move every stitch
        }
        cm[0] += x; // move center of mass
        cm[1] += y;
    }

    public void print() {
        for (Stitch s:slist) {
            int[] st = s.getStart();
            int[] en = s.getEnd();
            System.out.println(st[0] + " " + st[1] + " " + en[0] + " " + en[1]);
        }
        System.out.println("Area: "+ this.getArea() +"\n" +
                           "Perimeter: "+this.getPerimeter());
    }

    public void paint(Graphics2D g2) {
        for (Stitch s:slist) {
            s.paint(g2);
        }
    }

    public boolean isNear(int x, int y) {
        for (Stitch s:slist) {
            if (s.intersects(
                    cm[0]*PIXELS_PER_MM,
                    cm[1]*PIXELS_PER_MM,
                    -1*x*PIXELS_PER_MM,
                    -1*y*PIXELS_PER_MM)) return true;
        }

        return false;
    }
}
