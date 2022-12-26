package recursiveAndTreeAndGraph;

import java.util.Scanner;

public class G1_RecursiveFunction {

    public static void main(String[] args) {
        G1_RecursiveFunction T = new G1_RecursiveFunction();
        T.DFS(3);
    }

    private void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n - 1);
            System.out.println(n);
        }

    }
}
