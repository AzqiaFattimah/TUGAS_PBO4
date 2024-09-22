/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author loq
 */
public class Mobil extends KendaraanDarat {
    String jenisBahanBakar;

    public Mobil(String nama, int kecepatan, int jumlahRoda, String jenisBahanBakar) {
        super(nama, kecepatan, jumlahRoda);
        this.jenisBahanBakar = jenisBahanBakar;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
    }
}
    

