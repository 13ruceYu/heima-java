package com.bobo.d8_innerClass_anonymouse;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo3 {
    public static void main(String[] args) {
        // 1. create window
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        // 2. create button
        JButton btn = new JButton("login");
        // btn.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane.showMessageDialog(win, "yo...");
        //     }
        // });
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "yo..."));

        // 3. add button to window
        panel.add(btn);

        // 4. show window
        win.setSize(300, 300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

    }
}
