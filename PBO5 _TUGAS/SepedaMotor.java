/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author loq
 */
public class SepedaMotor extends KendaraanDarat {
    boolean pakaiHelm;

    public SepedaMotor(String nama, int kecepatan, int jumlahRoda, boolean memilikiHelm) {
        super(nama, kecepatan, jumlahRoda);
        this.pakaiHelm = pakaiHelm;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Pakai Helm: " + (pakaiHelm ? "Ya" : "Tidak"));
    }
}

    

