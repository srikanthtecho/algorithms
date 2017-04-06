import java.util.Scanner;

/**
 * Created by srikanth on 06-04-2017.
 */
public class BST {

    static Node root = null;
    static int counter = 0;
    static Node head = null;

    public static void main(String args[]) {
        final Scanner input = new Scanner(System.in);
        final int totalKeys = input.nextInt();

        final int keys[] = new int[totalKeys];

        for (int i = 0; i < totalKeys; i++) {
            keys[i] = input.nextInt();
        }
        for (int i = 0; i < totalKeys; i++) {
            root = insertNode(root, new Node(keys[i]));
        }
    }

    private static Node insertNode(Node currentParent, Node newNode) {

        if (currentParent == null) {
            System.out.println(counter);
            currentParent = newNode;
        } else if (newNode.key > currentParent.key) {
            counter++;
            currentParent.rightNode = insertNode(currentParent.rightNode, newNode);
        } else if (newNode.key < currentParent.key) {
            counter++;
            currentParent.leftNode = insertNode(currentParent.leftNode, newNode);
        }
        return currentParent;
    }

}

class Node {
    int key;
    Node leftNode;
    Node rightNode;

    public Node(int key) {
        this.key = key;
    }
}