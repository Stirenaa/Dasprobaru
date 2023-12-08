import java.util.Scanner;
public class Tugas25 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
        double hargaBarang,
               jumlahBarang,
               total,
               totalBayar,
               kembalian;
        
        hargaBarang = 7000;
        
        System.out.println("Harga Barang :" + hargaBarang);
        System.out.print("Masukkan Jumlah Barang yang akan di beli: ");
        jumlahBarang = sc.nextInt();
        
        total = hargaBarang * jumlahBarang;
        
        System.out.println("Total Harga" + total);
        System.out.print("Masukkan Total Pembayaran anda: ");
        totalBayar = sc.nextInt();

        kembalian = totalBayar - total;
        
        System.out.println("Kembalian: " +  kembalian);
}
}
