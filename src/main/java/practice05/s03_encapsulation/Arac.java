package practice05.s03_encapsulation;

public class Arac {
    private String marka;
    private String model;
    private String yakitTuru;
    private double gunlukKiraBedeli;

    //get git ara bul getir
    //set ayarlıyor yani degistiriyor


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public double getGunlukKiraBedeli() {
        return gunlukKiraBedeli;
    }

    public void setGunlukKiraBedeli(double gunlukKiraBedeli) {
        this.gunlukKiraBedeli = gunlukKiraBedeli;
    }
}
