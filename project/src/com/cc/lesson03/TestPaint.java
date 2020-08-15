package com.cc.lesson03;

import java.awt.*;

public class TestPaint {

    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame {

    public void loadFrame() {
        setBounds(200,200,600,500);
        setVisible(true);
    }

    /**
     * 画笔
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        // 画笔，需要有颜色，画笔可以画画
        g.setColor(Color.red);
        g.fillOval(100,100,100,100); // 实心的圆

        // 养成习惯，画笔用完，恢复到最初的颜色（黑色）
    }
}
