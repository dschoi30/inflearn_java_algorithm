package recursiveAndTreeAndGraph;

public class G2_BinaryRecursive {

    public static void main(String[] args) {
        G2_BinaryRecursive T = new G2_BinaryRecursive();
        T.DFS(11);
    }

    private void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.println(n % 2 + " ");
        }
    }
}