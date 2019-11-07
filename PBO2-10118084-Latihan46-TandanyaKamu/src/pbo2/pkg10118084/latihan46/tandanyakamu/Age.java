/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan46.tandanyakamu;

/**
 *
 * @author Freza
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red;
    
    public Age(int yearNow){
        this.yearNow = 2019;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    public int hitungUmur(){
        return yearNow-yearBirth;
    
    }
    public String tandanyaKamu(int umur){
         
        if(umur<=5){
            System.out.println("LAGI LUCU-LUCU NYA");
        }
        else if(umur<=10){
            System.out.println("MASIH ANAK-ANAK");
        }
        else if(umur<=13){
            System.out.println("MASIH REMADJA");
        }
        else if(umur<=19){
            System.out.println("ALAY");
        }
        else if(umur<=29){
            System.out.println("LAGI GALAU  NYARI JODOH");
            
        }
        else if(umur<=35){
            System.out.println("LAGI SIBUK NYARI UANG");
            
        }
        else if(umur<=150){
            System.out.println("Sudah Tua");
        }
        else{
            System.out.println("TIDAK TERDETEKSI KEHIDUPAN");
    }
        return "";
       
        
    }
    
    
}
