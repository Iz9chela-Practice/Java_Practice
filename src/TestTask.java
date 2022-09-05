import java.util.Arrays;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class TestTask {
    public static void main(String[] args) {
//        int numOfTasks;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of operations: ");
//        numOfTasks = scanner.nextInt();
//        Random random = new Random();
//        int num1;
//        int num2;
//        int operation;
//        int result;
//        int check;
//        long start;
//        long end = 12000;
//        boolean checkResult;
//        for (int i = numOfTasks; i > 0; i--) {
//            System.out.println("Number of tasks left " + numOfTasks);
//            operation = random.nextInt(0, 2);
//            num1 = random.nextInt(0, 100);
//            num2 = random.nextInt(0, 100);
//            System.out.println(num1 + " + " + num2);
//            start = System.currentTimeMillis();
//            System.out.println("Enter result: ");
//            check = scanner.nextInt();
//            if (operation == 0) {
//                checkResult = isResultTrue('-', num1, num2, check);
//                if(!checkResult || start > end){
//                    System.out.println("Incorrect result or timed out!");
//                    numOfTasks += 1;
//                }
//            } else if(operation == 1) {
//                checkResult = isResultTrue('+', num1, num2, check);
//                if(!checkResult || start > end){
//                    System.out.println("Incorrect result or timed out!");
//                    numOfTasks += 1;
//                }
//            }
//            else {
//                System.out.println("Unsupported Statement!");
//                break;
//            }
//        }

//        int[] array = new int[10];
//        for(int i = 0;i < 10; i++){
//            array[i] = i;
//        }
//        System.out.println(Arrays.toString(array));

//        int x = 5;
//        boolean b1 = true;
//        boolean b2 = false;
//
//        if ((x == 4) && !b2)
//            System.out.print("1 ");
//        System.out.print("2 ");
//        if ((b2 = true) && b1)
//            System.out.print("3 ");

//        int i = 42;
//        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
//        System.out.println(s);

//        System.out.println(calculate());

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            int j = 0;
            do {
                if (j == 5) {
                    break;
                }
                count++;
                j++;
            }
            while (j < 10);
        }
        System.out.println(count);

    }





    public static int calculate() {
        try {
            int i = 10, j = 0, k;
            k = i / j;
            return k;
        }
        catch (ArithmeticException ex) {
            return 0;
        }
        catch (Exception ex) {
            return Integer.MIN_VALUE;
        }
        finally {
            return 11;
        }
    }


    public static boolean isResultTrue(char operation, int num1, int num2, int enteredResult) {
            int result;
            if (operation == '-') {
                result = num1 - num2;
                if (enteredResult == result) {
                    System.out.println("Nice solution!");
                    return true;
                } else {
                    System.out.println("Incorrect, try another one!");
                    return false;
                }
            } else if (operation == '+') {
                result = num1 + num2;
                if (enteredResult == result) {
                    System.out.println("Nice solution!");
                    return true;
                } else {
                    System.out.println("Incorrect, try another one!");
                    return false;
                }
            }
            return false;
        }
    }
