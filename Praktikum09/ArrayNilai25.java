import java.util.Scanner;
public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiAkhir = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan Nilai AKhir Semester mahasiswa ke-" + (i+1) + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
      for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan Nilai AKhir mahasiswa ke-" + (i+1) + " Adalah " + nilaiAkhir[i] );
           
        }
    }
}
