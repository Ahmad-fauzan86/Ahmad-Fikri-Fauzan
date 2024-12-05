/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.luaspermukaanbola;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LuasPermukaanBola {
     public static double hitungLuas(double r) {
        return 4 * 3.14 * r * r; // Rumus: 4 × π × r²
    }
     public static double luaslingkaran (double r){
         return 3.14 * r * r;
     }
    public static void main(String[] args) {
        System.out.println("Hello World!");
     
        Scanner scanner = new Scanner(System.in);
        
        // Input radius bola
        System.out.print("Masukkan radius bola: ");
        System.out.println("Masukkan radius luas lingkaran");
        double radius = scanner.nextDouble();
        
        System.out.println("Luas permukaan bola: " + hitungLuas(radius));
        System.out.println("luas linngkaran: "+ luaslingkaran(radius));
        scanner.close();
    }
}

    
