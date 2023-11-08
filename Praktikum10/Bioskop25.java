//import java.util.Scanner;
public class Bioskop25 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        penonton[0][0] = "amir";
        penonton[0][1] = "Benny";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.printf("%s \t %s\n", penonton [0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton [1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton [2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton [3][0], penonton[3][1]);
    
        // System.out.println(penonton.length);
        // System.out.println(penonton[0].length);
        // System.out.println(penonton[1].length);
        // System.out.println(penonton[2].length);
        // System.out.println(penonton[3].length);
       
        //Soal Nomor 5
        //for (int i = 0; i < penonton.length; i++){
        //      System.out.println("Panjang Baris Ke-" + (i+1) + penonton[i].length);
        
        //Soal Nomor 6
        // for (String[] barisPenonton : penonton){
        //      System.out.println("Panjang Baris " +barisPenonton.length);
        
        //Soal Nomor 10
        // System.out.println("Penonton pada baris ke-3 : "  );
        // for (int i = 0; i < penonton[2].length; i++){
        //     System.out.println(penonton[2][i]);
        // }

        //Soal Nomor 11
        // System.out.println("Penonton pada baris ke-3: ");
        // for (String i : penonton[2]){
        //     System.out.println(i);
        // }

        //Soal Nomor 12
        for (int i = 0; i < penonton.length; i++){
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " +String.join(",",penonton[i]));
        }
        
    }
        
}

