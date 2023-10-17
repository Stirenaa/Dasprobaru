import java.util.Scanner;
public class SoalMandiri1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3;


        System.out.print("Masukkan bil1 : ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bil2 : ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bil3 : ");
        bil3 = sc.nextInt();

        if ((bil1 > bil2) && (bil1>bil3)){
            System.out.println("bilangan terbesar " + bil1);
        }else if((bil2 > bil3) && (bil2>bil1)){
            System.out.println("bilangan terbesar " + bil2);
        }else if ((bil3 > bil1) && (bil3 > bil2)) {
            System.out.println("bilangan terbesar " + bil3);
        }
            
        

            

    }
}
