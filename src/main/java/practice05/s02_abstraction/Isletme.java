package practice05.s02_abstraction;

public class Isletme extends Kurs{

    @Override
    public String kategoriAdi() {
        return "İşletme";
    }

    @Override
    public String toString() {
        return "Isletme{" +
                "dersAdi='" + dersAdi + '\'' +
                ", ogretmenAdi='" + ogretmenAdi + '\'' +
                ", dersSaati=" + dersSaati +
                ", kursUcreti=" + kursUcreti ;
    }
}
