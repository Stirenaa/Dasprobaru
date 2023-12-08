import java.util.Scanner;
public class DoWhileCuti25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println(" Jatah Cuti ");
        jatahCuti = sc.nextInt();

        do {
            System.out.println("Apakah ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.println("Jumlah Hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah Cuti: " + jatahCuti);

                } else {
                    System.out.println("Sisa jatah Cuti anda tidak cukup");
                    break;
                }
              
            }
        }  while (jatahCuti > 0);
        
        sc.close();
    }
        
}
