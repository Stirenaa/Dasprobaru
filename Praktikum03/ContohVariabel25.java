public class ContohVariabel25 {
    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Bermain League Of Legends";
        boolean isPandai = true;
        char JenisKelamin = 'L';
        byte umurSayaSekarang = 18;
        double ipk = 3.98,
               tinggi = 1.75;

        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah Pandai? " + isPandai);
        System.out.println("JenisKelamin: " + JenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println(String.format( "Saya Berumur %s dengan tinggi badan %s",umurSayaSekarang, tinggi));
    }

}