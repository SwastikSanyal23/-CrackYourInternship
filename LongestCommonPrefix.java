
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = new String[]{"flower", "flow", "flight"};
        String s = Solution.longestCommonPrefix(arr);
        System.out.println(s);  // Print the result
    }
}

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        StringBuilder sbr = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length - 1];
        int length = Math.min(first.length(), last.length());

        for (int i = 0; i < length; i++) {
            if (first.charAt(i) == last.charAt(i)) {
                sbr.append(first.charAt(i));
            } else {
                break;
            }
        }

        return sbr.toString();
    }
}
