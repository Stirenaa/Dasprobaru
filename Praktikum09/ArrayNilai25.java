import java.util.Scanner;
public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;
        double nilaiRataRata = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int [] nilaiAkhir = new int [5];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukkan Nilai AKhir Semester mahasiswa ke-" + (i+1) + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
      for (int i = 0; i < 5; i++) {
        if (nilaiAkhir[i] > 70){
            System.out.println("Mahasiswa ke-" + (i+1) + " Lulus " );
            jumlahLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + " Tidak Lulus");
                jumlahTidakLulus++;
            }
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiAkhir[i];
                //System.out.println("Nilai Tertinggi" + nilaiTertinggi);
            }
            if (nilaiAkhir[i] < nilaiTerendah) {
                nilaiTerendah = nilaiAkhir[i];
                //System.out.println("NIlai Terendah" + nilaiTerendah);
            }
        }
            // Hitung nilai rata-rata
        for (int i = 0; i < nilaiAkhir.length; i++) {
            nilaiRataRata += nilaiAkhir[i];
        }
        nilaiRataRata /= nilaiAkhir.length;

        System.out.println( "Nilai Rata Rata :" + nilaiRataRata);
        System.out.println("Jumlah Mahasiswa Lulus :" +jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus :" + jumlahTidakLulus);
        System.out.println("Nilai Tertinggi :" + nilaiTertinggi);
        System.out.println("NIlai Terendah :" + nilaiTerendah);
        }
    }


 
    
 

