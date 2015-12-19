package com.company.client.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by HNKNTOC on 19.12.2015.
 */
public class Chat extends JFrame{
    public void start(){

        go();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void go(){
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        JList<Component> componentJList = new JList<>();

        c.gridy = 0;
        c.gridx = 0;
        add(componentJList,c);

        componentJList.add(new JButton());
        componentJList.add(new JButton());
        componentJList.add(new JButton());
        componentJList.add(new JButton());

    }
}
