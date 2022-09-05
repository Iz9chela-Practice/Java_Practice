package hackerRank;

import java.util.Scanner;

public class Tasks {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }

    public String isWeird(int N) {
        N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N < 1 || N > 100) {
            return "";
        } else if ((N % 2 != 0) || (N >= 6 && N <= 20 && N % 2 == 0)) {
            System.out.println("Weird");
        } else if ((N >= 2 && N <= 5 && N % 2 == 0) || (N >= 20 && N % 2 == 0)) {
            System.out.println("Not Weird");
        }
        scanner.close();
        return "";
    }
}
