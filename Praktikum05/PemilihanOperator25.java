import java.util.Scanner;

public class PemilihanOperator25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pertama:");
        double angka1 = scanner.nextDouble();

        System.out.println("Masukkan angka kedua:");
        double angka2 = scanner.nextDouble();

        System.out.println("Masukkan operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        
        double hasil = 0;

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                System.exit(1); // Keluar dari program jika terjadi pembagian dengan nol
            }
        } else {
            System.out.println("Operator tidak valid.");
            System.exit(1); // Keluar dari program jika operator tidak valid
        }

        System.out.println("Hasil: " + hasil);
        scanner.close();
    }
}
