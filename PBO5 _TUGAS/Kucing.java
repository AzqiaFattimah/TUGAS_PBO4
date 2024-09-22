/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author loq
 */
public class Kucing extends Hewan {

    public Kucing(String nama, int usia) {
        super(nama, "Kucing", usia);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
        System.out.println("Suara: Meong!");
    }
}




