package HastaneProjesi;

public class HastaneRunner {

    private static Hastane hastane1 = new Hastane();

    public static void main(String[] args) {

        String hastaDurumu = "DM";//"Allerji", "Bas Agri", "DM", "Soguk Alginlik", "Migren", "Kalp Hastaliklar"
        String unvan = doktorUnvan(hastaDurumu);

        hastane1.setDoktor(doktorBul(unvan));
        hastane1.setHasta(hastaDurumBul(hastaDurumu));

        System.out.printf("Doktor Ismi: " + hastane1.getDoktor().getIsim());
        System.out.println("Doktor Soyismi: " + hastane1.getDoktor().getSoyisim());
        System.out.println("Doktor Unvani: " + hastane1.getDoktor().getUnvan());

        System.out.println("Hasta Ismi: " + hastane1.getHasta().getIsim());
        System.out.println("Hasta Soyismi: " + hastane1.getHasta().getSoyisim());
        System.out.println("Hasta ID: " + hastane1.getHasta().getHastaId());
        System.out.println("Hasta Durumu: " + hastaDurumu);

    }

    public static String doktorUnvan(String aktuelDurum) {

        if (aktuelDurum.equalsIgnoreCase("Allerji")) {
            return "Allergist";
        } else if (aktuelDurum.equalsIgnoreCase("Bas Agrisi")) {
            return "Norolog";
        } else if (aktuelDurum.equalsIgnoreCase("DM")) {
            return "Genel Cerrahi";
        } else if (aktuelDurum.equalsIgnoreCase("Soguk Alginligi")) {
            return "Cocuk Doktoru";
        } else if (aktuelDurum.equalsIgnoreCase("Migren")) {
            return "Dahiliye";
        } else if (aktuelDurum.equalsIgnoreCase("Kalp Hastaliklari")) {
            return "Kardiolog";
        } else
            return "Yalnis Unvan";
    }
        public static Doktor doktorBul(String unvan){
            Doktor doktor=new Doktor();

            for (int i = 0; i < doktor.getUnvan().length(); i++) {
                if (doktor.un) {
                    
                }

            }

            return doktor;
        }
        public static Durum hastaDurumBul(String aktuelDurum){

            Durum hastaDurum=new Durum();
            switch ();
            return hastaDurum;
        }
}
