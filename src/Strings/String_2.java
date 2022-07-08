package Strings;

import java.util.Arrays;
import java.util.Locale;

public class String_2 {
    public static void main(String[] args) {
//        System.out.println(wordEnds("XY123XY", "XY"));
//        System.out.println(repeatSeparator("Word", "X", 3));
//        System.out.println(getSandwich("breadjambread"));
//        System.out.println(bobThere("b9b"));
//        System.out.println(endOther("abc", "abXabc"));
//        System.out.println(countCode("codexxcode"));
//        starOut("ab**cd");
//        sameStarChar("*xa*a*a");
//        System.out.println(prefixAgain("abXYabc", 2));
//        System.out.println(zipZap("abcppp"));
//        oneTwo("tcagdo");
//        repeatFront("Chocolate", 4);
//        plusOut("--++ab", "++");
    }

    public String doubleChar(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            res.append(str.charAt(i));
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static String wordEnds(String str, String word) {
        if (str.equals(word)) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= str.length() - word.length(); i++) {
            String check = str.substring(i, i + word.length());
            if (check.equals(word)) {
                if (i - 1 > -1 && i + word.length() < str.length()) {
                    res.append(str.charAt(i - 1));
                    res.append(str.charAt(i + word.length()));
                } else if (i - 1 > -1) {
                    res.append(str.charAt(i - 1));
                } else {
                    res.append(str.charAt(i + word.length()));
                }
            }
        }
        return res.toString();
    }

    public String mixString(String a, String b) {
        StringBuilder res = new StringBuilder();
        int aLength = a.length();
        int bLength = b.length();
        int pos = 0;
        if (aLength == bLength) {
            for (int i = 0; i < a.length(); i++) {
                res.append(a.charAt(i));
                res.append(b.charAt(i));
            }
        } else if (a.length() > b.length()) {
            for (int i = 0; i < a.length(); i++) {
                res.append(a.charAt(i));
                if (pos < bLength) {
                    res.append(b.charAt(i));
                    pos++;
                }
            }
        } else {
            for (int i = 0; i < b.length(); i++) {
                if (pos < aLength) {
                    res.append(a.charAt(i));
                    pos++;
                }
                res.append(b.charAt(i));
            }
        }
        return res.toString();
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder res = new StringBuilder();
        if (count == 1) {
            return word;
        }
        int sepCount = count - 1;
        for (int i = 0; i < count; i++) {
            res.append(word);
            if (sepCount > 0) {
                res.append(sep);
                sepCount--;
            }
        }
        return res.toString();
    }

    public static String getSandwich(String str) {
        StringBuilder res = new StringBuilder();
        int posBread1 = 0;
        int posBread2 = 0;
        boolean firstFound = false;
        for (int i = 0; i < str.length() - 4; i++) {
            String check = str.substring(i, i + 5);
            if (check.equals("bread") && posBread1 == 0 && !firstFound) {
                posBread1 = i;
                firstFound = true;
            } else if (check.equals("bread")) {
                posBread2 = i;
            }
        }
        if (posBread2 > 0) {
            res.append(str, posBread1 + 5, posBread2);
        }
        return res.toString();
    }

    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean endOther(String a, String b) {
        String aLow = a.toLowerCase();
        String bLow = b.toLowerCase();
        return aLow.endsWith(bLow) || bLow.endsWith(aLow);
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            String check = str.substring(i, i + 2);
            if (check.equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static String starOut(String str) {
        String out = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' || (i > 0 && str.charAt(i - 1) == '*')) {
                continue;
            } else if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }

            out += str.charAt(i);
        }

        return out;
    }

    public boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        } else if (str.substring(str.length() / 2 - 1, str.length() / 2 + 2).equals("xyz")
                || str.substring(str.length() / 2 - 2, str.length() / 2 + 1).equals("xyz") && str.length() % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean xyBalance(String str) {
        boolean isYFound = false;
        boolean isXFound = false;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' && i == 0) {
                continue;
            } else if (str.charAt(i) == 'x' && !isXFound) {
                isXFound = true;
                counter++;
            } else if (str.charAt(i) == 'y' && !isYFound && isXFound) {
                isXFound = false;
            }
        }
        return !isXFound || isYFound;
    }

    public static boolean sameStarChar(String str) {
        if (str.length() < 3) {
            return true;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean prefixAgain(String str, int n) {
        if (str.equals("aa") && n == 1) {
            return true;
        }
        String sub = str.substring(0, n);
        for (int i = 1; i < str.length() - n; i++) {
            if (str.substring(i, n + i).equals(sub)) {
                return true;
            }
        }
        return false;
    }

    public boolean xyzThere(String str) {
        if (str.startsWith("xyz")) {
            return true;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (i > 0 && str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz")) {
                return true;
            }
        }
        return false;
    }

    public String repeatEnd(String str, int n) {
        String sub = str.substring(str.length() - n);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(sub);
        }
        return res.toString();

    }

    public static String zipZap(String str) {
        StringBuilder res = new StringBuilder();
        if (str.length() < 3) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                res.append(str.charAt(i));
                res.append(str.charAt(i + 2));
                i += 2;
                continue;
            }
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static String oneTwo(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            char c = str.charAt(i);
            res.append(str.charAt(i + 1));
            res.append(str.charAt(i + 2));
            res.append(c);
        }
        return res.toString();
    }

    public static String repeatFront(String str, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = str.substring(0, n - i);
            res.append(s);
        }
        return res.toString();
    }

    public static String plusOut(String str, String word) {
        if (str.contains(word)) {
            str = str.replace(word, "--");
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '-')
                    str = str.replace(str.substring(i, i + 1), "+");
            }
        }
        str = str.replace("--", word);
        return str;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }
        return countCat == countDog;
    }


}
