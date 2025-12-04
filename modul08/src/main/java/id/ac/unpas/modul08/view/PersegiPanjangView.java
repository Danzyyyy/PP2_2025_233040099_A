/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul08.view;

import java.awt.GridLayout;
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
public class PersegiPanjangView extends JFrame {
    // Komponen UI sebagai atribut
    private JTextField txtPanjang = new JTextField(10);
    private JTextField txtLebar = new JTextField(10);
    private JLabel lblHasilLuas = new JLabel("-");
    private JLabel lblHasilKeliling = new JLabel("-");
    private JButton btnHitung = new JButton("Hitung");
    private JButton btnReset = new JButton("Reset");

    public PersegiPanjangView() {
        // Inisialisasi UI
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200); // Ukuran sedikit diperbesar
        this.setTitle("MVC Kalkulator");
        this.setLayout(new GridLayout(5, 2, 10, 10)); 

        this.add(new JLabel("Panjang:"));
        this.add(txtPanjang);
        
        this.add(new JLabel("Lebar:"));
        this.add(txtLebar);
        
        this.add(new JLabel("Hasil Luas:"));
        this.add(lblHasilLuas);
        
        this.add(new JLabel("Hasil Keliling:"));
        this.add(lblHasilKeliling);
        
        this.add(btnReset);  
        this.add(btnHitung); 
    }

    // Getters Input
    public double getPanjang() {
        return Double.parseDouble(txtPanjang.getText());
    }

    public double getLebar() {
        return Double.parseDouble(txtLebar.getText());
    }

    // Setters Output
    public void setHasilLuas(double hasil) {
        lblHasilLuas.setText(String.valueOf(hasil));
    }
    
    public void setHasilKeliling(double hasil) {
        lblHasilKeliling.setText(String.valueOf(hasil));
    }
    
    public void resetTampilan() {
        txtPanjang.setText("");
        txtLebar.setText("");
        lblHasilLuas.setText("-");
        lblHasilKeliling.setText("-");
        txtPanjang.requestFocus();
    }

    public void tampilkanPesanError(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    public void addHitungListener(ActionListener listener) {
        btnHitung.addActionListener(listener);
    }
    
    public void addResetListener(ActionListener listener) {
        btnReset.addActionListener(listener);
    }
}
