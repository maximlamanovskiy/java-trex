package it.sevenbits.ap_hello_world.AsciiPanelDemo;

import asciiPanel.AsciiPanel;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame panel = new JFrame();
        AsciiPanel terminal = new AsciiPanel();
        terminal.writeCenter("Hello world!", 10, AsciiPanel.brightYellow);
        panel.add(terminal);
        panel.pack();
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);
    }
}
