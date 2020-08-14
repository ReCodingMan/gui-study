package com.cc.lesson01;

import java.awt.*;

public class TestFrame {

    public static void main(String[] args) {

        // Frame
        Frame frame = new Frame("第一个java图形窗口");

        // 设置可见性
        frame.setVisible(true);

        // 设置窗口大小
        frame.setSize(400, 400);

        // 设置背景色
        frame.setBackground(new Color(1,1,1));

        // 弹出的初始值
        frame.setLocation(200, 200);

        // 设置大小固定
        frame.setResizable(false);
    }
}
