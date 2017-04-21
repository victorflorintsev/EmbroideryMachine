package Windows;

import Windows.HelperWindow;

import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class MotionListener implements MouseMotionListener {
    public void mouseDragged(MouseEvent e) {
        HelperWindow.info.setText("Mouse Dragged: ("+e.getX()+", "+e.getY() +")");
    }
    public void mouseMoved(MouseEvent e) {
        HelperWindow.info.setText("Mouse Moved: ("+e.getX()+", "+e.getY() +")");
    }
}
