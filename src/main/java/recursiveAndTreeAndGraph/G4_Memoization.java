package recursiveAndTreeAndGraph;

/*
* 피보나치 수열
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는
수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면
된다.
▣ 입력설명
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
▣ 출력설명
첫 줄에 피보나치 수열을 출력합니다.
▣ 입력예제 1
10
▣ 출력예제 1
1 1 2 3 5 8 13 21 34 55
* */
public class G4_Memoization {
    static int[] fibonacci;
    public int DFS(int n) {
        if(fibonacci[n] > 0) return fibonacci[n];
        if(n == 1) return fibonacci[n] = 1;
        else if(n == 2) return fibonacci[n] = 1;
        else return fibonacci[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        G4_Memoization T = new G4_Memoization();
        int n = 45;
        fibonacci = new int[n + 1];
        T.DFS(n);
        for(int i = 1; i <= n; i++) System.out.print(fibonacci[i] + " ");

        System.out.println();
        long finish = System.currentTimeMillis();
        long timeMs = finish - start;
        System.out.println("timeMs = " + timeMs + "ms");
    }

//    public int DFS(int n) {
//        if(n == 1) return 1;
//        else if(n == 2) return 1;
//        else return DFS(n - 2) + DFS(n - 1);
//    }
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//
//        G4_Memoization T = new G4_Memoization();
//        int n = 45;
//        for(int i = 1; i < n; i++) {
//            System.out.print(T.DFS(i) + " ");
//        }
//
//        System.out.println();
//        long finish = System.currentTimeMillis();
//        long timeMs = finish - start;
//        System.out.println("timeMs = " + timeMs + "ms");
//    }
}
