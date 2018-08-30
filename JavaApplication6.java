/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author lab208
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String mesvar = "";
        
        int num = 0;
        
        System.out.println("Digite o mes que vc quer");
       num = input.nextInt();
        switch (num) {
               
           case 1:
               mesvar= "janeiro";
               break;
           case 2:
               mesvar= "fevereiro";
               break;
           case 3:
               mesvar = "março";
               break;
           case 4:
               mesvar = "abril";
           break;
           case 5:
               mesvar = "maio";
           break;
           case 6:
               mesvar = "junho";
           break;
           case 7:
               mesvar = "julho";
           break;
           case 8:
               mesvar = "agosto";
           break;
           case 9:
               mesvar = "setembro";
           break;
           case 10:
               mesvar = "outubro";
           break;
           case 11:
               mesvar = "novembro";
           break;
           case 12:
               mesvar = "dezembro";
          break;
               
       }
        System.out.println("O mes selecionado foi: \n" +mesvar);    
             
        }
    }
    

