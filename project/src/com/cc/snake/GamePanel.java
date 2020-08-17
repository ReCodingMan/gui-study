package com.cc.snake;

import javax.swing.*;
import java.awt.*;

// 游戏的面板
public class GamePanel extends JPanel {

    //定义🐍的数据结构
    int length; // 🐍的长度
    int[] snakeX = new int[600]; // 🐍的x坐标 25*25
    int[] snakeY = new int[500]; // 🐍的y坐标 25*25
    String fx; // 方向
    // 当前游戏状态：开始，暂停
    boolean isStart;

    /**
     * 构造器
     */
    public GamePanel() {
        init();
    }

    /**
     * 初始化方法
     */
    public void init() {
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100; // 脑袋的位置
        snakeX[1] = 75;snakeY[1] = 100; // 第一个身体的位置
        snakeX[2] = 50;snakeY[2] = 100; // 第二个身体的位置
        fx = "R"; // 👉
        isStart = false;
    }

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

        // 把小蛇画上去
        if (fx.equals("R")) {
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);
        } else if (fx.equals("L")) {
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);
        } else if (fx.equals("U")) {
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);
        } else if (fx.equals("D")) {
            Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);
        }
        for (int i=1; i<length; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        if (!isStart) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏",300,300);
        }
    }
}
