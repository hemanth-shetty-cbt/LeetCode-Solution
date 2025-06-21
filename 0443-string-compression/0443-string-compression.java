class Solution {
    public int compress(char[] chars) {

     int i = 0,write = 0;
     char ele;
     int n = chars.length;
      
     while (i < n) {

        int count = 1;
         ele = chars[i];

    // check all the availablity;
     while(i +1 < chars.length && chars[i + 1] == ele ) {
          count ++;
          i++;
     }

     chars[write++] = ele;

      if(count > 1) {
        String str = String.valueOf(count);

        for(char c: str.toCharArray()) {
            chars[write++] = c;
        }
      }

      i++;
    }
    return write;
    }
}