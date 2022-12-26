package twoPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr1, arr2));
    }

    private ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {

        ArrayList<Integer> answer = new ArrayList<>();
        int pi = 0, pj = 0;

        while(pi < n && pj < m) {
            if (arr1[pi] < arr2[pj]) {
                answer.add(arr1[pi++]);
            } else {
                answer.add(arr2[pj++]);
            }
        }
        while(pi < n) answer.add(arr1[pi++]);
        while(pj < m) answer.add(arr2[pj++]);

        return answer;
    }
}
