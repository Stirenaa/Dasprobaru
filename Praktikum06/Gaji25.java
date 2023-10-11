import java.util.Scanner;
public class Gaji25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;
        
        System.out.println("Masukkan kategori");
        kategori = sc.nextLine();
        System.out.println("penghasilan");
        penghasilan = sc.nextInt();
        System.out.println("gajiBersih");
        gajiBersih = sc.nextInt();
        System.out.println("pajak");
        pajak = sc.nextDouble();

        if (kategori.equals("pekerja")){
            if (penghasilan <= 2000000)
            pajak = 0.10;
            else if (penghasilan <= 3000000)
            pajak = 0.15;
            else 
                pajak = 0.2;
            gajiBersih = (int) (penghasilan -(pajak * penghasilan));
            System.out.println("penghasilan Bersih : " + gajiBersih);
        } else if (kategori.equals( "pebisnis")){
            if (penghasilan <= 2500000)
            pajak = 0.15;
            else if (penghasilan <= 3500000)
            pajak = 0.20;
            else
                pajak = 0.25;
            gajiBersih =(int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih :" + gajiBersih);
        } else 
        System.out.println("Masukan kategori salah");
    }

}
