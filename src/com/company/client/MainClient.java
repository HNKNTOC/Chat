package com.company.client;


import com.company.client.connectServer.ClientFacade;
import com.company.client.gui.Chat.ChatGUIFacade;

public class MainClient {

    public static void main(String[] args) {
        ChatGUIFacade chatGUIFacade = new ChatGUIFacade();
        ClientFacade clientFacade = new ClientFacade();

        chatGUIFacade.registerObserver(clientFacade);
        clientFacade.registerObserver(chatGUIFacade);

        chatGUIFacade.chatStart();
        clientFacade.clientStart();
    }
}
