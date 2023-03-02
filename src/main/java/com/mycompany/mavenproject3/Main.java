/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author behlt
 */
public class Main {
    public static void main(String[] args) {
        //counts array with 10 elements
        int [] counts = new int[10];
        for (int i = 0; i < counts.length; i++){
            counts[i] = 0;
        }
        
        // bonus array with 15 elements
        int [] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++){
            bonus[i]++;
        }
        
        // best scores array
        int[] bestScores = {100,96,90,89,87};
        
        // Display of the five values of bestScores 
        System.out.println("Best Scores: ");
        for(int i = 0; i < bestScores.length; i++){
            System.out.println(bestScores[i]);
        }
    }
    
}
