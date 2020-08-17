package com.cc.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 游戏的面板
public class GamePanel extends JPanel implements ActionListener,KeyListener {

    //定义🐍的数据结构
    int length; // 🐍的长度
    int[] snakeX = new int[600]; // 🐍的x坐标 25*25
    int[] snakeY = new int[500]; // 🐍的y坐标 25*25
    String fx; // 方向
    // 当前游戏状态：开始，暂停
    boolean isStart = false;

    /**
     * 构造器
     */
    public GamePanel() {
        init();
        // 获得焦点和键盘事件
        this.setFocusable(true); // 获取焦点事件
        this.addKeyListener(this); // 获取键盘监听事件
    }

    //定时器
    Timer timer = new Timer(100,this); // 100毫秒执行一次

    /**
     * 初始化方法
     */
    public void init() {
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100; // 脑袋的位置
        snakeX[1] = 75;snakeY[1] = 100; // 第一个身体的位置
        snakeX[2] = 50;snakeY[2] = 100; // 第二个身体的位置
        fx = "R"; // 👉
        timer.start(); // 一开始就开启定时器
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

    /**
     * 事件监听 -- 需要通过固定事件来刷新，1s=10次
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart) {// 如果开始状态，小蛇动起来

            // 移动
            for (int i=length-1; i>0; i--) {
                snakeX[i] = snakeX[i-1];
                snakeY[i] = snakeY[i-1];
            }

            // 走向
            if (fx.equals("R")) {
                snakeX[0] = snakeX[0]+25;
                if (snakeX[0] > 850) {
                    snakeX[0] = 25;
                }
            } else if (fx.equals("L")) {
                snakeX[0] = snakeX[0]-25;
                if (snakeX[0] < 25) {
                    snakeX[0] = 850;
                }
            } else if (fx.equals("U")) {
                snakeY[0] = snakeY[0]-25;
                if (snakeY[0] < 75) {
                    snakeY[0] = 650;
                }
            } else if (fx.equals("D")) {
                snakeY[0] = snakeY[0]+25;
                if (snakeY[0] > 650) {
                    snakeY[0] = 75;
                }
            }

            repaint();
        }
        timer.start();
    }

    /**
     * 键盘监听事件
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE) {
            isStart = !isStart;
            repaint();
        }

        // 小蛇移动
        if (keyCode == KeyEvent.VK_UP) {
            fx = "U";
        } else if (keyCode == KeyEvent.VK_DOWN) {
            fx = "D";
        } else if (keyCode == KeyEvent.VK_LEFT) {
            fx = "L";
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            fx = "R";
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }
}
