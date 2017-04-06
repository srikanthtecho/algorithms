/**
 * Created by Lenovo on 06-04-2017.
 */
public class Test {

    static Node head = null;
    static Node prevNode = null;

    public static void main(String args[]) {
        createNode(1);
        createNode(2);
        createNode(3);
        createNode(4);
        System.out.println(getElementAtIndex(1));
    }

    private static Integer getElementAtIndex(final int index) {

        for (int i = 0; i < index; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        if (head == null) {
            return null;
        } else {
            return head.data;
        }
    }

    private static Node createNode(int data) {

        final Node newNode = new Node();
        newNode.data = data;

        if (prevNode == null) {
            head = newNode;
            prevNode = newNode;
        } else {
            prevNode.next = newNode;
            prevNode = newNode;
        }
        return prevNode;
    }
}

class Node {
    int data;
    Node next;
}
