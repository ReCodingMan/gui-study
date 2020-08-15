package com.cc.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 简易计算器
public class TestCalc3 {

    public static void main(String[] args) {
        new Calculator3().loadFrame();
    }
}


// 计算器类
class Calculator3 extends Frame {

    // 属性
    TextField num1,num2,num3;

    // 方法
    public void loadFrame() {
        // 3个文本框
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        Button button = new Button("=");
        Label label = new Label("+");

        button.addActionListener(new MyCalculatorListener3());

        // 布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
    }

    // 监听器类
    // 内部类最大的好处：可以畅通无阻的访问外部的属性和方法！
    public class MyCalculatorListener3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText(""+(n1+n2));
            num1.setText("");
            num2.setText("");
        }
    }
}
