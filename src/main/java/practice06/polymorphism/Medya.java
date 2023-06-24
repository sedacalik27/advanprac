package practice06.polymorphism;

public class Medya {
    private String dosyaAdi;

    public Medya(String dosyaAdi) {//parametreli constructor+
        this.dosyaAdi = dosyaAdi;
    }

    public void oynat(){
        System.out.println("Dosya oynatılıyor");
    }
    public void durdur(){
        System.out.println("Dosya durduruluyor");
    }

    @Override
    public String toString() {
        return "Medya{" +
                "dosyaAdi='" + dosyaAdi + '\'' +
                '}';
    }
}
