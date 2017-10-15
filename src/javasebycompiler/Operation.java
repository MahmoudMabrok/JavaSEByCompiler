/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasebycompiler;

import java.util.Scanner;

/**
 *
 * @author motamed
 */
public class Operation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int x , n_pos =0 ,n_neg=0 , n_div_4=0 ,n_prime=0  ; 
        for (int i = 0; i < 6; i++) {
            x=in.nextInt();
            if (x >= 0)
                n_pos ++ ; 
            else 
                n_neg++; 
            if (x%4 == 0 )
                n_div_4++ ; 
            if (isPrime(x))
                n_prime++ ;
        }
        System.out.println("n_prime = " + n_prime);
        System.out.println("n_pos = " + n_pos);
        System.out.println("n_neg = " + n_neg);
        System.out.println("n_div_4 = " + n_div_4);
    }
    public static boolean isPrime(int x )
    {
    if (x<2 )
        return false ; 
    else  if (x == 2 )
        return true ; 
    else 
    {
        for (int i = 2; i <= (int)(Math.sqrt(x)); i++) {
            if (x%i == 0 )
                return false ; 
        }
        return true; 
    
    
    
    
    }
        
    
    }
            
            
            
            

}
