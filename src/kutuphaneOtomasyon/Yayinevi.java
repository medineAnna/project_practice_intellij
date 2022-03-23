package kutuphaneOtomasyon;

public class Yayinevi {
    private String yayinEviAdi;
    private String yayinEviAdresi;


    public void bilgilerigetir() {
        System.out.println("Yayinevi{" +
                "yayinEviAdi='" + yayinEviAdi + '\'' +
                ", yayinEviAdresi='" + yayinEviAdresi + '\'' +
                '}');
    }

    public Yayinevi(String yayinEviAdi, String yayinEviAdresi) {
        this.yayinEviAdi = yayinEviAdi;
        this.yayinEviAdresi=yayinEviAdresi;
    }
    public Yayinevi(){

    }

    public String getYayinEviAdresi() {
        return yayinEviAdresi;
    }

    public void setYayinEviAdresi(String yayinEviAdresi) {
        this.yayinEviAdresi = yayinEviAdresi;
    }

    public String getYayinEviAdi() {
        return yayinEviAdi;
    }

    public void setYayinEviAdi(String yayinEviAdi) {
        this.yayinEviAdi = yayinEviAdi;
    }
}
