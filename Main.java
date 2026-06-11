// Ques 13. Roman to integer

import java.util.Scanner;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = hm.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                result -= hm.get(s.charAt(i));
            } else {
                result += hm.get(s.charAt(i));
            }
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String s = sc.nextLine().toUpperCase();

        Solution sol = new Solution();
        System.out.println("Integer value: " + sol.romanToInt(s));

        sc.close();
    }
}