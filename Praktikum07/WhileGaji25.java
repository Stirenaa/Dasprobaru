import java.util.Scanner;
public abstract class WhileGaji25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.println("Masukkan jumlah Karyawan: ");
        jumlahKaryawan = sc.nextInt();
       
        int i = 0;
        while (i < jumlahKaryawan){
            System.out.println("Pilihlah jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke- " + (i+i) + ": ");
            jabatan = sc.next();
            System.out.println("Masukkan jumlah jam lembur");
            jumlahJamLembur = sc.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }  else {
                System.out.println("Jabatan tidak valid. Silakan masukkan direktur, manajer, atau karyawan");
            }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("total gaji lembur :" + totalGajiLembur);
         sc.close();
    }
   
}

