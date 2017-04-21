package Windows;

import javax.swing.*;
import java.awt.*;

/**
 * This is the toolbar window, it contains a package private text area so far for communication between MapWindow
 */
public class HelperWindow extends Window {
    public static final int WINDOW_WIDTH  = 150;
    public static final int WINDOW_HEIGHT = 600;
    public static final int NUM_ROWS      = 12;
    public static final int NUM_COLS      = 1;

    static JTextArea info;

    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public HelperWindow() {
        super("Toolkit",WINDOW_WIDTH,WINDOW_HEIGHT,NUM_ROWS,NUM_COLS,0,0);

        info = new JTextArea("INIT");
        info.setVisible(true);

        headerLabel = new JLabel("TOOLKIT",JLabel.CENTER );
        statusLabel = new JLabel("Tool 1",JLabel.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(info);
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);

        mainFrame.setVisible(true);
    }
}
