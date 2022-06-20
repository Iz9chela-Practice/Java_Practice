package Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class Array_1 {
    public static void main(String[] args) {
//        System.out.println(maxTriple(new int[]{5, 1, 3, 7, 1}));
        System.out.println(Arrays.toString(rotateLeft3(new int[]{1, 2, 3})));
    }

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean double23(int[] nums) {
        if (nums.length > 1) {
            return nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3;
        }
        return false;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int start1(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) {
            if (a.length > b.length && a[0] == 1) {
                return 1;
            } else if (a.length < b.length && b[0] == 1) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (a[0] == 1 && b[0] == 1) {
                return 2;
            } else if (a[0] == 1 || b[0] == 1) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
                break;
            }
        }
        return nums;
    }

    public static int maxTriple(int[] nums) {
//        int max = 0;
//        for(int i = 0;i < nums.length - 1;i+=2){
//            max = nums[i];
//            for(int j = 1; j < 3;j++){
//                if(i+j < nums.length - 1 && max < nums[i+j]){
//                    max = nums[i+j];
//                }
//            }
//        }
//        return max;
        int result = 0;
        int a = nums[0];
        int b = nums[((nums.length + 1) / 2) - 1];
        int c = nums[nums.length - 1];
        if (a > b && a > c)
            result = a;
        if (b > a && b > c)
            result = b;
        if (c > a && c > b)
            result = c;
        return result;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) {
            if (a.length > b.length) {
                return new int[]{a[0]};
            } else if (a.length < b.length) {
                return new int[]{b[0]};
            } else {
                return new int[]{};
            }
        }
        return new int[]{a[0], b[0]};
    }

    public boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }

    public int[] midThree(int[] nums) {
        if (nums.length <= 3) {
            return nums;
        }
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
    }

    public static int[] rotateLeft3(int[] nums) {
        return new int[]{nums[nums.length - 2], nums[nums.length - 1], nums[0]};
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[a.length / 2], b[b.length / 2]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        return (nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)
                || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
    }

    public boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int[] res = new int[nums.length * 2];
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public int[] swapEnds(int[] nums) {
        int first = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = first;
        return nums;
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int[] makeMiddle(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    public int sum2(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length >= 2) {
            return nums[0] + nums[1];
        }
        return 0;
    }

    public int[] reverse3(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums.length - i - 1];
        }
        return res;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] res = new int[a.length * b.length];
        res[0] = a[0];
        res[1] = a[1];
        res[2] = b[0];
        res[3] = b[1];
        return res;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        return new int[]{nums[0], nums[1]};
    }

    public int[] make2(int[] a, int[] b) {
        if (a.length == 0 && b.length > 0) {
            return new int[]{b[0], b[1]};
        } else if (a.length == 1 && b.length > 0) {
            return new int[]{a[0], b[0]};
        }
        return new int[]{a[0], a[1]};
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sum1 = 0;
        int sum2 = 0;
        for (int num : a) {
            sum1 += num;
        }
        for (int num : b) {
            sum2 += num;
        }
        if (sum1 > sum2) {
            return a;
        } else if (sum2 > sum1) {
            return b;
        }
        return a;
    }

    public int[] maxEnd3(int[] nums) {
        int[] res = new int[nums.length];
        int num = Math.max(nums[0], nums[nums.length - 1]);
        Arrays.fill(res, num);
        return res;
    }
}
