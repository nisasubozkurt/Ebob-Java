/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ebob;
import java.util.Scanner;
public class Ebob {

    public static void main(String[] args) {
       Scanner giris = new Scanner (System.in);
       
       System.out.println("İlk tam sayıyı giriniz: ");
       int sayi1 = giris.nextInt();
       System.out.println("İknici tamsayıyı giriniz: ");
       int sayi2 = giris.nextInt();
       
       int ebob = 0; //başlangıç ebobu
       int k = 2 ;
       while(k<=sayi1 && k<=sayi2){
           if(sayi1 % k == 0 && sayi2 % k == 0)
               ebob = k ; // ebob güncelle
               k++ ;
           
       }
     System.out.println(sayi1 + " ve " + sayi2 + " için " + " En büyük ortak böleni: " + ebob);
    }
    
}
