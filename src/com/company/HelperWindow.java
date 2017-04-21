package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Victor on 4/19/2017.
 */
public class HelperWindow extends Window {
    public static final int WINDOW_WIDTH  = 150;
    public static final int WINDOW_HEIGHT = 600;
    public static final int NUM_ROWS      = 12;
    public static final int NUM_COLS      = 1;

    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public HelperWindow() {
        super("Toolkit",WINDOW_WIDTH,WINDOW_HEIGHT,NUM_ROWS,NUM_COLS,0,0);

        headerLabel = new JLabel("TOOLKIT",JLabel.CENTER );
        statusLabel = new JLabel("Tool 1",JLabel.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
    }
}
