/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SequentialSearching;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class LatihanArray1 {
    public static void main(String[] args){
        String find;
        boolean found = false;
        String[] hewan = new String[]{"Biawak","Nyambik","Kadal","Ular","Tapir"};
        Scanner erere = new Scanner(System.in);
        System.out.println("Masukkan Nama-nama hewan: ");
        find = erere.nextLine();
        for (int i=0; i<hewan.length; i++){
            if(find.equalsIgnoreCase(hewan[i])){
                found=true;
                break;
            }
        }
        if(found==true){
            System.out.println("Data found.");
        }else{
            System.out.println("Data not found.");
        }
                }
    
}

