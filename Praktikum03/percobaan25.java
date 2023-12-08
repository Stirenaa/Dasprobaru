import java.util.Scanner;
public class percobaan25{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();

        
        System.out.print("Masukkan persentase diskon (dalam persen): ");
        double persentaseDiskon = input.nextDouble();

        
        double diskon = (persentaseDiskon / 100) * hargaBarang;

        
        double hargaSetelahDiskon = hargaBarang - diskon;

        
        System.out.println("Harga barang setelah diskon: " + hargaSetelahDiskon);

    
    }
}

