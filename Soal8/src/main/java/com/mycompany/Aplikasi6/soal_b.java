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
public class soal_b {
    public static void main(String arg[]){
        Scanner input = new Scanner (System.in);
        double harga = 660000;
        double jmlh ;
        double total ;
        double diskon ;
        double setdiskon ;
        System.out.println("Harga Printer Epson T20 Rp." + harga);
        System.out.println("Masukkan jumlah beli = ");
        jmlh = input.nextDouble();
        total = harga*jmlh;
        
        /*diskon*/
        if (total > 1500000) {
            System.out.println("Total Harga RP." + total);
            diskon = total*0.15;
            setdiskon = total-diskon;
            System.out.println("Diskon = Rp. " + diskon);
            System.out.println("Harga Setelah Diskon = Rp. " + setdiskon);
            
        }
        else {
            System.out.println("Total Harga" + total);
        }
    }
    
    
    
}
