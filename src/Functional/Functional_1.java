package Functional;

import java.util.List;
import java.util.stream.Collectors;

public class Functional_1 {
    public static void main(String[] args) {

    }

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {
        return strings.stream().map(str -> str += "*").collect(Collectors.toList());
    }

    public List<String> copies3(List<String> strings) {
        return strings.stream().map(str -> str + str + str).collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(str -> "y" + str + "y").collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(num -> (num + 1) * 10).collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(num -> num % 10).collect(Collectors.toList());
    }

    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    public List<String> noX(List<String> strings) {
        return strings.stream().map(str ->
        {
            String res = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != 'x') {
                    res += str.charAt(i);
                }
            }
            return res;
        }).collect(Collectors.toList());
    }


}
