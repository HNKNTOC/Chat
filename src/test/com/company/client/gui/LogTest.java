package test.com.company.client.gui;

import com.company.client.gui.Log;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by HNKNTOC on 19.12.2015.
 */
public class LogTest {
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
