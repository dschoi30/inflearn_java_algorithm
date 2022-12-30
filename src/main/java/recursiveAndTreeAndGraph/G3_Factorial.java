package recursiveAndTreeAndGraph;

public class G3_Factorial {

    public static void main(String[] args) {
        G3_Factorial T = new G3_Factorial();
        System.out.println(T.DFS(5));
    }

    private int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n - 1);
    }
}

//        int answer = 1;
//        for(int i = n; i > 0; i--) {
//            answer *= i;
//        }
//        return answer;

