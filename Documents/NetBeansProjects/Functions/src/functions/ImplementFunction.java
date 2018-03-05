/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.Scanner;

/**
 *
 * @author mangu
 */
public class ImplementFunction {
    
    static Functions function = new Functions();
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A & B\n");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = function.divide(a,b);
        System.out.println("Result is: "+result);

        
    }
    
}
