/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul05;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Acer
 */
public class Tugas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               JFrame frame = new JFrame("Contoh BorderLayout");
               frame.setSize(400, 300);
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // 1. Atur Layout Manager ke BorderLayout
                // Sebenarnya ini tidak perlu
                // Karena BorderLayout adalah Layout Manager default
                frame.setLayout(new BorderLayout());
                
                // 2. Buat komponen
                JLabel label = new JLabel("Label ada di Atas (NORTH)");
                JButton btnSouth = new JButton("Tombol ada di Bawah (SOUTH)");
                JButton btnWest = new JButton("Tombol ada di Kiri (WEST)");
                JButton btnEast = new JButton("Tombol ada di Kanan (EAST)");
                JButton btnCenter = new JButton("Tombol ada di Tengah (CENTER)");
                
                // 3. Tambahkan Aksi (ActionListener) ke tombol
                btnSouth.addActionListener(e -> {
                    label.setText("Tombol di SOUTH diklik!");
                });
                btnWest.addActionListener(e -> {
                    label.setText("Tombol di WEST diklik!");
                });
                btnEast.addActionListener(e -> {
                    label.setText("Tombol di EAST diklik!");
                });
                btnCenter.addActionListener(e -> {
                    label.setText("Tombol di CENTER diklik!");
                });
                
                // 4. Tambahkan komponen ke frame DENGAN POSISI
                frame.add(label, BorderLayout.NORTH);
                frame.add(btnSouth, BorderLayout.SOUTH);
                frame.add(btnWest, BorderLayout.WEST);
                frame.add(btnEast, BorderLayout.EAST);
                frame.add(btnCenter, BorderLayout.CENTER);
                
                frame.setVisible(true);
            }
            });
    }
}
