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
public class soal_e {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        int tujuan;
        int total;
        int jarak1 = 169;
        int jarak2 = 452;
        int ongks1 = 2500;
        int ongks2 = 4000;
        
        System.out.println("Pilihan Kota Tujuan");
        System.out.println("1 = Surabaya");
        System.out.println("2 = Bandung");
        System.out.println("Masukkan Kota Tujuan = ");
        tujuan = input.nextInt();
        switch (tujuan){
            case 1 : System.out.println("Kota Tujuan Surabaya");
                     System.out.println("Jarak (KM)= " + jarak1);
                     System.out.println("Biaya Per KM= Rp." + ongks1);
                     total = jarak1*ongks1;
                     System.out.println("Total Biaya = Rp." + total);
                     break;
            case 2 : System.out.println("Kota Tujuan Bandung");
                     System.out.println("Jarak (KM)= " + jarak2);
                     System.out.println("Biaya Per KM= Rp." + ongks2);
                     total = jarak2*ongks2;
                     System.out.println("Total Biaya = Rp." + total);
                     break;
                     
                   
                   
        }
                
        
        
    }
    
}
