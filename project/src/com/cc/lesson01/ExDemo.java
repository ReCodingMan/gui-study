package com.cc.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExDemo {

    public static void main(String[] args) {

        //总 Frame
        Frame frame = new Frame();
        frame.setSize(400,400);
        frame.setLocation(300,400);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));

        //4个面板
        Panel panel = new Panel(new BorderLayout());
        Panel pane2 = new Panel(new GridLayout(2,1));
        Panel pane3 = new Panel(new BorderLayout());
        Panel pane4 = new Panel(new GridLayout(2,2));

        //上面搞定
        panel.add(new Button("East-1"), BorderLayout.EAST);
        panel.add(new Button("West-1"), BorderLayout.WEST);
        pane2.add(new Button("p2-btn-1"));
        pane2.add(new Button("p2-btn-2"));
        panel.add(pane2, BorderLayout.CENTER);

        //下面
        pane3.add(new Button("East-1"), BorderLayout.EAST);
        pane3.add(new Button("West-1"), BorderLayout.WEST);
        //中间4个
        for (int i=0; i<4; i++) {
            pane4.add(new Button("for" + i));
        }
        pane3.add(pane4, BorderLayout.CENTER);

        frame.add(panel);
        frame.add(pane3);

        frame.addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
