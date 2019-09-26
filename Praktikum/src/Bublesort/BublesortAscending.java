/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bublesort;

import java.util.Arrays;

/**
 *
 * @author grand
 */
public class BublesortAscending {
    public static void main(String[]args){
        //deklarasi
        int[]bilangan = {12,4,1,9,15};
        System.out.println("Bilangan sebelum Bubble sort: "+Arrays.toString(bilangan));
        
        //proses
        System.out.println("Proses bubble sort ascending:");
        for(int a = 0; a <bilangan.length; a++){
            System.out.println("Iterasi "+(a+1));
            for(int b=0; b <bilangan.length-1; b++){
                if(bilangan[b]>bilangan[b+1]){
                    int temp = bilangan[b];
                    bilangan[b]=bilangan[b+1];
                    bilangan[b+1]=temp;
                }
                System.out.println(Arrays.toString(bilangan));
            }
            System.out.println();
    }
    }
    
}
