package practice01;

import java.util.Scanner;

public class S06_Regex_Ve_StringManipulations {
     /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız.
       Ad ayrı, soyad ayrı sekilde ekrana yazdırınız.
       Örnek:
          Ad: Ali
          Soyad: Can
    */

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("lutfen adınızı soyadinizi giriniz");
        String adSoyad =input.nextLine();

        String ad=adSoyad.split(" ")[0];
        String soyad=adSoyad.split(" ")[1];


        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


        System.out.println();



        String ad1 =adSoyad.trim().replaceAll("\\s+", " ").split(" ")[0];
        String soyAd=adSoyad.trim().replaceAll("\\s+", " ").split(" ")[1];

        System.out.println("ad1 " +ad1+"\n"+"soyad :"+soyAd);

















    }























}
