/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalTugas6;

/**
 *
 * @author loq
 */
public class Main {
    
      public static void main(String[] args) {
        // Membuat produk
        Produk buku = new Buku("Buku Cepat Belajar Ngoding ", 350000);
        Produk elektronik = new Elektronik("Samsung A55 ", 6000000);
        Produk pakaian = new Pakaian("Cardigan", 250000);

        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanProduk();

        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotalSetelahDiskon());
    }
}
    
    

