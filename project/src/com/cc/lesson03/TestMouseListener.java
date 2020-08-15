package com.cc.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {

    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

class MyFrame extends Frame {

    // 画画需要画笔，需要监听鼠标当前的位置，需要集合来存储这个点
    ArrayList points;

    @Override
    public void paint(Graphics g) {
        // 画画，需要监听鼠标的事件
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point  = (Point) iterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x,point.y,10,10);
        }
    }

    // 添加一个点到界面上
    public void addPaint(Point point) {
        points.add(point);
    }

    public MyFrame(String title) {
        super(title);
        setBounds(200,200,400,300);

        // 存鼠标点击的点
        points = new ArrayList<>();

        // 鼠标监听器，正对这个窗口
        this.addMouseListener(new MyMouseListener());

        setVisible(true);
    }

    private class MyMouseListener extends MouseAdapter {
        // 鼠标点击
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame) e.getSource();
            // 这个我们点击的时候，就会在界面上产生一个点
            // 这个点就是鼠标的点
            myFrame.addPaint(new Point(e.getX(), e.getY()));

            // 每次点击鼠标都需要重新画一遍
            myFrame.repaint();
        }
    }
}
