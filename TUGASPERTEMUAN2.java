/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan2;

import java.util.Scanner;
/**
 *
 * @author marif
 */
public class TUGASPERTEMUAN2 {

    public static void main(String[] args) {
        Scanner inputAngka = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama");
        float a = inputAngka.nextFloat();
        
        System.out.println("Masukkan angka kedua");
        float b = inputAngka.nextFloat();
        
        System.out.println("Masukkan angka ketiga");
        float c = inputAngka.nextFloat();
            
        float penjumlahan = a + b + c;
        
        float pengurangan = a - b - c;
        
        float perkalian = a * b * c;
        
        float pembagian = a / b / c;
        
        System.out.println("Hasil penjumlahan: " +penjumlahan);
        System.out.println("Hasil penjumlahan: " +pengurangan);
        System.out.println("Hasil penjumlahan: " +perkalian);
        System.out.println("Hasil penjumlahan: " +pembagian);
        
        
    }
}
