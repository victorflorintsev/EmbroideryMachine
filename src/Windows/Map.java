package Windows;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Victor on 4/21/2017.
 */

public class Map extends JPanel {
        Dimension minSize = new Dimension(100, 50);

        public Map(Color color) {
            setBackground(color);
            setOpaque(true);
            setBorder(BorderFactory.createLineBorder(Color.black));
        }

        public void paint(Graphics g) {
            super.paint(g);  // fixes the immediate problem.
            Graphics2D g2 = (Graphics2D) g;
            Line2D lin = new Line2D.Float(100, 100, 250, 260);
            g2.draw(lin);
        }

        public Dimension getMinimumSize() {
            return minSize;
        }

        public Dimension getPreferredSize() {
            return minSize;
        }

    }
