package com.cc.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 简易计算器
public class TestCalc2 {

    public static void main(String[] args) {
        new Calculator2().loadFrame();
    }
}


// 计算器类
class Calculator2 extends Frame {

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

        button.addActionListener(new MyCalculatorListener2(this));

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
}

// 监听器类
class MyCalculatorListener2 implements ActionListener {

    // 获取这个计算器对象
    Calculator2 calculator2 = null;

    public MyCalculatorListener2(Calculator2 calculator2) {
        this.calculator2 = calculator2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(calculator2.num1.getText());
        int num2 = Integer.parseInt(calculator2.num2.getText());

        calculator2.num3.setText(""+(num1+num2));
        calculator2.num1.setText("");
        calculator2.num2.setText("");
    }
}
