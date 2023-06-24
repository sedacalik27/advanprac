package practice01;

import java.util.Scanner;

public class S07_StringManipulations {
    public static void main(String[] args) {
        /*
        Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
        Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
        Örnek: Mark Hansel Twain ==> HT
    */

        Scanner input =new Scanner(System.in);
        System.out.println("adınızı, ikinci adınızı ve  soyadinizi giriniz");

        String tamIsim =input.nextLine().toUpperCase();

        char ikiciAdinIlkHarfi=tamIsim.charAt(tamIsim.indexOf(" ")+1); //boşluktan sonraki ilk characteri almak için +1 yazdık

        char soyAdinIlkHarfi=tamIsim.charAt(tamIsim.lastIndexOf(" ")+1);


        System.out.println("" + ikiciAdinIlkHarfi + soyAdinIlkHarfi);



















    }
}
