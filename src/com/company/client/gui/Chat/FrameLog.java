package com.company.client.gui.Chat;

import com.company.client.observer.ObservableMessages;
import com.company.client.observer.ObserverMessage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by HNKNTOC on 19.12.2015.
 */
class FrameLog extends JFrame{

    private JTextField fieldUserName = new JTextField();
    private JPasswordField fieldUserPassword = new JPasswordField();
    private JButton buttonConnect = new JButton("Connect");

    public FrameLog() throws HeadlessException {
        super("FrameLog :)");
    }

    public void start(){

        go();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(200,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void go(){
        GridBagLayout gridBagLayout = new GridBagLayout();

        JPanel panelMain = new JPanel();
        panelMain.setLayout(gridBagLayout);
        add(BorderLayout.CENTER, panelMain);

        GridBagConstraints c = new GridBagConstraints();


        // Добовление 2 JLabel
        c.anchor = GridBagConstraints.WEST;
        c.weightx = 0;

        c.gridy = 1;
        c.gridx = 0;
        panelMain.add(new JLabel("Name:"), c);

        c.gridy = 2;
        c.gridx = 0;
        panelMain.add(new JLabel("Password:"), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;

        // Добовление 2 JTextField
        c.gridy = 1;
        c.gridx = 1;
        panelMain.add(fieldUserName, c);

        c.gridy = 2;
        c.gridx = 1;
        panelMain.add(fieldUserPassword,c);

        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;

        // Добовление JLabel
        c.gridx = 0;
        c.gridy = 0;
        panelMain.add(new JLabel("Connect to net chat "), c);

        //Добовление

        add(BorderLayout.SOUTH,buttonConnect);

    }

    public void addListenerConnect(ActionListener listener){
        buttonConnect.addActionListener(listener);
    }

    public String getUserName(){
        return fieldUserName.getText();
    }

    public String getUserPassword(){
        return new String(fieldUserPassword.getPassword());
    }

}
