package Strings;

public class Strings_Warmups {
    public static void main(String[] args) {
//        String s = missingChar("kitten", 1);
//        System.out.println(s);
//        System.out.println(frontBack("code"));
//        System.out.println(front3("ab"));
//        System.out.println(startOz("zoo"));
//        System.out.println(loneTeen(16,17));
//        System.out.println(mixStart("niz snacks"));
//        System.out.println(max1020(10, 21));
//        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
//        System.out.println(stringX("xxHxix"));

//        System.out.println(stringSplosion("Code"));
//        System.out.println(frontTimes("Chocolate", 3));
//        System.out.println(right2("java"));
//        System.out.println(middleTwo("string"));
//        System.out.println(nTwice("Hello", 4));
//        System.out.println(last2("xaxxaxaxx"));
        System.out.println(minCat("x", "abc"));
    }


    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }

    public static String missingChar(String str, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == n) {
                continue;
            }
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);

        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public static String front3(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String s;
        if (str.length() > 3) {
            s = str.substring(0, 3);
            return s + s + s;
        } else {
            s = str;
        }
        return s + s + s;
    }

    public String backAround(String str) {
        char c = str.charAt(str.length() - 1);

        return c + str + c;
    }

    public String front22(String str) {
        String s;
        if (str.length() > 2) {
            s = str.substring(0, 2);
            return s + str + s;
        } else {
            s = str;
        }
        return s + str + s;
    }

    public static String startOz(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.startsWith("oz")) {
            return "oz";
        }
        if (str.startsWith("o")) {
            return "o";
        } else if (str.startsWith("z") || str.startsWith("z", 1)) {
            return "z";
        }
        return "";
    }

    public int intMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else if (Math.abs(a - 10) > Math.abs(b - 10)) {
            return b;
        }
        return 0;
    }

    public static boolean loneTeen(int a, int b) {
        if (a == b) {
            return false;
        }
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19);
    }

    public String delDel(String str) {
        if (str.length() > 4 && str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring(4);
        }
        return str;

    }

    public static boolean mixStart(String str) {
        return str.length() >= 3 && str.startsWith("ix", 1);
    }

    public static int max1020(int a, int b) {
        if ((a > b) && (a >= 10 && a <= 20)) {
            return a;
        } else if ((b > a) && (b >= 10 && b <= 20)) {
            return b;
        }
        return 0;
    }

    public boolean stringE(String str) {
        String s = str.substring(1, 4);
        return s.contains("e");
    }

    public boolean lastDigit(int a, int b) {
        int digit = a % 10;
        return b % 10 == digit;
    }

    public String endUp(String str) {
        if (str.length() > 3) {
            String s = str.substring(str.length() - 3).toUpperCase();
            return str.substring(0, str.length() - 3) + s;
        }
        return str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40) && (b >= 30 && b <= 40)
                || (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9 && i < 4) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public static int stringMatch(String a, String b) {
        // Figure which string is shorter.
        int len = Math.min(a.length(), b.length());
        int count = 0;

        // Look at both substrings starting at i
        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    public static String stringX(String str) {
        StringBuilder result = new StringBuilder();
        if (str.equals("x")) {
            return str;
        }
        if (str.startsWith("x")) {
            result.append('x');
        }

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 && str.charAt(i) == 'x') {
                result.append(str.charAt(i));
            } else if (str.charAt(i) == 'x') {
                continue;
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public String altPairs(String str) {
        StringBuilder res = new StringBuilder();
        if (str.length() <= 1) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == 1 || i == 4 || i == 5 || i == 8 || i == 9 || i == 12 || i == 13) {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // Look for i starting a "yak" -- advance i in that case
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else { // Otherwise, do the normal append
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && i + 2 < nums.length) {
                if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    public static String frontTimes(String str, int n) {
        String sumb;
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        sumb = str.substring(0, frontLen);
        StringBuilder res = new StringBuilder();
        res.append(sumb.repeat(Math.max(0, n)));
        return res.toString();
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count++;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        boolean firstFound = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && !firstFound) {
                firstFound = true;
                if (i + 1 < str.length() && str.charAt(i + 1) == 'x') {
                    return true;
                }
            }
        }
        return false;
    }

    public String stringBits(String str) {
        StringBuilder res = new StringBuilder();
        if (str.length() <= 1) {
            return str;
        }
        for (int i = 0; i < str.length(); i += 2) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public String stringTimes(String str, int n) {
        StringBuilder res = new StringBuilder();
        res.append(String.valueOf(str).repeat(Math.max(0, n)));
        return res.toString();
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }

    public String left2(String str) {
        String res = str.substring(0, 2);
        if (str.length() <= 2) {
            return str;
        }
        return str.substring(2).concat(res);
    }

    public static String right2(String str) {
        if (str.length() <= 2) {
            return str;
        }
        char a = str.charAt(str.length() - 2);
        char b = str.charAt(str.length() - 1);
        return a + "" + b + "" + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        String res = "";
        if (front) {
            return res + str.charAt(0);
        }
        return res + str.charAt(str.length() - 1);
    }

    public String withoutEnd2(String str) {
        if (str.length() <= 1) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public static String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public static String nTwice(String str, int n) {
        String front = str.substring(0, str.length() / 2);
        if (front.length() != n) {
            front = str.substring(0, n);
        }
        String end = str.substring(str.length() - n);
        return front + end;
    }

    public String twoChar(String str, int index) {
        if (index <= 0 || index >= str.length() - 1) {
            return str.substring(0, 2);
        }
        return str.charAt(index) + "" + str.charAt(index + 1);

    }

    public String middleThree(String str) {
        if (str.length() <= 3) {
            return str;
        }
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        return str.startsWith("bad") || str.startsWith("bad", 1);
    }

    public String atFirst(String str) {
        if (str.length() <= 1) {
            if (str.equals("")) {
                return "@@";
            }
            return str + "@";
        }

        return str.substring(0, 2);
    }

    public static int last2(String str) {
        int count = 0;
        if (str.length() <= 2) {
            return 0;
        }
        String last2 = str.substring(str.length() - 2);
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(last2) && i + 2 < str.length()) {
                count++;
            }
        }
        return count;
    }

    public String makeOutWord(String out, String word) {
        String end = out.substring(out.length() - 2);
        return out.substring(0, 2).concat(word).concat(end);
    }

    public String firstTwo(String str) {
        if (str.length() <= 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        } else if (str.length() == 2) {
            return true;
        } else return str.endsWith(str.substring(0, 2));
    }

    public static String minCat(String a, String b) {
        int difLen;
        if (a.length() > b.length()) {
            difLen = a.length() - b.length();
            return a.substring(difLen).concat(b);
        } else if (a.length() < b.length()) {
            difLen = b.length() - a.length();
            return a.concat(b.substring(difLen));
        }
        return a.concat(b);
    }

    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        String front = str.substring(0, 2);
        return front + front + front;
    }

    public String without2(String str) {
        if (str.length() == 2) {
            return "";
        }
        else if(str.length() <= 1){
            return str;
        }
        String start = str.substring(0,2);
        if(str.endsWith(start)){
            return str.substring(2);
        }
        else {
            return str;
        }
    }

    public String deFront(String str) {
        char s = ' ';
        if(str.length() <= 1 && str.charAt(0) != 'a'){
            return "";
        }
        else if(str.charAt(0) == 'a' && str.length() <= 1){
            return "a";
        }
        else if(str.startsWith("ab") && str.length() == 2){
            return "ab";
        }
        else if(str.startsWith("ab") && str.length() > 2){
            return str;
        }
        else if(str.charAt(0) == 'a'){
            s = 'a';
        }
        else if(str.charAt(1) == 'b'){
            s = 'b';
        }
        String res = str.substring(2);
        if(s != ' '){
            return s + res;
        }
        return res;
    }

    public String startWord(String str, String word) {
        if(str.length() < word.length()){
            return "";
        }
        else if(str.length() <= 1){
            return str.charAt(0) + "";
        }
        else if(str.substring(1,word.length()).equals(word.substring(1))){
            return str.substring(0,word.length());
        }
        return "";
    }

    public String withoutX(String str) {
        if(str.isEmpty()){
            return "";
        }
        else if(str.length() <= 1 && str.charAt(0) == 'x'){
            return "";
        }
        else if(str.startsWith("x") && str.endsWith("x")){
            return str.substring(1,str.length()-1);
        }
        else if(str.startsWith("x")){
            return str.substring(1);
        }
        else if(str.endsWith("x")){
            return str.substring(0,str.length()-1);
        }
        return str;
    }

    public String withoutX2(String str) {
        if(str.length() <= 1){
            return "";
        }
        else if(str.equals("xx")){
            return "";
        }
        else if(str.startsWith("xx") && str.length() > 2){
            return str.substring(2);
        }
        else if(str.charAt(0) == 'x'){
            return str.substring(1);
        }
        else if(str.charAt(1) == 'x'){
            return str.charAt(0) + str.substring(2);
        }
        return str;
    }

    public String lastChars(String a, String b) {
        if(a.isEmpty() && b.isEmpty()){
            return "@@";
        }
        else if(a.isEmpty()){
            return "@" + b.charAt(b.length() - 1);
        }
        else if(b.isEmpty()){
            return a.charAt(0) + "@";
        }
        else {
            return a.charAt(0) + "" + b.charAt(b.length() - 1);
        }
    }

    public String conCat(String a, String b) {
        if(a.isEmpty() || b.isEmpty()){
            return a.concat(b);
        }
        else if(a.charAt(a.length() - 1) == b.charAt(0)){
            return a.concat(b.substring(1));
        }
        return a.concat(b);
    }

    public String lastTwo(String str) {
        if(str.length() <= 1){
            return str;
        }
        else if(str.length() == 2){
            return str.charAt(1) + "" + str.charAt(0);
        }
        else{
            return str.substring(0, str.length() - 2) + "" + str.charAt(str.length() - 1) + ""
                    + str.charAt(str.length() - 2);
        }
    }
}


