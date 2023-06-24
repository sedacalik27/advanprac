package practice05.s01_inheritance;

import java.time.LocalDate;

public class BankaYonetimSistemi {
    //paremetresiz cons kullandıgımızda herseferinde bm1. dite tek tek yazıcaz
    //bunu yazmak yerine musteri clasında sag tıklayıp generate deyip constructor yaptık.
    //bk1. deyince vergino ve şirketadi gelmedi çünkü biz objemizi bireyselmusteriler adıyla oluşturduk.


    public static void main(String[] args) {
        LocalDate dogumTarihi= LocalDate.of(1985,03,16);

        BireyselMusteriler bm1= new BireyselMusteriler(
                "Ali Can",
                555687958,
                2000,
                "12345678901",
                dogumTarihi);

        System.out.println(bm1);



        System.out.println("-------------------------");

        bm1.paraCekme(2001);

        KurumsalMusteri km1=new KurumsalMusteri(
                "Ahmet Yılmaz",
                135451,
                10000,
                "1235468",
                "Techpro Education");

        System.out.println(km1);
        km1.paraYatirma(8000);


    }
}
