package com.cc.lesson02;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {

    public static void main(String[] args) {
        //按下按钮，触发一些事件
        Frame frame = new Frame();
        Button button = new Button();

        //需要一个接口实现类
        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);

        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        windowClose(frame); //监听关闭
    }

    //关闭事件的窗体
    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionListener implements ActionListener {

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaa");
    }
}
