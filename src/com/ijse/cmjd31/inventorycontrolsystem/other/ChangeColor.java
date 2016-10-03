/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.other;

import com.ijse.cmjd31.inventorycontrolsystem.main.HomePanel;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author 1
 */
public class ChangeColor {

    JPanel panel;

    public ChangeColor() {
    }

    public ChangeColor(JPanel panel) {
        this.panel = panel;
        panel.setBackground(new Color(153, 153, 255));
    }
}
