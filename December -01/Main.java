import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        long n = sc.nextLong();

        int count = 0;

        for (long i = 1; i * i <= n; i++) {
            System.out.print((i * i) + " ");
            count++;
        }

        System.out.println(); 
        System.out.println(count);
    }
}
