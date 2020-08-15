package com.cc.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 主窗口
public class DiologDemo extends JFrame {

    public DiologDemo() {
        this.setVisible(true);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // JFrame 放东西，容器
        Container container = this.getContentPane();
        // 绝对布局
        container.setLayout(null);

        // 按钮
        JButton jButton = new JButton("点击弹出一个对话框");
        jButton.setBounds(30,30,200,50);

        // 点击按钮的时候弹窗
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 弹窗
                new MyDialoDemo();
            }
        });

        container.add(jButton);

    }

    public static void main(String[] args) {
        new DiologDemo();
    }

}

// 弹窗窗口
class MyDialoDemo extends JDialog {

    public MyDialoDemo() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(new Label("来到啦啦啦啦啦啦"));

    }
}