package practice03;

public class S05_MethodOverloading_Kargo {
     /*
        İki farklı method oluşturun.
          - İlk method, bir paketin ağırlığını parametre olarak alacak ve kargo ücretini hesaplayıp döndürecek.
          - İkinci method ise bir paketin ağırlığı ve boyutları parametrelerini alacak ve
            bu bilgilere göre kargo ücretini hesaplayıp döndürecek.
        Bu methodları kullanarak farklı paketlerin kargo ücretlerini hesaplayın.
    */


    public static void main(String[] args) {
        double karguUcreti= kargoHesapla(5.2);
        System.out.println("karguUcreti = " + karguUcreti);//karguUcreti = 13.0

        double kargoUcreti2=kargoHesapla(35,5);
        System.out.println("kargoUcreti2 = " + kargoUcreti2);//kargoUcreti2 = 95.0


    }

    public static double kargoHesapla(double agirlik){
        return agirlik*2.5;// kargo fiyatının üstüne geldik inline variable atıklayınca aşagıdaki bu oldu
    }

    /*
    public static double kargoHesapla(double agirlik){
        double kargoFiyati= agirlik*2.5;
        return kargoFiyati;
    }
     */


    public static double kargoHesapla(double agirlik,double boyutlar){
        double kargoFiyati= agirlik*2.5 + boyutlar*1.5;
        return kargoFiyati;
    }




}
