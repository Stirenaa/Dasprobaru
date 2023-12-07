import java.util.Scanner;

public class Fungsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of weeks: ");
        int numOfWeeks = input.nextInt();

        System.out.print("Enter number of students: ");
        int numOfStudents = input.nextInt();

        String[][] students = new String[numOfWeeks][numOfStudents];

        for (int i = 0; i < numOfWeeks; i++) {
            for (int j = 0; j < numOfStudents; j++) {
                System.out.printf("Enter name for student %d of week %d: ", j+1, i+1);
                students[i][j] = input.next();
            }
        }

        for (int i = 0; i < numOfWeeks; i++) {
            display(students[i]);
        }

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