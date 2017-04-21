package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Victor on 4/20/2017.
 */
public class Window extends JFrame {
    public Window(String s, int w, int h, int r, int c, int x, int y) {
        prepareGUI(s,w,h,r,c,x,y);
    };

    protected JFrame mainFrame;

    private void prepareGUI(String s,int width,int height, int rows, int cols, int x, int y){
        mainFrame = new JFrame(s);
        mainFrame.setSize(width,height);
        mainFrame.setLayout(new GridLayout(rows, cols));
        mainFrame.setLocation(x,y);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

        mainFrame.setVisible(true);
    }
}
