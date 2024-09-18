/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author loq
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Azqiaa", 20, "Cybersecurity Engineer", 100000000);

        pekerja.tampilkanInfo();

        pekerja.setNama("Zara");
        System.out.println("\nSetelah perubahan nama:");
        pekerja.tampilkanInfo();
    }
}
    
      
    

