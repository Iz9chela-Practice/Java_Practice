package logic;

public class Logic_1 {
    public static void main(String[] args) {
//        System.out.println(shareDigit(12, 23));
//        System.out.println(less20(8));
//        teaParty(3, 8);
//        in1To10(9, true);
//        inOrderEqual(2, 5, 11, false);
//        sumLimit(8, 3);
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (a - b == c) || (b - a) == c;
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        }
        return 0;
    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        }
        return str;
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        }
        return n + "!";
    }

    public boolean old35(int n) {
        return (n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0);
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && a == b && a == c) {
            return 10;
        } else if (a == b && a == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMorning && isMom && !isAsleep) {
            return true;
        } else if (!isMorning && !isMom && !isAsleep) {
            return true;
        } else if (isMorning && !isMom && !isAsleep) {
            return false;
        } else return isMom && !isAsleep;
    }

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    public static boolean shareDigit(int a, int b) {
        return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b % 10 || a % 10 == b / 10;
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return (isSummer && (temp >= 60 && temp <= 100)) || (!isSummer && (temp >= 60 && temp <= 90));
    }

    public boolean love6(int a, int b) {
        return a + b == 6 || a == 6 || b == 6 || Math.abs(a - b) == 6 || Math.abs(b - a) == 6;
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (!isWeekend && (cigars >= 40 && cigars <= 60)) || isWeekend && cigars >= 40;
    }

    public boolean nearTen(int num) {
        return num % 10 < 3 || num % 10 >= 8;
    }

    public static boolean less20(int n) {
        return n % 20 == 19 || n % 20 == 18;
    }

    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }

    public static int teaParty(int tea, int candy) {
        if ((tea >= 5 && candy >= 5) && ((tea >= candy * 2) || (candy >= tea * 2))) {
            return 2;
        } else if (tea >= 5 && candy >= 5) {
            return 1;
        }
        return 0;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65) {
                return 0;
            } else if (speed > 66 && speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        } else if (speed <= 60) {
            return 0;
        } else if (speed > 61 && speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode && (n <= 1 || n >= 10)) {
            return true;
        } else if (!outsideMode && (n >= 1 && n <= 10)) {
            return true;
        }
        return false;
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        } else if (ab == (10 + bc) || ab == (10 + ac)) {
            return 5;
        }
        return 0;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                return die1 + 1;
            }
            sum += 1;
            return sum;
        }
        return sum;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (b > a && c > b && !bOk) {
            return true;
        } else if (bOk && c > b) {
            return true;
        }
        return false;
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk && b > a && c > b) {
            return true;
        } else if (equalOk && b >= a && c >= b) {
            return true;
        }
        return false;
    }

    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static int sumLimit(int a, int b) {
        int sum = a + b;
        int sum1 = sum;
        int anotherA = a;
        int countA = 0;
        int countSum = 0;
        while (a != 0) {
            a /= 10;
            countA++;
        }
        while (sum != 0) {
            sum /= 10;
            countSum++;
        }
        if (countA == countSum) {
            return sum1;
        } else if (countSum > countA) {
            return anotherA;
        }
        return 0;
    }

    public boolean lessBy10(int a, int b, int c) {
        int high = Math.max(a, b);
        high = Math.max(high, c);
        return high - a >= 10 || high - b >= 10 || high - c >= 10;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation && (day >= 1 && day <= 5)) {
            return "10:00";
        } else if (vacation && (day == 0 || day == 6)) {
            return "off";
        } else if (!vacation && (day >= 1 && day <= 5)) {
            return "7:00";
        } else {
            return "10:00";
        }
    }
}
