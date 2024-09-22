/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author loq
 */
public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Civic turbo", 200, 4, "Bensin");
        System.out.println("Informasi Mobil:");
        mobil.tampilkanInfo();

        System.out.println("\n");

        SepedaMotor sepedaMotor = new SepedaMotor("Vario", 120, 2, true);
        System.out.println("Informasi Sepeda Motor:");
        sepedaMotor.tampilkanInfo();
    }
}

