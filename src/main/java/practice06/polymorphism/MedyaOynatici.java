package practice06.polymorphism;

public class MedyaOynatici {
    public static void main(String[] args) {


        Medya medya=new Medya("dosya.txt");

        SesDosyasi sd= new SesDosyasi("Ses Dosyasi.mp3");
        sd.oynat();
    }
}
