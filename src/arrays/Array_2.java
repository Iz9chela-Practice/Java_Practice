package arrays;

public class Array_2 {
    public static void main(String[] args) {
//        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
//        System.out.println(Arrays.toString(pre4(new int[]{1, 2, 4, 1})));
//        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));
//        System.out.println(Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1})));
//        System.out.println(Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3})));


    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length + i - len]) {
                return false;
            }
        }
        return true;
    }

    public int[] fizzArray3(int start, int end) {
        int[] res = new int[end - start];
        int pos = 0;
        for (int i = start; i < end; i++) {
            res[pos] = i;
            pos++;
        }
        return res;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) {
                sum += num;
            }
        }
        return sum == 8;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] res = new String[end - start];
        int pos = 0;
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res[pos] = "FizzBuzz";
            } else if (i % 3 == 0) {
                res[pos] = "Fizz";
            } else if (i % 5 == 0) {
                res[pos] = "Buzz";
            } else {
                res[pos] = String.valueOf(i);
            }
            pos++;
        }
        return res;
    }

    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
                    || (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0)) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean oneFound = false;
        for (int num : nums) {
            if (num == 1) {
                oneFound = true;
            } else if (oneFound && num == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] == 7 && nums[i + 1] == 7)
                    || (nums[i] == 7 && nums[i + 2] == 7)
                    || (nums[i + 1] == 7 && nums[i + 2] == 7)) {
                return true;
            }
        }
        return false;
    }

    public int bigDiff(int[] nums) {
        int max = 0;
        int min = 21000000;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    public static int[] pre4(int[] nums) {
        int length = 0;
        for (int j : nums) {
            if (j == 4) {
                break;
            }
            length++;
        }
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = nums[i];
        }
        return res;
    }

    public boolean either24(int[] nums) {
        boolean foursFound = false;
        boolean twoFound = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 2 && nums[i + 1] == 2)) {
                twoFound = true;
            } else if ((nums[i] == 4 && nums[i + 1] == 4)) {
                foursFound = true;
            }
        }
        if (twoFound && foursFound) {
            return false;
        }
        return twoFound || foursFound;
    }

    public boolean no14(int[] nums) {
        boolean oneFound = false;
        boolean fourFound = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                oneFound = true;
            } else if (nums[i] == 4) {
                fourFound = true;
            }
        }
        return !oneFound || !fourFound;
    }

    public boolean haveThree(int[] nums) {
        int count = 0;
        if (nums.length >= 1 && nums[0] == 3) {
            count++;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 3 && nums[i] == 3) {
                return false;
            }
            if (nums[i] == 3) {
                count++;
            }
        }
        return count == 3;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 2) {
                continue;
            }
            if (i >= 1 && nums[i - 1] == 2) {
                continue;
            }
            if (i < (nums.length - 1) && nums[i + 1] == 2) {
                continue;
            }
            return false;
        }
        return true;
    }

    public int[] fizzArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] += i;
        }
        return res;
    }

    public static int centeredAverage(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        return (sum - min - max) / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else if (nums[i] == 13 && i + 1 < nums.length) {
                i += 1;
                continue;
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        int count = 0;
        boolean isFound = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6 && !isFound) {
                sum += nums[i];
            } else if (nums[i] == 6) {
                isFound = true;
            } else if (nums[i] == 7 && isFound) {
                isFound = false;
            }
        }
        return sum;
    }

    public static int[] zeroFront(int[] nums) {
        int[] res = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                res[nums.length - count - 1] = nums[i];
                count++;
            }
        }
        return res;
    }

    public int[] withoutTen(int[] nums) {
        int[] res = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                res[count] = nums[i];
                count++;
            }
        }
        return res;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public int[] tenRun(int[] nums) {
        if (nums.length == 0) {
            return new int[]{};
        }
        int[] res = new int[nums.length];
        if (nums[0] == 0) {
            return new int[nums.length];
        }
        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] / 10 > 0) {
                number = nums[i];
                res[i] = number;
            } else if (number > 0) {
                res[i] = number;
            } else {
                res[i] = nums[i];
            }
        }
        return res;
    }

    public boolean more14(int[] nums) {
        int oneCount = 0;
        int fourCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                oneCount++;
            } else if (nums[i] == 4) {
                fourCount++;
            }
        }
        return oneCount > fourCount;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if ((nums2[i] - nums1[i] == 1 || nums2[i] - nums1[i] == 2
                    || nums2[i] - nums1[i] == -1 || nums2[i] - nums1[i] == -2) && nums1[i] != nums2[i]) {
                count++;
            }
        }
        return count;
    }

    public static int[] shiftLeft(int[] nums) {
        if(nums.length == 0){
            return new int[]{};
        }
        int last = nums[0];
        int[] res = new int[nums.length];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            res[count] = nums[i];
            count++;
        }
        res[count] = last;
        return res;
    }




}
