package recursiveAndTreeAndGraph;

class Node2 {
    int data;
    Node2 lt, rt;
    public Node2(int val) {
        data = val;
        lt = rt = null;
    }
}
public class Main {
    Node2 root;
    public void DFS(Node2 root) {
        if(root == null) return;
        else {
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data + " ");
        }

    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.DFS(tree.root);
    }
}
