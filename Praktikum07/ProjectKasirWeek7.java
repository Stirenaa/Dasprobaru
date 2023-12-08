import java.util.Scanner;

public class ProjectKasirWeek7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaItem;
        int jumlahItem;
        double hargaItem;

        System.out.println("Masukkan nama item:");
        namaItem = scanner.nextLine();

        System.out.println("Masukkan jumlah item:");
        jumlahItem = scanner.nextInt();

        System.out.println("Masukkan harga item:");
        hargaItem = scanner.nextDouble();

        double totalHarga = jumlahItem * hargaItem;

        System.out.println("\nFaktur Kasir:");
        System.out.println("-------------------");
        System.out.println("Nama Item:\t" + namaItem);
        System.out.println("Jumlah Item:\t" + jumlahItem);
        System.out.println("Harga Item:\t" + hargaItem);
        System.out.println("Total Harga:\t" + totalHarga);
        System.out.println("-------------------");
    }
}