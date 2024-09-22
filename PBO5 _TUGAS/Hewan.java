/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author loq
 */
public class Hewan {

    String nama;
    String jenis;
    int usia;

    public Hewan(String nama, String jenis, int usia) {
        this.nama = nama;
        this.jenis = jenis;
        this.usia = usia;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama );
        System.out.println("Jenis: " + jenis);
        System.out.println("Usia: " + usia);

    }
}


