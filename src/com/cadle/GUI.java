package com.cadle;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GUI {

    JFrame frame;
    Draw draw;
    JButton btnReset;

    static JButton btn[] = new JButton[9];
    static int state[] = new int[9];
    static int player = 0;
    static int winner = 0;

    public GUI(){

        // Create Main Screen
        frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Tic-Tac-Toe");

        // Create 9 Buttons
        for(int i = 0; i < btn.length; i++){
            btn[i] = new JButton();
            btn[i].setVisible(true);
            btn[i].addActionListener(new ActionHandler());
            btn[i].setFocusPainted(false);
            btn[i].setContentAreaFilled(false);
            btn[i].setBorder(null);
            frame.add(btn[i]);
        }

        ButtonPlacement.place();

        btnReset = new JButton("Reset");
        btnReset.setBounds(675, 500, 100, 40);
        btnReset.setVisible(true);
        btnReset.setBackground(new Color(51, 102, 153));
        btnReset.setForeground(Color.WHITE);
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Function.reset();
            }
        });

        frame.add(btnReset);
        draw = new Draw();
        draw.setBounds(0,0,800,600);
        draw.setVisible(true);
        frame.add(draw);
        frame.setVisible(true);
    }
}
