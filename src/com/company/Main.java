package com.company;

import com.company.client.gui.Log;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        Log log = new Log();
        log.start();

        log.setListnerConnect(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Name: "+log.getUserName());
                System.out.println("Password: "+log.getUserPassword());
            }
        });
    }
}
