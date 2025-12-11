import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int decWidth = String.valueOf(N).length();
        int octWidth = Integer.toOctalString(N).length();
        int hexWidth = Integer.toHexString(N).length();
        int binWidth = Integer.toBinaryString(N).length();

        System.out.printf("%" + decWidth + "s  %" + octWidth + "s  %" + hexWidth + "s  %" + binWidth + "s\n",
                          "Dec", "Oct", "Hex", "Bin");

        for (int i = 1; i <= N; i++) {
            String hexValue = Integer.toHexString(i).toUpperCase();
            String binValue = Integer.toBinaryString(i);

            System.out.printf("%" + decWidth + "d  %" + octWidth + "o  %" + hexWidth + "s  %" + binWidth + "s\n",
                              i, i, hexValue, binValue);
        }
    }
}
