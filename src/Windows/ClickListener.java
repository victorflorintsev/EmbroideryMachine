package Windows;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class ClickListener implements MouseListener {
    public void mouseClicked(MouseEvent e) {
        HelperWindow.info.setText("Mouse Clicked: ("+e.getX()+", "+e.getY() +")");
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
}
