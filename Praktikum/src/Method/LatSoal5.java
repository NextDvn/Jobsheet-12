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
public class LatSoal5 {
    
    //proses
    public static void hitung(int a,int b,int c)
    {
        if(a>b && a>c){
            System.out.println("Nilai yang terbesar adalah: "+a);
        }else if(b>a && b>c){
            System.out.println("Nilai yang terbesar adalah: "+b);
        }else{
            System.out.println("Nilai yang terbesar adalah: "+c);
        }
            
    }
    
    //input
    public static void main(String[]args){
        System.out.println("==Membandingkan bilangan terbesar==");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan I  : ");
        int bil1=input.nextInt();
        
        System.out.print("Masukkan bilangan II : ");
        int bil2=input.nextInt();
        
        System.out.print("Masukkan bilangan III: ");
        int bil3=input.nextInt();
        
        hitung(bil1,bil2,bil3);
    }
    
}
