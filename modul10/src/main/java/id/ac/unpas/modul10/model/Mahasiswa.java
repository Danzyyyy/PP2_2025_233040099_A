/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul10.model;

/**
 *
 * @author Acer
 */
public class Mahasiswa {
    
    private String nama, nim, jurusan;
    
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
    
    // Getter
    
    public String getNama() {
        return nama;
    }
    
    public String getNIM() {
        return nim;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    
}
