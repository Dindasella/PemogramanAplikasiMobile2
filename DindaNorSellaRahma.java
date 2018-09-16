/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindanorsellarahma;

/**
 *
 * @author Dinda Sella
 */
public class DindaNorSellaRahma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiAndroid = 85;
        String wajah = "cantik";
        String asal = "Malang";
        

        System.out.println("Apakah mau menikah ?");
        char nilaiAndroidHuruf;
        if(nilaiAndroid >= 85){
            nilaiAndroidHuruf = 'A';
        }
        else if(nilaiAndroid >= 75){
            nilaiAndroidHuruf = 'B';
        }
        else if(nilaiAndroid >= 65){
            nilaiAndroidHuruf = 'C';
        }
        else if(nilaiAndroid >= 55){
            nilaiAndroidHuruf = 'D';
        }
        else{
            nilaiAndroidHuruf = 'E';
        }
        
        
        if(nilaiAndroidHuruf == 'A' && wajah == "cantik" && asal == "Malang"){
            System.out.println("Mau Banget");
        }
        else if((nilaiAndroidHuruf == 'A' || nilaiAndroidHuruf == 'C') && wajah == "cantik" && asal == "Malang"){
            System.out.println("Boleh Lahh");  
        }
        else if(asal == "Malang"){
            System.out.println("Saya pikir pikir dulu");
        }
        else{
            System.out.println("Absolutely No");
        }
    }
    
}