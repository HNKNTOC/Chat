package com.company.client.gui.elementsChat;

import javax.swing.*;
import java.awt.*;

/**
 * Created by HNKNTOC on 20.12.2015.
 */
public class JMessegeList extends JPanel implements MessageDisplay {

    public JMessegeList() {
        go();
    }

    public void go(){
        setLayout(new GridLayout(0,1));
    }


    @Override
    public void addMessage(JMessage message) {
        add(message);
        updateUI();
    }

    @Override
    public void removeMessage(JMessage message) {
        remove(message);
    }

    @Override
    public JPanel getJPanel() {
        return this;
    }
}
