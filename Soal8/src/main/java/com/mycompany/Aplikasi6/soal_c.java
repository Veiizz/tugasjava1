/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Aplikasi6;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class soal_c {
    public static void main(String arg[]){
     Scanner input = new Scanner(System.in);
     int upah = 2500;
     int jam ;
     int total ;
     System.out.println("Upah perjam Rp." + upah);
     System.out.println("Masukkan jumlah jam Kerja = ");
     jam = input.nextInt();
     total = upah*jam;
     System.out.println("Total upah kerja = Rp." + total);
    }
   
    
    
}
