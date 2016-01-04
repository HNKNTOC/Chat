package com.company.test;

import com.company.client.connectServer.ClientFacade;
import com.company.client.gui.Chat.ChatGUIFacade;

/**
 * Created by HNKNTOC on 04.01.2016.
 */
public class Test {
    public static void main(String[] args) {
        ClientFacade clientFacade = new ClientFacade();
        clientFacade.clientStart();

        ChatGUIFacade chatGUIFacade = new ChatGUIFacade();

    }
}
