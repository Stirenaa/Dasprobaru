public class faktorial25 {
    public static int faktorial(int n) {
        if (n ==0){
            return 1;
        } else {
            return n * faktorial(n - 1); 
        }
    }
    public static int faktorialIterative(int n) {
        int result = 1;

        for (int i = n; i >=1; i--){
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Faktorial dari angka 5 adalah: " + faktorial(5));
        System.out.println("Faktorial dari angka 5 dengan metode iteratif adalah: " + faktorialIterative(5));
    }
}


