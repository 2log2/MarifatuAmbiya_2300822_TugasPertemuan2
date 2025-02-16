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
public class NO3 {
    public static void main(String args[]) {
        
       char charX = 'X';
       char charY = 'y';
       
       int asciiX = (int)charX; 
       int asciiY = (int)charY;      
        
       int jumlah = asciiX + asciiY;
       
        System.out.println("Nilai ascii dari X adalah: " +asciiX);
        System.out.println("Nilai ascii dari y adalah: " +asciiY);
        System.out.println("Jumlah dari ascii X ditambah ascii y  = " +jumlah); 
    }
}
