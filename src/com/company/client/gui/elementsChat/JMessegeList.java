package com.company.client.gui.elementsChat;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by HNKNTOC on 20.12.2015.
 */
public class JMessegeList extends JPanel implements MessageList {

    private ArrayList<Message> listMessage = new ArrayList<>();
    private JPanel panelMain = new JPanel();

    public JMessegeList() {
        go();
    }

    public void go(){
        setLayout(new GridLayout(0,1));
    }


    @Override
    public void addMessage(Message message) {
        add(message);
    }

    @Override
    public void removeMessage(Message message) {
        remove(message);
    }
}
