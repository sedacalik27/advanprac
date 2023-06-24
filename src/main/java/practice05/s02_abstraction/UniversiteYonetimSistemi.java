package practice05.s02_abstraction;

public class UniversiteYonetimSistemi {
    public static void main(String[] args) {
        BilgisyarBilimleri bm= new BilgisyarBilimleri();
        bm.dersAdi = "Temel Bilgisayar -1";
        System.out.println(bm);
        System.out.println(bm.kategoriAdi());

        Isletme isletme = new Isletme();
        System.out.println(isletme.kategoriAdi());


    }





}
