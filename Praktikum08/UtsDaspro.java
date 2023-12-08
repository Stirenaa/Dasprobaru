import java.util.Scanner;

public class UtsDaspro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            String namaSiswa, nimSiswa, asalSekolah, pilihan, input;
            double nilaiLiterasi, nilaiPM, nilaiSkolastik, rata2 =0;
        
        System.out.println(" Masukkan Nama Anda :");
        namaSiswa =sc.nextLine();
        System.out.println("Masukkan NIM :");
        nimSiswa =sc.nextLine();
        System.out.println("Kategori SLTA(SMA/SMK/MA)");
        asalSekolah =sc.nextLine();

        System.out.println("Masukkan nilaiSkolastik: ");
        nilaiSkolastik = sc.nextDouble();
        System.out.println("Masukkan nilai Penalaran matematika: ");
        nilaiPM = sc.nextDouble();
        System.out.println("Masukkan nilai Literasi bahasa: ");
        nilaiLiterasi = sc.nextDouble();

            rata2 = (nilaiLiterasi + nilaiPM + nilaiPM) / 3;
            System.out.println(" Nilai Rata rata kamu" + rata2);

        System.out.println(" ----------------------------------------");
        System.out.println(" Nama : " + namaSiswa);
        System.out.println(" NIM : " + nimSiswa);
        System.out.println(" Kategori SLTA(SMA/SMK/MA) " + asalSekolah);
        System.out.println(" Nilai Penalaran Matematika :" + nilaiPM);
        System.out.println(" Nilai Literasi Bahasa :" + nilaiLiterasi);
        System.out.println(" Nilai Rata Rata Kamu : " + rata2);
        
        if (asalSekolah.equalsIgnoreCase("sma") || asalSekolah.equalsIgnoreCase("ma")) {
            System.out.println(" Kelas Matrikulasi Yang Diikuti : ");
            System.out.println(" Praktikum Rangkaian Listrik " );
            if ( nilaiPM < 75) {
                System.out.println(" Wajib mengikuti kalkulus 1 ");}
            
        } else if (asalSekolah.equalsIgnoreCase("smk")) {
            if (rata2 < 70) {
                System.out.println(" Wajib mengikuti praktikum Rangkaian Listrik ");}
        }

        if (nilaiLiterasi < 65) {
            System.out.println(" Bahasa Inggris Dasar ");}
        System.out.println(" ---------------------------------------- ");
        
        System.out.println(" Cek Mahasiswa Lainnya ? (y/n) " );
        boolean hasil = true;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                hasil = true;
                continue;
            } else if (input.equalsIgnoreCase(" n ")) {
                hasil = false;
               break;
            }
        }
        System.out.println("Hasil pemilihan anda: " + (hasil ? "Ya" : "Tidak"));

    }
}



    
