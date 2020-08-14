package com.cc.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01 {

    public static void main(String[] args) {
        //启动！
        new MyFrame();
    }
}

class MyFrame extends Frame {

    public MyFrame() {
        TextField textField = new TextField();
        add(textField);

        MyActionListener2 myActionListener2 = new MyActionListener2();
        //监听这个文本框输入的文字
        textField.addActionListener(myActionListener2);

        //设置替换编码
        textField.setEchoChar('*');
        setVisible(true);
        pack();
    }
}

class MyActionListener2 implements ActionListener {

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource(); // 获取一些资源，返回一个对象
        String text = textField.getText(); // 获取输入框的文本
        System.out.println(text);
        textField.setText("");
    }
}
