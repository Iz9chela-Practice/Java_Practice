package maps;

import java.util.Map;

public class Maps_1 {
    public static void main(String[] args) {

    }

    public Map<String, String> mapBully(Map<String, String> map) {
        String value;
        if (map.containsKey("a")) {
            value = map.get("a");
            if (!value.isEmpty()) {
                map.put("b", value);
                map.put("a", "");
            }
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
            map.put("bread", "butter");
        }
        map.put("bread", "butter");
        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream") && (map.containsKey("spinach") && !map.get("spinach").isEmpty())) {
            map.put("yogurt", map.get("ice cream"));
            map.put("spinach", "nuts");
        } else if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        } else if ((map.containsKey("spinach") && !map.get("spinach").isEmpty())) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {
        if ((map.containsKey("potato") && !map.get("potato").isEmpty()) && (map.containsKey("salad")
                && !map.get("salad").isEmpty())) {
            map.put("fries", map.get("potato"));
            map.put("spinach", map.get("salad"));
        } else if (map.containsKey("salad") && !map.get("salad").isEmpty()) {
            map.put("spinach", map.get("salad"));
        } else if ((map.containsKey("potato") && !map.get("potato").isEmpty())) {
            map.put("fries", map.get("potato"));
        }
        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {
        boolean isContain_a = map.containsKey("a");
        boolean isContain_b = map.containsKey("b");
        if (isContain_a && isContain_b) {
            return map;
        } else if (isContain_a) {
            map.put("b", map.get("a"));
        } else if (isContain_b) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        boolean isContain_a = map.containsKey("a");
        boolean isContain_b = map.containsKey("b");
        if(!isContain_b || !isContain_a){
            return map;
        }
        int a_length = map.get("a").length();
        int b_length = map.get("b").length();
        if(isContain_a && isContain_b && (a_length == b_length)){
            map.put("a", "");
            map.put("b", "");
        }
        else if(isContain_a && isContain_b && (a_length > b_length)){
            map.put("c", map.get("a"));
        }
        else{
            map.put("c", map.get("b"));
        }
        return map;
    }

}
