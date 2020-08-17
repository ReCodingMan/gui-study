package com.cc.snake;

import javax.swing.*;

// 游戏主启动类
public class StartGame {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setBounds(10,10,900,720);

        // 正常游戏界面都应该在画板上
        jFrame.add(new GamePanel());

    }
}
