package test.com.company.client.gui;

import com.company.client.gui.FrameChat;
import com.company.client.gui.elementsChat.JMessage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by HNKNTOC on 19.12.2015.
 */
public class ChatTest {
    public static void main(String[] args) {
        FrameChat chat = new FrameChat();

        chat.getMessageDisplay().addMessage(new JMessage("HNKNTOC:", "Hi!", "21.12.2015"));
        chat.getMessageDisplay().addMessage(new JMessage("Vasa:", "Hi!", "21.12.2015"));
        chat.getMessageDisplay().addMessage(new JMessage("HNKNTOC:", "LOL", "21.12.2015"));
        chat.getMessageDisplay().addMessage(new JMessage("Vasa:", "LOLOLOOL :)", "21.12.2015"));
        chat.getMessageDisplay().addMessage(new JMessage("Vasa:", "LOLOLOOL werwevr we rwe r lo l sdt ft  dfd s  df", "21.12.2015"));

        chat.addListenerButtonPrint(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chat.getMessageDisplay().addMessage(new JMessage("HNKNTOC",chat.getTextNewMessage(),"22.12.2015"));
            }
        });

        chat.start();
    }
}
