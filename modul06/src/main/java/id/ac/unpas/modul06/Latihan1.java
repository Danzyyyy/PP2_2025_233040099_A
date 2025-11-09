/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class Latihan1 {
    
    public static void main(String[] args) {
        // 1. Buat Frame dengan BorderLayout
        JFrame frame = new JFrame("Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        
        // 2. Buat layar kalkulator (TextField di bagian NORTH)
        JTextField layar = new JTextField();
        layar.setPreferredSize(new Dimension(frame.getSize().width, 50));
        // layar.setFont(new Font("Arial", Font.BOLD, 24));
        layar.setEditable(false);
        layar.setBackground(Color.WHITE);
        frame.add(layar, BorderLayout.NORTH);
        
        // 3. Buat panel untuk tombol-tombol dengan GridLayout 4x4
        JPanel panelBtn = new JPanel();
        panelBtn.setLayout(new GridLayout(4, 4, 5, 5));
        
        // 4. Array tombol kalkulator
        String[] number = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };
        
        // 5. Tambahkan tombol menggunakan loop
        for (String text : number) {
            JButton button = new JButton(text);
//            button.setFont(new Font("Arial", Font.BOLD, 20));
            
            // Beri warna berbeda untuk operator
            if (text.matches("[+\\-*/=C]")) {
                button.setBackground(new Color(255, 152, 0));
                button.setForeground(Color.WHITE);
            } else {
                button.setBackground(new Color(224, 224, 224));
            }
            
            panelBtn.add(button);
        }
        
        // 6. Tambahkan panel tombol ke CENTER
        frame.add(panelBtn, BorderLayout.CENTER);
        
        // 7. Tampilkan frame
        frame.setVisible(true);
    }
}
