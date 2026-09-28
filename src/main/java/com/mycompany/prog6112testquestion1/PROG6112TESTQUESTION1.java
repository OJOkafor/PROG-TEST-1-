/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112testquestion1;

/**
 *
 * @author emeris
 */
public class PROG6112TESTQUESTION1 {

    public static void main(String[] args) {
        
       String[] city = {"CAPE TOWN" , "PORT ELIZABETH" , "PRETORIA"};
         String[] consoles = {"PS5", "XBOX", "SWITCH"}; 
         
         int[][] salesData = {
            {1000, 2000, 3000}, // CAPE TOWN SALES 
            {2000, 3000, 4000}, // PORT ELIZABETH SALES 
            {1500,  1100,  1200}  // PRETORIA SALES 
        };
        
        
        
       
        for (int i = 0; i < salesData.length; i++) {
            int cityTotal = 0; // Reset total for the current city
        
        for (int j = 0; j < salesData[i].length; j++) {
                cityTotal += salesData[i][j];
            }
    }
        
        
        System.out.println("------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT :");
        System.out.println("------------------------------------------");
    
        System.out.println("|                        | PS5   | XBOX   | SWITCH | ");
    // Row 1: CAPE TOWN 
        int capeTotal = salesData[0][0] + salesData[0][1] + salesData[0][2];
        System.out.printf("| %-15s | %, -15d | %, -15d | %, -15d | %, -15d |%n", 
                city[0], salesData[0][0], salesData[0][1], salesData[0][2]);

        // Row 2: PORT ELIZABETH
        int portTotal = salesData[1][0] + salesData[1][1] + salesData[1][2];
        System.out.printf("| %-15s | %, -15d | %, -15d | %, -15d | %, -15d |%n", 
                city[1], salesData[1][0], salesData[1][1], salesData[1][2]);

        // Row 3: PRETORIA
        int pretoriaTotal = salesData[2][0] + salesData[2][1] + salesData[2][2];
        System.out.printf("| %-15s | %, -15d | %, -15d | %, -15d | %, -15d |%n", 
                city[2], salesData[2][0], salesData[2][1], salesData[2][2]);

        
       System.out.println("------------------------------------------");
       System.out.println("CONSOLE SALES TOTALS FOR EACH CITY: ");
       System.out.println("------------------------------------------");
       
       System.out.printf(city[0], capeTotal);
       System.out.printf(city[1], portTotal);
       System.out.printf(city[2], pretoriaTotal);
       System.out.printf("CITY WITH THE MOST SALES:" , city[1]);
       
}
}












