import java.util.Scanner;

public class percobaan25{
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan harga barang
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();

        // Meminta pengguna memasukkan persentase diskon
        System.out.print("Masukkan persentase diskon (dalam persen): ");
        double persentaseDiskon = input.nextDouble();

        // Menghitung diskon
        double diskon = (persentaseDiskon / 100) * hargaBarang;

        // Menghitung harga setelah diskon
        double hargaSetelahDiskon = hargaBarang - diskon;

        // Menampilkan hasil
        System.out.println("Harga barang setelah diskon: " + hargaSetelahDiskon);

        // Menutup objek Scanner
        input.close();
    }
}

