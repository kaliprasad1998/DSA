package org.java101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/count-items-matching-a-rule/
class CountItems_Leet {
    public static void main(String[] args) {
        List<List<String>> input = new ArrayList<>();
        List<String> list1 = Arrays.asList("phone", "blue", "pixel");
        List<String> list2 = Arrays.asList("computer", "silver", "lenovo");
        List<String> list3 = Arrays.asList("phone", "gold", "iphone");
        input.add(list1);
        input.add(list2);
        input.add(list3);

        int out = countMatches(input, "color", "silver");
        System.out.println(out);

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            boolean check = checkRule(items.get(i), ruleKey, ruleValue);
            if (check) {
                count++;
            }

        }
        return count;
    }

    public static boolean checkRule(List<String> list, String ruleKey, String ruleValue) {
        if (ruleKey.equals("type")) {
            if (list.get(0).equals(ruleValue)) {
                return true;
            }
        }
        if (ruleKey.equals("color")) {
            if (list.get(1).equals(ruleValue)) {
                return true;
            }
        }
        if (ruleKey.equals("name")) {
            if (list.get(2).equals(ruleValue)) {
                return true;
            }
        }
        return false;
    }
}