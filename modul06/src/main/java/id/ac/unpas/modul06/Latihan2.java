/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class Latihan2 {
    public static void main(String[] args) {
         // 1. Buat Frame
        JFrame frame = new JFrame("Konversi Suhu Celcius ke Fahrenheit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 180);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));
        frame.getContentPane().setBackground(new Color(240, 248, 255));
        
        // 2. Buat komponen
        JLabel labelCelcius = new JLabel("Celcius:");
        JTextField inputCelcius = new JTextField(15);
        JButton buttonKonversi = new JButton("Konversi");
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JLabel hasilLabel = new JLabel("");
        
        // Styling komponen
        buttonKonversi.setBackground(new Color(70, 130, 180));
        buttonKonversi.setForeground(Color.WHITE);
        hasilLabel.setForeground(new Color(220, 20, 60));
        
        // 3. Buat ActionListener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ambil teks dari JTextField
                    String inputText = inputCelcius.getText();
                    
                    // Ubah teks ke double
                    double celcius = Double.parseDouble(inputText);
                    
                    // Hitung Fahrenheit
                    double fahrenheit = (celcius * 9.0 / 5.0) + 32;
                    
                    // Atur teks JLabel hasil
                    hasilLabel.setText(String.format("%.2f °F", fahrenheit));
                    
                } catch (NumberFormatException ex) {
                    // Penanganan jika input bukan angka
                    JOptionPane.showMessageDialog(frame, 
                        "Input tidak valid! Mohon masukkan angka yang benar.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    hasilLabel.setText("");
                }
            }
        };
        
        // 4. Daftarkan listener ke button
        buttonKonversi.addActionListener(listener);
        
        // 5. Tambahkan komponen ke frame
        frame.add(labelCelcius);
        frame.add(inputCelcius);
        frame.add(buttonKonversi);
        frame.add(labelFahrenheit);
        frame.add(hasilLabel);
        
        // 6. Tampilkan frame
        frame.setVisible(true);
    }
}
