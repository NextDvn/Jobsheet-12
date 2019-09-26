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
public class LatSoal4 {
    
    //method untuk rumus
    public static int hitung(int a,int b)
    {
        int c = a/b;
        System.out.println("Kecepatan kendaraan adalah: "+c+"KM/H");
        return c;
    }
    
    //proses input
    public static void main(String[]args)
    {
        System.out.println("==Menghitung kecepatan kendaraan KM/H==");
        System.out.println("Rumus kecepatan= Jarak/Waktu");
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nMasukkan jarak kendaraan: ");
        int jarak= input.nextInt();
        
        System.out.print("Masukkan waktu tempuh: ");
        int waktu= input.nextInt();
        
        hitung(jarak,waktu);
    }
    
}
