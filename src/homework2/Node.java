package homework2;

public class Node implements Comparable<Node>{

    final int value;
    Node right;
    Node left;


    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public int compareTo(Node o) {
        return (this.value - o.value);
    }
}
