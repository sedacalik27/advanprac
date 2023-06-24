package practice05.s01_inheritance;

public class Musteri {

    //bu classı bireysel ve kurumsal müşterilerin ortak özelliklerini bir classta toplayabilmek için yaptk.
    //ve bu classı parent yaptık.
    String musteriAdi;
    int musteriNo;
    double hesapBakiyesi;

    public Musteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;
    }


    public void paraCekme(double para) {
        if (para <= hesapBakiyesi) {
            hesapBakiyesi -= para;
            System.out.println("Hesabınızdan " + para + "TL çekilmiştir");
            System.out.println("Yeni bakiyeniz " + hesapBakiyesi + "TL' dir");

        } else {
            System.out.println("Hesabinizda yeterli bakiyeniz bbulunmamaktadır.");
        }
    }

    public void paraYatirma (double para){
        hesapBakiyesi +=para;
        System.out.println("Hesabiniza " +para + "TL eklenmiştir.");
        System.out.println("Yeni bakiyeniz "+ hesapBakiyesi + "TL'dir.");
    }

    @Override
    public String toString() {
        return  "\n\tMüşteri Adı: " + musteriAdi +
                "\n\tMüşteri No: " + musteriNo +
                "\n\tHesap Bakiyesi: " + hesapBakiyesi;
    }
}
