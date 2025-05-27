package Greedy_Algorithms;
import java.util.*;

public class activity_selection {

    public static void selectActivities(int start[], int finish[], int n) {
       
    }
    public static void main(String[] args){
        int start[] = {1, 3, 0, 5, 8,5};
        int finish[] = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        
        int maxAct = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0); // The first activity is always selected
        int lastEnd = finish[0];

        for(int i = 1; i < n; i++){
            if(start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = finish[i];
            }
        }

        System.out.println("Maximum number of activities that can be selected: " + maxAct);
        System.out.print("Selected activities: ");
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }

    }
    
}
