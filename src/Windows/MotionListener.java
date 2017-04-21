package Windows;

import Windows.HelperWindow;

import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import static Windows.MapWindow.PIXELS_PER_MM;

class MotionListener implements MouseMotionListener {
    public void mouseDragged(MouseEvent e) {
        HelperWindow.info.setText("Mouse Dragged: ("+e.getX()/PIXELS_PER_MM+", "+e.getY()/PIXELS_PER_MM +")");
    }
    public void mouseMoved(MouseEvent e) {
        HelperWindow.info.setText("Mouse Moved: ("+e.getX()/PIXELS_PER_MM+", "+e.getY()/PIXELS_PER_MM +")");
    }
}
