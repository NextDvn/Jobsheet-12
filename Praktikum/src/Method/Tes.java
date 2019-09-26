/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class Tes {
    public static int hitung(int x, int y, int z)
{
        return x+y;
    
}
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan 1: ");
        int bil = input.nextInt();
        
        System.out.print("Masukkan bilangan 2: ");
        int bil1 = input.nextInt();
        
        hitung(bil,bil1);
    }
    
}
