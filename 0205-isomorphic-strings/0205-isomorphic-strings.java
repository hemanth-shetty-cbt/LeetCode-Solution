class Solution {
    public boolean isIsomorphic(String s, String t) {

     if(s.length() != t.length()) {
        return false;
     }

     HashMap<Character, Character> map = new HashMap<>();
     HashSet<Character> set = new HashSet<> ();

     for(int i=0 ;i<s.length(); i++) {

        char si =s.charAt(i);
        char ti =t.charAt(i);

        if(map.containsKey(si)) {
            if(!map.get(si).equals(ti)) {
                return false;
            }

        } else {
              if(set.contains(ti)) {
                return false;
              }
              map.put(si, ti);
              set.add(ti);
        }

     }

    return true; 
        
    }
}