package com.percabangan;

import java.util.Scanner;
public class main {

  public static void main(String args[]) {
 
   Scanner input = new Scanner(System.in);
   
   System.out.println("Masukkan sebuah angka :");
   int angka = input.nextInt();
   
   //ganjil --> jika angka % 2 = 1
   //genap --> jika angka % 2 = 0
   
   if(angka % 2 == 0) {
     System.out.println("Angka" + angka + " adalah bilangan genap");
     } else{
       System.out.println("Angka"+ angka + " adalah bilangan ganjil");
     }
  }
}
