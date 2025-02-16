/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspertemuan2;
import java.util.Scanner;
/**
 *
 * @author marif
 */
public class NO2 {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan uang tabungan kamu : ");
        double uang = input.nextFloat();
        
        System.out.println("Apakah sudah punya pasangan?");
        boolean pasangan = input.nextBoolean();
                
        boolean akanNikah = (uang > 10000000)&& pasangan;
        
        System.out.println("Kamu akan menikah: " +akanNikah);
    }
}
