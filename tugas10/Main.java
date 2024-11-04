/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas10;

/**
 *
 * @author loq
 */
public class Main {
    
     public static void main(String[] args) {
        Elektronik produkElektronik = new Elektronik();
        double hargaElektronik = 500000.00;

         System.out.println("Harga Elektronik: " + hargaElektronik);
         System.out.println("Pajak Elektronik (10%): " + produkElektronik.hitungPajak(hargaElektronik));
        
        Makanan produkMakanan = new Makanan();
        double hargaMakanan = 30000.00;
        
        System.out.println("\nHarga Makanan: " + hargaMakanan);
        System.out.println("Pajak Makanan (5%): " + produkMakanan.hitungPajak(hargaMakanan));
    }
}
    
    

