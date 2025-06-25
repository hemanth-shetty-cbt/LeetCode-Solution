class Solution {
    public int lengthOfLongestSubstring(String s) {

        int right = 0, left = 0;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        int len = 0;

        while(right < n) {
            if(map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }

            map.put(s.charAt(right), right);
            len = Math.max(len, right - left +1);
            right ++;

        }
    return len;
    }
        
}