package homework2;

public class Tree {

    Node root;
    int i;
    boolean resultSearch2;

    void buildTree(int[] arr) {
        for (int element : arr) {
            add(element);
        }
    }

    void add(int x) {
        Node newNode = new Node(x);
        if (root == null) {
            this.root = newNode;
        } else {
            add(newNode, root);
        }
    }

    void add(Node newNode, Node node) {
        if (newNode.value >= node.value) {
            if (node.right == null) {
                node.right = newNode;
            } else {
                add(newNode, node.right);
            }
        } else {
            if (node.left == null) {
                node.left = newNode;
            } else {
                add(newNode, node.left);
            }
        }
    }

    void printAll() {
        if (root == null) {
            System.out.println("tree is empty");
        } else {
            print(root);
        }
    }

    void print(Node node) {
        if (node.left != null) {
            print(node.left);
        }
        System.out.println(node.value);
        if (node.right != null) {
            print(node.right);
        }
    }

    boolean countaint(int v) {
        int k = 0;
        if (root != null) {
            i = 0;
            k = search(root, v);
        }
        return k > 0;
    }

    int count(int v) {
        int k = 0;
        if (root != null) {
            i = 0;
            k = search(root, v);
        }
        return k;

    }

    int search(Node node, int v) {
        if (node.value == v) {
            i++;
            if (node.right != null) {
                search(node.right, v);
            }
        } else {
            if (v > node.value) {
                if (node.right != null) {
                    search(node.right, v);
                }
            } else {
                if (node.left != null) {
                    search(node.left, v);
                }

            }

        }

        return i;
    }

    boolean countaint2(int v) {
        boolean result = false;
        Node x = new Node(v);
        if (root != null) {
            result = search2(root, x);
        }
        return result;
    }

    boolean search2(Node nodeN, Node nodeX) {

        if (nodeX.compareTo(nodeN) == 0) {
            resultSearch2 = true;
        }
        if ((nodeX.compareTo(nodeN) > 0) && (nodeN.right != null)) {
            search2(nodeN.right, nodeX);
        } else {
            if ((nodeX.compareTo(nodeN) < 0) && (nodeN.left != null)) {
                search2(nodeN.left, nodeX);
            }
        }
        return resultSearch2;
    }


    public static void main(String[] args) {

        int[] arr = new int[]{4, 6, 2, 4, 5, 4, 1, 0, 7, 4, 5, 4};
        Tree tree = new Tree();
        tree.buildTree(arr);
        tree.printAll();
        System.out.println(tree.countaint(3));
        System.out.println(tree.count(4));
        System.out.println(tree.countaint2(1));
    }
}