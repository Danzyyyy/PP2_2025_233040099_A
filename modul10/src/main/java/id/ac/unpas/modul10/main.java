/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul10;

import id.ac.unpas.modul10.controller.MahasiswaController;
import id.ac.unpas.modul10.model.*;
import id.ac.unpas.modul10.view.MahasiswaView;
import javax.swing.SwingUtilities;

/**
 *
 * @author Acer
 */
public class main {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MahasiswaModel model = new MahasiswaModel();
            MahasiswaView view = new MahasiswaView();
            new MahasiswaController(model, view);
            view.setVisible(true);
        });
    }
    
}
