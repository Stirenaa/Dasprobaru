import java.util.Scanner;
public class WhileKelipatan25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, counter = 0, bilangan;
        Double rata;

        System.out.println("Masukkan bilangan 1-9 :");
        bilangan = sc.nextInt();

        int i = 0;
        while ( i < 50){
            if (i % bilangan == 0){
                total += i;
                ++counter;
            }
            ++i;
        }

        System.out.printf("Rentang 1-50 terdapat %d bilangan %d dengan total %d", counter, bilangan, total);
        System.out.println(" ");
        rata = (double) total / counter;
        System.out.println("rata rata : " + rata);
        sc.close();

    }
    
}