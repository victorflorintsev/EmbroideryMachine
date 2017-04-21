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

    public HelperWindow() {
        super("Toolkit",WINDOW_WIDTH,WINDOW_HEIGHT);
    }
}
