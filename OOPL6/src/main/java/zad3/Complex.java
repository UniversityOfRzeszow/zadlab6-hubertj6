/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

                                                               
import java.util.Scanner;                                                        
public class Complex                                                           
{                                                                                
 public static void main(String[] args)                                          
 {                                                                               
  Scanner in = new Scanner(System.in);                                           
  System.out.println("podaj pierwszą liczbę:");                                  
  System.out.print("Część rzeczywista: ");                                       
   int re1 = in.nextInt();                                                        
  System.out.print("Część urojona: ");                                           
  int im1 = in.nextInt();                                                        
  System.out.println(" ");                                                       
  if ( im1 < 0 )                                                                 
  {                                                                              
   System.out.println("Wprowadzono liczbę: "+re1+" - "+ Math.abs(im1) + "i");    
  }                                                                              
  else                                                                           
  {                                                                              
   System.out.println("Wprowadzono liczbę: "+re1+" + "+im1+"i");                 
  }                                                                              
  System.out.println(" ");                                                       
  System.out.println("podaj drugą liczbę:");                                     
  System.out.print("Część rzeczywista: ");                                       
  int re2 = in.nextInt();                                                        
  System.out.print("Część urojona: ");                                           
  int im2 = in.nextInt();                                                        
  System.out.println(" ");                                                       
  if ( im2 < 0 )                                                                 
  {                                                                              
   System.out.println("Wprowadzono liczbę: "+re1+" - "+ Math.abs(im2)+"i");      
  }                                                                              
  else                                                                           
  {                                                                              
   System.out.println("Wprowadzono liczbę zespoloną: "+re1+" + "+im2+"i");       
  }                                                                              
  System.out.println(" ");                                                       
  System.out.println("<><><><><><><><><><><><><><><><><><><>");                                             

 }                                                                               

    public static void DodawanieAlg(int re1, int im1, int re2, int im2)
    {
        Scanner in = new Scanner(System.in);
        int reW=0;                                                                     
        int imW=0;                                                                     
        int mat = in.nextInt(); 
        reW= re1+re2;                                                                 
        imW= im1+im2;
        if ( imW < 0 )                                                                  
 {                                                                               
  System.out.println("Wynik: "+ reW + " - "+ Math.abs(imW) +"i");                
 }                                                                               
 else                                                                            
 {                                                                               
  System.out.println("Wynik: "+ reW + " + "+ imW +"i"); 
        
    }

    
}   
     public static void moduł(int re1, int im1)
    {
        Scanner in = new Scanner(System.in);
        int mod=0;                                                                                                                                          
        int mat = in.nextInt(); 
        mod = (int) Math.sqrt(Math.pow(re1,2)+Math.pow(im1,2));                                                                                                                                            
  System.out.println("moduł: "+ mod);                
 
        
    }
      public static void Sprzeżenie(int re1, int im1)
    {
        Scanner in = new Scanner(System.in);
        int reW=0;                                                                     
        int imW=0;                                                                     
        int mat = in.nextInt(); 
        reW = re1;                                                              
        imW=(-1)*im1;  
                                                                        
  System.out.println("Sprzeżenie: "+ reW + " + "+ imW +"i"); 
        
    }
      
     public static void Zamaiana__aw(int re1, int im1)
    {
        Scanner in = new Scanner(System.in);
        int reW=0;                                                                     
        int imW=0;
        int a,b;
        int mat = in.nextInt();
        int mod=0;                                                                                                                                          
        mod = (int) Math.sqrt(Math.pow(re1,2)+Math.pow(im1,2));
        a=re1/mod;
        b=im1/mod;
         System.out.println("Wynik: "+ mod + "( "+ a +" + "+"i"+ b);
        
    }

    public static void MnożenieAlg(int re1, int im1, int re2, int im2)
    {
        Scanner in = new Scanner(System.in);
        int reW=0;                                                                     
        int imW=0;                                                                     
        int mat = in.nextInt(); 
        reW=re1*re2-im1*im2;                                                          
        imW=re2*im1+re1*im2;
        if ( imW < 0 )                                                                  
 {                                                                               
  System.out.println("Wynik: "+ reW + " - "+ Math.abs(imW) +"i");                
 }                                                                               
 else                                                                            
 {                                                                               
  System.out.println("Wynik: "+ reW + " + "+ imW +"i"); 
        
    }

    
}   
}

