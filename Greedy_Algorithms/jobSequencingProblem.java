package Greedy_Algorithms;
import java.util.*;


public class jobSequencingProblem {

    static class Job {
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {5, 30}};
        Job[] jobs = new Job[jobsInfo.length];
        for (int i = 0; i < jobs.length; i++) {
            jobs[i] = new Job(i, jobsInfo[i][0], jobsInfo[i][1]);
        }
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find max deadline to determine the number of slots
        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        int[] slots = new int[maxDeadline];
        Arrays.fill(slots, -1);
        int totalProfit = 0;
        int countJobs = 0;

        for (Job job : jobs) {
            // Find a free slot for this job (starting from the last possible slot)
            for (int j = job.deadline - 1; j >= 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = job.id;
                    totalProfit += job.profit;
                    countJobs++;
                    break;
                }
            }
        }

        System.out.println("Max jobs: " + countJobs);
        System.out.println("Total profit: " + totalProfit);
    }
}
