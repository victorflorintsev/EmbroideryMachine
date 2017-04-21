package Windows;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Created by Victor on 4/21/2017.
 */

public class Map extends JLabel {
        Dimension minSize = new Dimension(100, 50);

        public Map(Color color) {
            setBackground(color);
            setOpaque(true);
            setBorder(BorderFactory.createLineBorder(Color.black));
        }

        public Dimension getMinimumSize() {
            return minSize;
        }

        public Dimension getPreferredSize() {
            return minSize;
        }
    }
