/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ukl {

    public static boolean isPrima(int bilangan) {
        if (bilangan <= 1) {
            return false; // Bilangan kurang dari 1 bukan bilangan prima
        }     
        for (int i = 2; i <= bilangan / 2; i++) {
            if (bilangan % i == 0) {
                return false; // Bilangan habis dibagi selain 1 dan dirinya sendiri
            }
        }         
        return true; // Bilangan prima
    }
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
       int bilangan = scanner.nextInt();               
        
        boolean prima = true;
        
        if (bilangan <= 1) {
            prima = false;
        } else {
            for (int i = 2; i <= bilangan / 2; i++) {
                if (bilangan % i == 0) {
                    prima = false;
                    break;
                }
            }  
           
        // Menampilkan hasil
        if (prima) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        scanner.close();
    }
}
}
   
  
        



    

