class Solution {
    public int maximumLengthSubstring(String s) {

        HashMap<Character, Integer> count = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }

            while (count.get(ch) > 2) {

                char leftChar = s.charAt(left);

                count.put(leftChar, count.get(leftChar) - 1);

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}