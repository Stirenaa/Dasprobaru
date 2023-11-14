import java.util.Scanner;
public class SoalMandiri1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3;
        // int bil1 = 1;
        // int bil2 = 2;
        // int bil3 = 3;

        System.out.print("Masukkan bil1 : ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bil2 : ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bil3 : ");
        bil3 = sc.nextInt();

        if ( bil2 > bil1 ){
            if ( bil2 > bil3 ){
                System.out.println("Bilangan terbesar bil2");
            } else {
                System.out.println("bilangan terbesar bil3" );
            }
        } 
        else{
            System.out.println("Bilangan terbesar bil1");
        }
            

    }
}
  // variable declaration
       // int n1 = 5, n2 = 10, max;
 
        //System.out.println("First num: " + n1);
       // System.out.println("Second num: " + n2);
 
        // Largest among n1 and n2
       // max = (n1 > n2) ? n1 : n2;
 
        // Print the largest number
       // System.out.println("Maximum is = " + max);