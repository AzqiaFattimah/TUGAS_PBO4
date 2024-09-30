/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loq
 */
public class Main {
    public static void main(String[] args) {
        Produk handphone = new Elektronik("Iphone 12 pro max", 9000000, 2);
        Produk mie = new Makanan("Ramen", 20000, "2024-11-28");

        Pegawai azqia = new PegawaiTetap("Azqia", 9500000, 2000000);
        Pegawai harvey = new PegawaiKontrak("Harvey", 2500000, 24);

        System.out.println("Output Produk:");
        handphone.tampilkanInfo();
        System.out.println();
        mie.tampilkanInfo();
        System.out.println();

        System.out.println("Output Pegawai:");
        azqia.tampilkanInfo();
        System.out.println();
        harvey.tampilkanInfo();
    }
}

    

