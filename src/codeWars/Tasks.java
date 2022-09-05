package codeWars;

public class Tasks {
    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//        int[] exampleTest1 = {2, 6, 8, -10, 3};
//        int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
//        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
//        System.out.println(find(exampleTest1));
//        System.out.println(find(exampleTest2));
//        System.out.println(find(exampleTest3));
//        String abc = "abc";
//        String s = abc.substring(1,2);
//        System.out.println(s);
//        System.out.println(isIsogram("isogram"));
//        System.out.println(isIsogram("moose"));
//        System.out.println(isIsogram("isIsogram"));
//        System.out.println(isIsogram("aba"));
//        System.out.println(isIsogram("moOse"));
//        System.out.println(isIsogram("thumbscrewjapingly"));
//        System.out.println(isIsogram(""));

    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    static int find(int[] integers) {
        if (integers.length < 3) {
            return 0;
        }
        int oddCount = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 != 0) {
                oddCount++;
            }
        }
        boolean isOddCountGreaterThan1 = oddCount > 1;
        for (int i = 0; i < integers.length; i++) {
            if (!isOddCountGreaterThan1 && integers[i] % 2 != 0) {
                return integers[i];
            } else if (isOddCountGreaterThan1 && integers[i] % 2 == 0) {
                return integers[i];
            }
        }

        return 0;
    }

    public static int TwiceAsOld(int dadYears, int sonYears) {
        int res = 0;
        if (dadYears - sonYears * 2 > 0) {
            res = dadYears - sonYears * 2;
        } else if (dadYears - sonYears * 2 < 0) {
            res = sonYears * 2 - dadYears;
        } else {
            return 0;
        }
        return res;
    }

    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }

    public static long breakChocolate(long n, long m) {
        if (n <= 0 || m <= 0) {
            return 0;
        }

        return n * m - 1;
    }
    public static String maskify(String str) {
        //TODO
        throw new UnsupportedOperationException("Unimplemented");
    }

    public static boolean  isIsogram(String str) {
        if(str.isEmpty() || str.isBlank()){
            return true;
        }
        for(int i = 0;i < str.length() - 1;i++){
            String s = str.substring(i,i+1).toLowerCase();
            for (int j = i+1; j < str.length();j++){
                String s2 = str.substring(j,j+1).toLowerCase();
                if(s.equals(s2)){
                    return false;
                }
            }
        }
        return true;
    }
}
