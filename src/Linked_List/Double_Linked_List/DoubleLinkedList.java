package Linked_List.Double_Linked_List;

public class DoubleLinkedList<T> {
    private DoubleListNode head;

    public DoubleLinkedList() {
        head = null;
    }

    public int length() {
        int count = 0;
        DoubleListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getNextLink();
            count++;
        }
        return count;
    }

    public void showList() {
        DoubleListNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.toString());
            currentNode = currentNode.getNextLink();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }

    public void addLeftNode(T data) {
        DoubleListNode<T> currentNode = head;
        head = new DoubleListNode<T>(data, currentNode, null);
        currentNode.setPreviousLink(head);
    }

    public void addRightNode(T data) {
        DoubleListNode<T> currentNode = head;
        DoubleListNode<T> newNode = new DoubleListNode<T>(data, null, currentNode);
        if (currentNode == null)
            currentNode = newNode;
        else {
            while (currentNode.getNextLink() != null) {
                currentNode = currentNode.getNextLink();
            }
            currentNode.setNextLink(newNode);
            newNode.setPreviousLink(currentNode);
        }
    }

    public void deleteLeftNode() {
        DoubleListNode currentNode = head;
        if (currentNode == null)
            System.out.println("The list is empty");
        else {
            currentNode = currentNode.getNextLink();
            currentNode.setPreviousLink(null);
        }
    }

    public void deleteRightNode() {
        DoubleListNode currentNode = head;
        if (currentNode == null)
            System.out.println("The list is empty");
        else {
            if (currentNode.getNextLink() == null)
                currentNode = null;
            else {
                while (currentNode.getNextLink() != null)
                    currentNode = currentNode.getNextLink();
                currentNode = currentNode.getPreviousLink();
                currentNode.setNextLink(null);
            }
        }
    }

    public void add(T data, int index) {
        if (index == 0)
            addLeftNode(data);
        else if (index == length() - 1)
            addRightNode(data);
        else if (index >= length())
            System.out.println("Invalid index");
        else {
            DoubleListNode newNode = new DoubleListNode(data, null, null);
            DoubleListNode currentNode = head;
            for (int i = 0; i < index; i++)
                currentNode = currentNode.getNextLink();

            DoubleListNode nextNode = currentNode.getNextLink();
            currentNode.setNextLink(newNode);
            newNode.setNextLink(nextNode);
            newNode.setPreviousLink(currentNode);
            if (nextNode != null)
                nextNode.setPreviousLink(newNode);
        }
    }

    public void delete(int index) {
        if (index == 0)
            deleteLeftNode();
        else if (index == length() - 1)
            deleteRightNode();
        else if (index >= length())
            System.out.println("Invalid index");
        else {
            DoubleListNode currentNode = head;
            for (int i = 0; i < index; i++)
                currentNode = currentNode.getNextLink();
            // currentNode is the element before the target element we wanna delete
            // exp: delete(3), the index of currentNode = 2

            DoubleListNode tempNode = currentNode.getNextLink(); // temp is the target element
            currentNode.setNextLink(tempNode.getNextLink());
            if (tempNode.getNextLink() != null)
                tempNode.getNextLink().setPreviousLink(currentNode);
            tempNode = null;


        }
    }
}
