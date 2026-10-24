class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies = candies[0];
        for(int i =1;i<candies.length;i++){

        if(maxcandies<candies[i]){
            maxcandies= candies[i];
        }
        }
        List<Boolean> result =new ArrayList<>();

        for(int i =0;i<candies.length;i++){
            if(candies[i]+extraCandies>= maxcandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
return result;
        }
      
    }
