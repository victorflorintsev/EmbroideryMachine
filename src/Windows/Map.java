package Windows;

import Shapes.EShape;
import Shapes.ShapeSpace;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

import static Windows.MapWindow.MACHINE_HEIGHT_MM;
import static Windows.MapWindow.MACHINE_WIDTH_MM;
import static Windows.MapWindow.PIXELS_PER_MM;

/**
 * Created by Victor on 4/21/2017.
 */

public class Map extends JPanel {
    // use MapWindow.MACHINE_WIDTH_MM and MACHINE_HEIGHT_MM for gridx lines
    public static final int[] GRID_COLOR = {170, 170, 170};
    private Line2D[] gridx;
    private Line2D[] gridy;

    Dimension minSize = new Dimension(100, 50);
    private ShapeSpace space;


    public Map(Color color) {
        space = new ShapeSpace();

        generateGrid();
        setBackground(color);
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public void add(EShape s) {
        space.add(s);
    }

    public void update() {
        repaint();
    }

    public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            drawGrid(g2);
            space.paint(g2);
    }

    private void generateGrid() {
        gridx = new Line2D[MACHINE_WIDTH_MM];
        for (int i = 0; i < MACHINE_WIDTH_MM; i++) {
            gridx[i] = new Line2D.Float(
                    i*PIXELS_PER_MM,
                    0,
                    i*PIXELS_PER_MM,
                    MACHINE_HEIGHT_MM*PIXELS_PER_MM);
        }

        gridy = new Line2D[MACHINE_HEIGHT_MM];
        for (int i = 0; i < MACHINE_HEIGHT_MM; i++) {
            gridy[i] = new Line2D.Float(
                    0,
                    i*PIXELS_PER_MM,
                    MACHINE_WIDTH_MM*PIXELS_PER_MM,
                    i*PIXELS_PER_MM);
        }
    }

    private void drawGrid(Graphics2D g2) {
        g2.setColor(new Color(GRID_COLOR[0],GRID_COLOR[1],GRID_COLOR[2]));
        for (Line2D l : gridx){
            g2.draw(l);
        }
        for (Line2D l : gridy){
            g2.draw(l);
        }
    }



    public Dimension getMinimumSize() {
            return minSize;
    }

    public Dimension getPreferredSize() {
            return minSize;
    }

}
