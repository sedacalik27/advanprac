package practice05.s03_encapsulation;

public class AracKiralamaUygulamasi {
    public static void main(String[] args) {
        Arac arac= new Arac();//bu obje uzerinden değişkenlere ulaşmanın yolu getter ve setterdir.
        arac.setMarka("Mercedes");
        arac.setModel("CLA");
        System.out.println("arac adi = " + arac.getMarka());


    }
}
