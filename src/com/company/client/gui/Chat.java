package com.company.client.gui;

import com.company.client.gui.elementsChat.JMessegeList;


import javax.swing.*;
import java.awt.*;

/**
 * Created by HNKNTOC on 19.12.2015.
 */
public class Chat extends JFrame{

    JMessegeList jMessegeList = new JMessegeList();

    public Chat(){
    }

    public JMessegeList getjMessegeList() {
        return jMessegeList;
    }

    public void start(){
        go();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void go(){
        JPanel panelCenter = new JPanel();
        JPanel panelSmg = new JPanel();
        panelCenter.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        JScrollPane scrollPaneList = new JScrollPane(jMessegeList);

        add(BorderLayout.CENTER, panelCenter);
        add(BorderLayout.SOUTH,panelSmg);



        panelSmg.setLayout(new BoxLayout(panelSmg, BoxLayout.X_AXIS));
        panelSmg.add(new JTextField());
        panelSmg.add(new JButton("GO!"));


        //add MessegeList
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        c.weightx = 1;
        c.weighty = 1;

        c.gridwidth = 0;
        c.gridheight = 0;

        c.gridy = 0;
        c.gridx = 0;
        panelCenter.add(scrollPaneList, c);




    }
}
