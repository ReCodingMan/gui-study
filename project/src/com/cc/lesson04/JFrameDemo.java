package com.cc.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {

    public void init() {
        JFrame jFrame = new JFrame("这是一个JFrame窗口");
        jFrame.setVisible(true);
        jFrame.setBounds(100,100,200,200);
        jFrame.setBackground(Color.cyan);

        // 设置文字
        JLabel jLabel = new JLabel("欢迎来到狂神～");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jFrame.add(jLabel);

        // 关闭事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // 建立一个窗口
        new JFrameDemo().init();
    }
}
