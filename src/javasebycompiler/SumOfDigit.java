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
public class SumOfDigit {
    public static void main(String[] args) { 
        Scanner  in  = new Scanner (System.in);
        int value = in.nextInt(); 
        int sum =getSum(value) ; 
        System.out.println("sum = " + sum);    
    }
    public static int getSum(int value)
    {
        int sum =0 ; 
        while (value > 0 )
        {
        sum+= (value%10); 
        value/=10; 
        }
        return sum ;
    }
    
    
}
