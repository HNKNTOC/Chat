package test.com.company.client.gui.elementsChat;

import com.company.client.gui.elementsChat.JMessage;

import javax.swing.*;

/**
 * Created by HNKNTOC on 21.12.2015.
 */
public class MessageTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JMessage("HNKNTOC", "OLOLOLOLO", "21.12.2015"));

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
