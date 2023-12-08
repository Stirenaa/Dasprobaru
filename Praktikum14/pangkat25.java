public class pangkat25 {
    public static int pangkat(int x, int y){
        if (y == 0) {
        return 1;
        } else {
        return x * pangkat(x, y - 1);
        }
        
    }

    public static int pangkatIterative(int x, int y){
        int hasil = 1;

            for (int i = 1; i <=y; i++){
            hasil = hasil * x;
            System.out.print(x + "x");
        }
            System.out.print(1 + " = " + hasil);
            return hasil;

        // for (int i = 1; i <=y; i++){
        //     hasil = hasil * x;
        //     System.out.println("Hasil setelah iterasi ke-" + i + " adalah: " + hasil);
        // }
        // return hasil;

        // for (int i = 1; i <=y; i++){
        //     hasil = hasil * x;
        // }
        // return hasil;
        }

    public static void main(String[] args) {
        // System.out.println("6! Iteratifnya : " + pangkatIterative(6,4));
        pangkatIterative(7, 5);
    }
}

    

