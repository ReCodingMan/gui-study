package com.cc.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionEvent2 {

    public static void main(String[] args) {
        // 两个按钮，实现同一个监听
        // 开始   停止
        Frame frame = new Frame();
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");

        btn2.setActionCommand("btn2-stop");

        MyMonitor myMonitor = new MyMonitor();
        btn1.addActionListener(myMonitor);
        btn2.addActionListener(myMonitor);

        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

    }
}

class MyMonitor implements ActionListener {
    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了" + e.getActionCommand());
    }
}