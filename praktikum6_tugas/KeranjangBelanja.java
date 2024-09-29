/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalTugas6;

/**
 *
 * @author loq
 */

import java.util.ArrayList;
import java.util.List;


public class KeranjangBelanja {
        private List<Produk> produkList;

    public KeranjangBelanja() {
        this.produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    public double hitungTotalSetelahDiskon() {
        double total = 0;
        for (Produk produk : produkList) {
            total += produk.hitungDiskon();
        }
        return total;
    }

    public void tampilkanProduk() {
        for (Produk produk : produkList) {
            System.out.println(produk.getNama() + " - Harga setelah diskon: " + produk.hitungDiskon());
        }
    }
}
    
    

