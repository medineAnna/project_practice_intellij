package kutuphaneOtomasyon;

public class Kitap {
    private String kitapAdi;
    private String kitapIsNo;
    private String aciklama;
    private Yazar yazar;
    private Yayinevi yayinevi;

    public void kitapBilgileri () {
      System.out.println( "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", kitapIsNo='" + kitapIsNo + '\'' +
                ", aciklama='" + aciklama + '\'' +
                ", yazar=" + yazar +
                ", yayinevi=" + yayinevi +
                '}');
    }

    public Kitap(String kitapAdi, String kitapIsNo, String aciklama, Yazar yazar, Yayinevi yayinevi ) {
        this.kitapAdi = kitapAdi;
        this.kitapIsNo=kitapIsNo;
        this.aciklama=aciklama;
        this.yazar=yazar;
        this.yayinevi=yayinevi;
    }


    public Yayinevi getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(Yayinevi yayinevi) {
        this.yayinevi = yayinevi;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getKitapIsNo() {
        return kitapIsNo;
    }

    public void setKitapIsNo(String kitapIsNo) {
        this.kitapIsNo = kitapIsNo;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }
}
