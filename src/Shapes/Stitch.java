package Shapes;

import java.awt.*;
import java.awt.geom.Line2D;

import static Windows.MapWindow.PIXELS_PER_MM;
import static com.company.Main.findLength;

/**
 * Created by Victor on 4/19/2017.
 */
public class Stitch {
    private int[] start; // x, y
    private int[] end;   // x, y
    private double length;
    private double slope;
    private Color color = new Color(255, 38, 57);

    private Line2D.Float line;
    Stitch(int x_start, int y_start, int x_end, int y_end) {
        start = new int[2];
        end = new int[2];
        start[0] = x_start;
        start[1] = y_start;
        end[0]   = x_end;
        end[1]   = y_end;

        line = new Line2D.Float(
                x_start*PIXELS_PER_MM,
                y_start*PIXELS_PER_MM,
                x_end*PIXELS_PER_MM,
                y_end*PIXELS_PER_MM);

        length = findLength(x_start, y_start, x_end, y_end);

        slope = ( (double)(y_end - y_start) ) / ( (double) (x_end - x_start) ); // Rise / Run
    }

    protected int[] getStart() {
        return start;
    }

    protected int[] getEnd() {
        return end;
    }

    public double getSlope() {
        return slope;
    }

    public Line2D.Float getLine() { return line; }

    void highlight(Color c) {
        color = c;
    }

    protected void moveBy(int x, int y) { // moves entire stitch, preserving angle;
        start[0] += x;
        end[0]   += x;

        start[1] += y;
        end[1]   += y;
    }

    protected double getAngle(Stitch in) { // untested
        return (Math.atan( (slope - in.getSlope()) / (1 + slope*in.getSlope()) ));
    }

    protected double getTArea(int x, int y) { // input point to get total triangular area
        return (length*findLength(start[0],start[1],x,y))/2;
    }


    public double getLength() {
        return length;
    }

    public void paint(Graphics2D g2) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line);
    }
}
