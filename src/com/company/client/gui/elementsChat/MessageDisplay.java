package com.company.client.gui.elementsChat;


import javax.swing.*;

/**
 * Отображает множество JMessage.
 */
public interface MessageDisplay{
    void addMessage(JMessage message);
    void removeMessage(JMessage message);
    JPanel getJPanel();
}
