package Shapes;

/**
 * Created by Victor on 4/19/2017.
 */
public class EShape {
    public static final int[] DEFAULT_COLOR = {220,20,20};

    private Stitch[] slist; // list of stitches

    private double[] cm; // center of mass
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
        slist = new Stitch[4];
        slist[0] = new Stitch(x               ,y               ,x+sideSize,y);
        slist[1] = new Stitch(x+sideSize,y               ,x+sideSize,y+sideSize);
        slist[2] = new Stitch(x+sideSize,y+sideSize,x               ,y+sideSize);
        slist[3] = new Stitch(x               ,y+sideSize,x               ,y);
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
        for (Stitch s:slist) {
            area += s.getTArea(first[0],first[1]);
        }
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
//        cm[0] += x; // move center of mass
//        cm[1] += y;
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
}
