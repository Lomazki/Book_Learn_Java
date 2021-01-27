package book.chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySimpleGui implements ActionListener {
    JFrame frame;
    JButton button;

    public static void main(String[] args) {
        MySimpleGui gui = new MySimpleGui();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("click me");
        button.addActionListener(this);

        MySimpleDrawPanel drawPanel = new MySimpleDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
        button.setText("I've been clicked!");
    }

}
