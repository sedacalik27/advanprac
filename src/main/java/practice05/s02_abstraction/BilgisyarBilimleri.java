package practice05.s02_abstraction;

public class BilgisyarBilimleri extends Kurs{

    @Override
    public String kategoriAdi() {
        return "Bilgisayar";
    }

    @Override
    public String toString() {
        return "BilgisyarBilimleri{" +
                "dersAdi='" + dersAdi + '\'' +
                ", ogretmenAdi='" + ogretmenAdi + '\'' +
                ", dersSaati=" + dersSaati +
                ", kursUcreti=" + kursUcreti;
    }
}
