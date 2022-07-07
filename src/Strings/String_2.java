package Strings;

import java.util.Locale;

public class String_2 {
    public static void main(String[] args) {
//        System.out.println(wordEnds("XY123XY", "XY"));
//        System.out.println(repeatSeparator("Word", "X", 3));
//        System.out.println(getSandwich("breadjambread"));
//        System.out.println(bobThere("b9b"));
        System.out.println(endOther("abc", "abXabc"));
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
        for(int i = 0;i < str.length() - 1;i++){
            if(str.startsWith("hi", i)){
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


}
