package com.company;

import com.company.client.gui.elementsChat.JMessage;
import com.company.client.gui.elementsChat.JMessegeList;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JMessegeList messegeList = new JMessegeList();

        frame.add(messegeList);

        messegeList.addMessage(new JMessage());
        messegeList.addMessage(new JMessage());
        messegeList.addMessage(new JMessage());

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
