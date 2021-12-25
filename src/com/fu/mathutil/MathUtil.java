/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author pc
 */
public class MathUtil {
     
    //n! = 1.2.3.4.5.n
    
        public static long getFactorial(int n) {
            if (n < 0 || n > 20)
                throw new IllegalArgumentException("Invalid argument. n mút be between 0..20");
            //ham dung lien ko cần return
            //xuống đây là n = 0..20 rồi
            if (n == 0 || n == 1)
                return 1; //dùng ngay khi n đặc biệt 
            // xuống đến đây, n = 2..200 r
            // chơi for hoặc đệ quy - recursion
            long product = 1; // tích khởi đầu =1 , nhồi 2 3 4 5 6 7 .. n
            for (int i = 2; i <= n; i++) 
               // product = product * i;
              product *= i;
              return product;
            } // nhân từ 2 đến
        } 

            
                        
                    
            
        



    
