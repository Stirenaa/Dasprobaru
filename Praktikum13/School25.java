public class School25 {
    public static void main(String[] args) {
        String[] student1A = {"Anna", "Aldrian", "Ali", "Arul"};
        String[] student1B = {"Bobby", "Bryan", "Brandon", "Bradley"};
        String[] student1C = {"Charlie", "Chris", "Chad", "Christopher"};
        String[] student1D = {"David", "Donovan", "Devin", "Dan"};

        // System.out.printf("-------------------------%n");
        // System.out.printf("| %-3s | %-15s |%n", "NO","NAME");
        // System.out.printf("-------------------------%n");

        // for (int i = 0; i < student1A.length; i++){
        //     System.out.printf("| %-3d | %-15s |%n",(i+1), student1A[i]);
        // }
        // System.out.printf("-------------------------%n");

        // System.out.printf("-------------------------%n");
        // System.out.printf("| %-3s | %-15s |%n", "NO","NAME");
        // System.out.printf("-------------------------%n");

        // for (int i = 0; i < student1A.length; i++){
        //     System.out.printf("| %-3d | %-15s |%n",(i+1), student1B[i]);
        // }
        // System.out.printf("-------------------------%n");

        // System.out.printf("-------------------------%n");
        // System.out.printf("| %-3s | %-15s |%n", "NO","NAME");
        // System.out.printf("-------------------------%n");

        // for (int i = 0; i < student1A.length; i++){
        //     System.out.printf("| %-3d | %-15s |%n",(i+1), student1C[i]);
        // }
        // System.out.printf("-------------------------%n");

        // System.out.printf("-------------------------%n");
        // System.out.printf("| %-3s | %-15s |%n", "NO","NAME");
        // System.out.printf("-------------------------%n");

        // for (int i = 0; i < student1A.length; i++){
        //     System.out.printf("| %-3d | %-15s |%n",(i+1), student1D[i]);
        // }
        // System.out.printf("-------------------------%n");

        display(student1A);
        display(student1B);
        display(student1C);
        display(student1D);

    }
    public static void display(String[] students) {
    System.out.printf("+++++++++++++++++++++++++%n");
    System.out.printf("| %-3s | %-15s |%n", "NO","NAME");
    System.out.printf("+++++++++++++++++++++++++%n");

    for (int i = 0; i < students.length; i++){
        System.out.printf("| %-3d | %-15s |%n",(i+1), students[i]);
    }
    System.out.printf("+++++++++++++++++++++++++%n");
}
}
