package Letcode;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int number;
        int total=0;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Sayı Giriniz: ");
            number = sc.nextInt();
          if (number%4==0){
              total+=number;
          }
        } while (number % 2 == 0);
        System.out.println("Sayıların Toplamı: "+ total);



    }
}
