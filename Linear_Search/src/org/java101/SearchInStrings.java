package org.java101;

import java.util.Arrays;

public class SearchInStrings {

  public static void main(String[] args) {

    String name = "Prasad";
    char target = 'p';
    boolean out1 = search1(name, target);
    boolean out2 = search2(name,target);
    System.out.println(out1);
    System.out.println(out2);

  }

  static boolean search1(String s, char target) {
    if(s.length() == 0){
      return false;
    }

    for (char c : s.toLowerCase().toCharArray()) {
      if(c == target){
        return true;
      }
    }

    return false;
  }

  static boolean search2(String s, char target) {
    if(s.length() == 0){
      return false;
    }

    for (int i = 0; i < s.length() ; i++) {
      if(s.toLowerCase().charAt(i) == target){
        return true;
      }
    }

    return false;
  }

}
