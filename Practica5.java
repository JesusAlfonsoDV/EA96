import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    Lis<Boolean>kidsWithCandies(List<integer>candies, int extraCandies){
    List<Boolean>result=newArrayList<>();
        int greatest=0;
        for(int i=0;i<candies.size();i++){
            if(greatest<=candies.get(i)){
                greatest=candies.get(i);
            }
        }
    for(int i=0; i<candies.size; i++){
        result.add(candies.get(i)+extraCandies>=greatest);
    }
    return result;
    }
}