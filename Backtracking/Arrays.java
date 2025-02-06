package Backtracking;
import java.util.*;
public class Arrays{
private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
result.add(new ArrayList<>(tempList));
for(int i = start; i < nums.length; i++){
tempList.add(nums[i]);
backtrack(result, tempList, nums, i + 1);
tempList.remove(tempList.size() - 1);
}
}

public static void main(String[] args){
int[] nums = {10, 20, 30};
List<List<Integer>> result = new ArrayList<>();
backtrack(result, new ArrayList<>(), nums, 0);
System.out.println(result);

}
}