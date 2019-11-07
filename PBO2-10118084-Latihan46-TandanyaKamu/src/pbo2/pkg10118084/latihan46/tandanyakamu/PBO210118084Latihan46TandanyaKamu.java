/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan TandanyaKamu

 */
public class PBO210118084Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Age age = new Age(0);
        System.out.print("Masukkan Tahun Lahir anda :");
        age.setYearBirth(scanner.nextInt());
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda :"+age.getYearBirth());
        System.out.println("Hari ini tahun : "+age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur());
        System.out.print("Tandanya Kamu :");age.tandanyaKamu(age.hitungUmur());
    }
    
}
