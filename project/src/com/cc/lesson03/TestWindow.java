package com.cc.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {

    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame {
    public WindowFrame() {
        setBackground(Color.BLUE);
        setBounds(100,100,200,200);
        setVisible(true);

        // 匿名内部类
        this.addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window has been opened.
             *
             * @param e
             */
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened");
            }

            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
            }

            /**
             * Invoked when a window has been closed.
             *
             * @param e
             */
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed");
            }

            /**
             * Invoked when a window is activated.
             *
             * @param e
             */
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");
            }

            /**
             * Invoked when a window is de-activated.
             *
             * @param e
             */
            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated");
            }

            /**
             * Invoked when a window state is changed.
             *
             * @param e
             * @since 1.4
             */
            @Override
            public void windowStateChanged(WindowEvent e) {
                System.out.println("windowStateChanged");
            }

            /**
             * Invoked when the Window is set to be the focused Window, which means
             * that the Window, or one of its subcomponents, will receive keyboard
             * events.
             *
             * @param e
             * @since 1.4
             */
            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("windowGainedFocus");
            }

            /**
             * Invoked when the Window is no longer the focused Window, which means
             * that keyboard events will no longer be delivered to the Window or any of
             * its subcomponents.
             *
             * @param e
             * @since 1.4
             */
            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("windowLostFocus");
            }
        });
    }
}
