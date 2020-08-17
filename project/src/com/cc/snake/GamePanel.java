package com.cc.snake;

import javax.swing.*;
import java.awt.*;

// 游戏的面板
public class GamePanel extends JPanel {

    /**
     * 绘制面板，游戏的所有东西，都用这个画笔来画
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // 清屏作用
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this,g,25,11); // 头部广告栏
        g.fillRect(25,75,850,600); // 默认游戏界面
    }
}
