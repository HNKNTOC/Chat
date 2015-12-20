package com.company.client.gui.elementsChat;

import javax.swing.*;

/**
 * Created by HNKNTOC on 20.12.2015.
 */
public class Message extends JPanel {
    private String nameAuthor;
    private String content;
    private String data;

    public Message() {

    }

    public Message(String nameAuthor, String content, String data) {
        this.nameAuthor = nameAuthor;
        this.content = content;
        this.data = data;

        go();
    }

    public void go(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        add(new JLabel(nameAuthor));
        add(new JLabel(content));
        add(new JLabel(data));
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
