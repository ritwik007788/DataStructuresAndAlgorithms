//leetcode 118
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) return triangle;// if no rows then return empty list
        List<Integer> first_row = new ArrayList<>();//create the first row
        first_row.add(1);// first row is 1 
        triangle.add(first_row); // add the first row 
        
        for(int i = 1 ; i < numRows ; i++){ // iterate from the 2md row
            List<Integer> prev_row = triangle.get(i-1);// get the prev row
            List<Integer> row = new ArrayList<>();// this is the curr row
            
            row.add(1);//first element in any row is 1
            
            for(int j = 1 ; j < i ; j++){// the middle elements using the prev row
                int val = prev_row.get(j-1) + prev_row.get(j);
                row.add(val);
            }
            row.add(1);//last element in any row is 1
            triangle.add(row);//add to the answer list
        }
        return triangle;
    }
}
