class Solution {
    public List<List<Integer>> generate(int numRows) {

        List <List<Integer>> resultSet = new ArrayList<>();

        for(int i=1; i<=numRows; i++) {

            resultSet.add(getRow(i));
        }

        return resultSet;


    }







        public List<Integer> getRow(int rowNumber) {
            long ans = 1;

            List<Integer> result = new ArrayList<>();
            result.add(1);

            for(int i=1; i<rowNumber; i++) {
                ans = ans * (rowNumber - i);
                ans = ans/i;

                result.add((int)ans);
            }

            return result;
        }
        
    
}