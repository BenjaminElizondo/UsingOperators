/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingoperators;

/**
 *
 * @author 20111
 */
public class UsingOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 4; 
        int y = 8;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        int sum;
        sum = x + y; //compute sum
        System.out.println("x + y = " + sum); //print sum
        
        int product;
        product = x * y;
        System.out.println("x * y = " + product);
        
        double average;
        average = sum / 2.0;
        System.out.println("x / y = " + average);
        
        double halfX;
        double halfY;
        
        halfX = x/2.0;
        System.out.println("x / 2.0 = " + halfX);
        halfY = y/2.0;
        System.out.println("y / 2.0 = " + halfY);
          
        /* 
        x = 4
        y = 8
        x + y = 12
        x * y = 32
        x / y = 6.0
        x / 2.0 = 2.0
        y / 2.0 = 4.0 */
    }
    
}
