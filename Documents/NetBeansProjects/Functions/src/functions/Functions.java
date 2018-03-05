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
public class Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A & B\n");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = divide(a,b);
        double answer = multiplication(a,b);
        System.out.println("Answer is: "+answer);
        System.out.println("Result is: "+result);
        printHelloWorld();
        
    }
    
    public static  void printHelloWorld(){
       System.out.println("Hello World");

    }
    public static int divide(int a,int b){
        return a / b;
    }
    
    public static double multiplication(double a, double b){
        return a * b;
    
    }
    
}
