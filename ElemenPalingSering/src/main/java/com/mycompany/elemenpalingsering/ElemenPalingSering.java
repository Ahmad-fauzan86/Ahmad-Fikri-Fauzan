/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elemenpalingsering;


/**
 *
 * @author ASUS
 */
public class ElemenPalingSering {

    public static void main(String[] args) {      
        // Array 
        int[] array = {3, 7, 3, 1, 7, 7, 5}; 

        
        // Variabel 
        int palingSeringMuncul = 0;
        int nilaiTertinggi = 0;

        
        // Perulangan 
        for (int i = 0; i < array.length; i++) {
            int a = 0;
      
            
        // artimatika
        for (int j = 0; j < array.length; j++) {
            if (array[i] == array[j]) {
               a++;
                }
            }
 
        
        
        // Percabangan
        if (a > palingSeringMuncul) {
            palingSeringMuncul = a;
            nilaiTertinggi = array[i];
            }
        }

        
        System.out.println("Nilai tertinggi yang paling sering muncul adalah " + nilaiTertinggi + " sebanyak " + palingSeringMuncul + " kali");
    }
}