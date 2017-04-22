package Windows;

import Shapes.EShape;
import Windows.HelperWindow;

import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import static Windows.MapWindow.PIXELS_PER_MM;
import static Windows.MapWindow.map;

class MotionListener implements MouseMotionListener {
    int x;
    int y;
    EShape temp;

    public void mouseDragged(MouseEvent e) {
        x = e.getX()/PIXELS_PER_MM;
        y = e.getY()/PIXELS_PER_MM;

        temp = map.givePos(x,y);

        if (temp != null) {
            HelperWindow.obj_info.setText("Object Touched: Area:  "+temp.getArea());
        }
        else HelperWindow.info.setText("Mouse Dragged: ("+e.getX()/PIXELS_PER_MM+", "+e.getY()/PIXELS_PER_MM +")");
    }
    public void mouseMoved(MouseEvent e) {
        x = e.getX()/PIXELS_PER_MM;
        y = e.getY()/PIXELS_PER_MM;

        map.givePos(x,y);

        HelperWindow.info.setText("Mouse Moved: ("+e.getX()/PIXELS_PER_MM+", "+e.getY()/PIXELS_PER_MM +")");
    }
}
