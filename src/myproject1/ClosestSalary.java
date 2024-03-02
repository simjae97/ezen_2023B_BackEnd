package myproject1;

import java.util.ArrayList;

public class ClosestSalary {

    public static int findClosestSum(ArrayList<Integer>[] groups) {
        boolean[] dp = new boolean[6001];
        dp[0] = true;

        // 각 그룹에서 가능한 조합을 탐색하며 DP 배열 업데이트
        for (ArrayList<Integer> group : groups) {
            for (int i = 6000; i >= 0; i--) {
                if (dp[i]) {
                    for (int j = 0; j < group.size(); j++) {
                        for (int k = j + 1; k < group.size(); k++) {
                            int sum = group.get(j) + group.get(k);
                            if (i + sum <= 6000) {
                                dp[i + sum] = true;
                            }
                        }
                    }
                }
            }
        }

        // DP 배열을 탐색하여 최적해 찾기
        int targetSum = 0;
        for (int i = 3000; i <= 6000; i++) {
            if (dp[i] && Math.abs(6000 - targetSum) > Math.abs(6000 - i)) {
                targetSum = i;
            }
        }

        return targetSum;
    }

    public static void main(String[] args) {
        // 각 그룹별 숫자
        ArrayList<Integer> groupA = new ArrayList<>();
        groupA.add(500);
        groupA.add(1000);
        groupA.add(2000);
        groupA.add(2200);

        ArrayList<Integer> groupB = new ArrayList<>();
        groupB.add(500);
        groupB.add(500);
        groupB.add(500);
        groupB.add(500);

        ArrayList<Integer> groupC = new ArrayList<>();
        groupC.add(500);
        groupC.add(500);
        groupC.add(500);
        groupC.add(500);

        ArrayList<Integer>[] groups = new ArrayList[]{groupA, groupB, groupC};

        int result = findClosestSum(groups);
        System.out.println("최적해: " + result);
    }
}
