package aP_CS;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AP_1 {
    public static void main(String[] args) {
        String[] a = {"a", "c", "z"};
        String[] b = {"b", "f", "z"};
        int[] test = {3, 4, 5};
        String[] test1 = {"a", "b", "c", "d"};
//        scoresIncreasing(new int[]{1,3,4});
//        copyEvens(new int[]{3, 2, 4, 5, 8}, 2);
//        commonTwo(a,b);
//        mergeTwo(a, b, 3);
//        dividesSelf(42);
//        scoresAverage(test);
//        copyEndy(test, 2);
//        scoresClump(test);
        //wordsFront(test1, 1);

    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && (scores[i] == scores[i + 1])) {
                return true;
            }
        }
        return false;
    }

    public static int[] copyEvens(int[] nums, int count) {
        if (count <= 0) {
            return new int[]{};
        }
        int[] res = new int[count];
        int pos = 0;
        for (int num : nums) {
            if (num % 2 == 0 && pos != count) {
                res[pos] = num;
                pos++;
            }
        }
        return res;
    }

    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] arr = new String[n];
        int aIndex = 0;
        int bIndex = 0;

        for (int index = 0; index < n; index++) {
            if (a[aIndex].compareTo(b[bIndex]) < 0) {
                arr[index] = a[aIndex];
                aIndex++;
            } else if (a[aIndex].compareTo(b[bIndex]) > 0) {
                arr[index] = b[bIndex];
                bIndex++;
            } else {
                arr[index] = a[aIndex];
                aIndex++;
                bIndex++;
            }
        }

        return arr;
    }

    public List wordsWithoutList(String[] words, int len) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                list.add(word);
            }
        }
        return list;
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }
        return count;
    }

    public static boolean dividesSelf(int n) {
        for (int val = n; val != 0; val /= 10) {
            int digit = val % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
        }
        return true;
    }

    public static int scoresAverage(int[] scores) {
        int sum = 0;
        int firstHalf;
        int secondHalf;
        for (int i = 0; i < scores.length / 2; i++) {
            sum += scores[i];
        }
        firstHalf = sum / (scores.length / 2);
        sum = 0;
        for (int i = scores.length / 2; i < scores.length; i++) {
            sum += scores[i];
        }
        secondHalf = sum / (scores.length / 2);
        return Math.max(firstHalf, secondHalf);
    }

    public static int[] copyEndy(int[] nums, int count) {
        int[] res = new int[count];
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (res[pos] == 0 && (nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
                res[pos] = nums[i];
                if (pos < count - 1) {
                    pos++;
                }
            }
        }
        return res;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].isEmpty()) {
                score += 0;
            } else if (key[i].equals(answers[i])) {
                score += 4;
            } else if (!Objects.equals(key[i], answers[i]) && answers[i].equals("?")) {
                score += 0;
            } else if (!Objects.equals(key[i], answers[i])) {
                score--;
            }
        }
        return score;
    }

    public static boolean scoresClump(int[] scores) {
        for (int i = 0; i <= scores.length - 3; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) < 0) {
            return -1;
        } else if (aName.compareTo(bName) > 0) {
            return 1;
        } else if (aName.compareTo(bName) == 0) {
            return Integer.compare(aId, bId);
        }
        return 0;
    }

    public static String[] wordsFront(String[] words, int n) {
        String[] res = new String[n];
        int pos = 0;
        for (int i = 0; i < words.length; i++) {
            if (res[pos] == null) {
                res[i] = words[i];
                if (pos < n - 1) {
                    pos++;
                }
            }
        }
        return res;
    }




}
